package com.example.mukesh.trackyourvehicle;


import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatDialogFragment;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;

/*import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;*/

public abstract class FragmentOrganizer {

    protected FragmentManager fragmentManager;

    protected FragmentOrganizer(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
        openFragment(getInitialFragment());
//        LocalBroadcastManager.getInstance(this).registerReceiver();
    }

    protected abstract Fragment getInitialFragment();
//    protected abstract void onEvent(Object event);
    public abstract boolean handleBackNavigation();
//
//    public void freeUpResources(){
//       bus.unregister(this);
//    }



    protected Fragment getOpenFragment(){
        String tag = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() -1).getName();
        return fragmentManager.findFragmentByTag(tag);
    }


    protected boolean isFragmentOpen(Fragment fragment){
        return isFragmentOpen(fragment, true);
    }

    protected boolean isFragmentOpen(Fragment fragment, boolean useArgs){
        String fragmentTag = createFragmentTag(fragment, useArgs);

        if (fragmentManager.getBackStackEntryCount() != 0)
        {
            String name = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName();

            if(!useArgs)
                name = name.substring(0, name.indexOf("-"));

                return name.equals(fragmentTag);
        }
        return false;
    }


    protected String createFragmentTag(Fragment fragment, boolean addArgs) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fragment.getClass().getSimpleName());
        if(addArgs) {
            stringBuilder.append("-");
            if (fragment.getArguments() != null)
                stringBuilder.append(fragment.getArguments().toString());
        }
        return stringBuilder.toString();
    }

    protected void openFragment(Fragment fragment) {
        if(isFragmentOpen(fragment))
            return;

        String fragmentTag = createFragmentTag(fragment, true);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.setCustomAnimations(R.animator.card_flip_right_in, R.animator.card_flip_right_out,
//                R.animator.card_flip_left_in, R.animator.card_flip_left_out);
//        transaction.setCustomAnimations(R.anim.new_open_scale, R.anim.new_close_scale,
//                R.anim.new_open_translate, R.anim.new_close_transtale);
        transaction.replace(R.id.main_content, fragment, fragmentTag);
        transaction.addToBackStack(fragmentTag).commit();

    }

    public void openFragmentWithTransition(Fragment fragmentCurrent, Fragment fragmentNext, View sharedElement) {
        if(isFragmentOpen(fragmentNext))
            return;

        String fragmentTag = createFragmentTag(fragmentNext, true);
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if(sharedElement!=null  && Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {
            Transition changeTransform = TransitionInflater.from(TruckApplication.getAppContext()).
                    inflateTransition(R.transition.trsns_shared_element);
            Transition explodeTransform = TransitionInflater.from(TruckApplication.getAppContext()).
                    inflateTransition(android.R.transition.explode);

            // Setup exit transition on first fragment
            fragmentCurrent.setSharedElementReturnTransition(changeTransform);
            fragmentCurrent.setExitTransition(explodeTransform);

            // Setup enter transition on second fragment
            fragmentNext.setSharedElementEnterTransition(changeTransform);
            fragmentNext.setEnterTransition(explodeTransform);
            transaction.addSharedElement(sharedElement,sharedElement.getTransitionName());
        }
        else
            transaction.setCustomAnimations(R.anim.new_open_scale, R.anim.new_close_transtale,
                    R.anim.new_open_translate, R.anim.new_close_scale);
//            transaction.setCustomAnimations(R.animator.card_flip_right_in, R.animator.card_flip_right_out,
//                    R.animator.card_flip_left_in, R.animator.card_flip_left_out);

        transaction.replace(R.id.main_content, fragmentNext, fragmentTag);
        transaction.addToBackStack(fragmentTag).commit();
        
    }

    public void openDialogFragmentWithTransition(Fragment fragmentCurrent, AppCompatDialogFragment fragmentNext, View sharedElement) {
        if(isFragmentOpen(fragmentNext))
            return;

        String fragmentTag = createFragmentTag(fragmentNext, true);
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if(sharedElement!=null  && Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {
            Transition changeTransform = TransitionInflater.from(TruckApplication.getAppContext()).
                    inflateTransition(R.transition.trsns_shared_element);
            Transition explodeTransform = TransitionInflater.from(TruckApplication.getAppContext()).
                    inflateTransition(android.R.transition.explode);

            // Setup exit transition on first fragment
            fragmentCurrent.setSharedElementReturnTransition(changeTransform);
            fragmentCurrent.setExitTransition(explodeTransform);

            // Setup enter transition on second fragment
            fragmentNext.setSharedElementEnterTransition(changeTransform);
            fragmentNext.setEnterTransition(explodeTransform);
            transaction.addSharedElement(sharedElement,sharedElement.getTransitionName());
        }

        transaction.replace(R.id.main_content, fragmentNext, fragmentTag);
        fragmentNext.setShowsDialog(true);
        //fragmentNext.show(transaction,fragmentTag);
        transaction.addToBackStack(fragmentTag).commit();

    }
    protected void clearBackStack()
    {
            String name=fragmentManager.getBackStackEntryAt(1).getName();
            fragmentManager.popBackStack(name, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}