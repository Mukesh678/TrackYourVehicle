package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by ViRus on 5/9/2016.
 */
public class OutputFragment extends BaseFragment {

    private View view;


    public static OutputFragment newInstance() {
        OutputFragment fragment = new OutputFragment();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        if(view==null)
        {
            view=inflater.inflate(R.layout.frag_output,container,false);
            ButterKnife.bind(this,view);

        }
        return view;
    }

}
