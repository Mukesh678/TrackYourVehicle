package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;

public abstract class BaseFragment extends Fragment
{
    protected MainActivity mActivity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity= (MainActivity) getActivity();
    }
    protected void openFragment(Fragment frag)
    {
        mActivity.getFrag_organizer().openFragment(frag);
    }
    protected void openFragmentWithTransition(Fragment fragOne, Fragment fragTwo, View sharedElement)
    {
        mActivity.getFrag_organizer().openFragmentWithTransition(fragOne,fragTwo,sharedElement);
    }

    protected void openDialogFragmentWithTransition(Fragment fragOne, AppCompatDialogFragment fragTwo, View sharedElement)
    {
        mActivity.getFrag_organizer().openDialogFragmentWithTransition(fragOne,fragTwo,sharedElement);
    }
    protected void popFragmentFromQueue()
    {
        mActivity.getFrag_organizer().removeFromBackStack();
    }
}
