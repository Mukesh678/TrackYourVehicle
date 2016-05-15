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
         Bundle output= fragment.getArguments();
        int total_trip_distance=output.getInt("total_trip_distance");
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

       /* bundle.putInt("total_trip_distance",total_trip_distance);
        bundle.putInt("total_load_carried",total_load_carried);
        bundle.putInt("cost_maintenance_km_year",cost_maintenance_km_year);
        bundle.putInt("cost_running_year",cost_running_year);
        bundle.putInt("cost_maintenance_year",cost_maintenance_year);
        bundle.putInt("distance_year",distance_year);
        bundle.putInt("fuel_cost_year",fuel_cost_year);
        bundle.putInt("trip_mileage",trip_mileage);
        bundle.putInt("distance_month",distance_month);
        bundle.putInt("payload_tons_year",payload_tons_year);
        bundle.putInt("total_load_trip",total_load_trip);
        bundle.putInt("total_tons_km_year",total_tons_km_year);
        bundle.putInt("total_freight_earned_year",total_freight_earned_year);
*/
        if (savedInstanceState!=null){
            String total_trip_distance=(savedInstanceState.getString("total_trip_distance",null));
        }
        return view;
    }

}
