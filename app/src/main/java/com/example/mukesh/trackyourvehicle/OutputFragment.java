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

//    Result Page
//
//            1.	Increase in operating profit for 5 years = increase in Operating Profit x 5 – Rs.441814
//            2.	Increase in Operating Profit per year = OP1 – OP2 – Rs.88363
//            3.	Operating Profit per year = (Freight Earned per year) – (Operating Cost per year) – Rs.1967436
//            4.	Operating Cost per year = Finance cost per year + Total running cost per year + Total fixed cost per year. - Rs.1967436


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
