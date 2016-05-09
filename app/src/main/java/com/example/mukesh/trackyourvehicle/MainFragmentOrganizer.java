package com.example.mukesh.trackyourvehicle;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public class MainFragmentOrganizer extends FragmentOrganizer {

    public MainFragmentOrganizer(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    protected Fragment getInitialFragment() {
        return InputFragment.newInstance();
    }

    public void openFragment(Fragment frag)
    {
        super.openFragment(frag);
    }
    public void clearBackStack()
    {
        super.clearBackStack();
    }
    public Fragment getOpenFragment()
    {
        return super.getOpenFragment();
    }


    @Override
    public boolean handleBackNavigation(){
        Fragment fragment = getOpenFragment();


        if (fragment instanceof InputFragment){
            return false;
        }

        else
        {
            return removeFromBackStack();
        }
    }

    public boolean removeFromBackStack()
    {

        boolean flag=   fragmentManager.popBackStackImmediate();
        Log.d("BACK",""+flag);

        return flag;
    }
}

