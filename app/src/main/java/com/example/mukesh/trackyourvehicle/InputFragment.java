package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

/**
 * Created by MUKESH on 5/8/2016.
 */
public class InputFragment extends BaseFragment {

           /* 1.	Payload in tons – Manual entry – 20.0 Tons
    2.	OJ Pay load – Manual entry – 20.0 Tons
    3.	RJ pay load – Manual entry – 0.0 Tons
    4.	Distance with load OJ – Manual entry – 75.0 Tons
    5.	Distance with load RJ – Manual entry – 0.0 Tons
    6.	Distance without load – Manual entry – 75.0 Tons
    7.	Number of trips per month – Manual entry – 65.0
            8.	Operative month – Manual entry - 11
            9.	Mileage with load OJ – Manual entry – 3.80 kmpl
    10.	Mileage with load RJ – Manual entry – 0.0 kmpl
    11.	Mileage without load – manual entry – 4.50 kmpl
    12.	Fuel price - Manual entry – Rs.55.00
            13.	Vehicle price – Manual entry – Rs.0.00
            14.	Body build cost – Manual entry – Rs.0.00
            15.	Tenure in month – Manual entry - 47
            16.	Interest rate – Manual entry – 5.5%
            17.	Freight rate per ton per km forward journey – Manual entry – Rs.0.00
            18.	Freight rate per ton per km return journey – Manual entry – Rs.0.00
*/


    private View view;

    @BindView(R.id.et_payload_one)
    EditText etPayloadOne;
    @BindView(R.id.et_payload_two)
    EditText etPayloadTwo;
    @BindView(R.id.et_OJPay_one)
    EditText etOJPayOne;
    @BindView(R.id.et_OJPay_two)
    EditText etOJPayTwo;
    @BindView(R.id.et_RJPay_one)
    EditText etRJPayOne;
    @BindView(R.id.et_RJPay_two)
    EditText etRJPayTwo;
    @BindView(R.id.et_distance_with_loadOJ_one)
    EditText etDistanceWithLoadOJOne;
    @BindView(R.id.et_distance_with_loadOJ_two)
    EditText etDistanceWithLoadOJTwo;
    @BindView(R.id.et_distance_with_loadRJ_one)
    EditText etDistanceWithLoadRJOne;
    @BindView(R.id.et_distance_with_loadRJ_two)
    EditText etDistanceWithLoadRJTwo;
    @BindView(R.id.et_distance_withoutLoad_one)
    EditText etDistanceWithoutLoadOne;
    @BindView(R.id.et_distance_withoutLoad_two)
    EditText etDistanceWithoutLoadTwo;
    @BindView(R.id.et_tripPerMonth_one)
    EditText etTripPerMonthOne;
    @BindView(R.id.et_tripPerMonth_two)
    EditText etTripPerMonthTwo;
    @BindView(R.id.et_operativeMonth_one)
    EditText etOperativeMonthOne;
    @BindView(R.id.et_operativeMonth_two)
    EditText etOperativeMonthTwo;
    @BindView(R.id.et_Mileage_With_Load_OJ_one)
    EditText etMileageWithLoadOJOne;
    @BindView(R.id.et_Mileage_With_Load_OJ_two)
    EditText etMileageWithLoadOJTwo;
    @BindView(R.id.et_Mileage_With_Load_RJ_one)
    EditText etMileageWithLoadRJOne;
    @BindView(R.id.et_Mileage_With_Load_RJ_two)
    EditText etMileageWithLoadRJTwo;
    @BindView(R.id.et_Mileage_Without_Load_one)
    EditText etMileageWithoutLoadOne;
    @BindView(R.id.et_Mileage_Without_Load_two)
    EditText etMileageWithoutLoadTwo;
    @BindView(R.id.et_FuelPrice_one)
    EditText etFuelPriceOne;
    @BindView(R.id.et_FuelPrice_two)
    EditText etFuelPriceTwo;
    @BindView(R.id.et_VehiclePrice_one)
    EditText etVehiclePriceOne;
    @BindView(R.id.et_VehiclePrice_two)
    EditText etVehiclePriceTwo;
    @BindView(R.id.et_body_build_cost_one)
    EditText etBodyBuildCostOne;
    @BindView(R.id.et_body_build_cost_two)
    EditText etBodyBuildCostTwo;
    @BindView(R.id.et_tenure_in_month_one)
    EditText etTenureInMonthOne;
    @BindView(R.id.et_tenure_in_month_two)
    EditText etTenureInMonthTwo;
    @BindView(R.id.et_interest_rate_one)
    EditText etInterestRateOne;
    @BindView(R.id.et_interest_rate_two)
    EditText etInterestRateTwo;
    @BindView(R.id.et_freight_rate_per_ton_per_km_forward_journey_one)
    EditText etFreightRatePerTonPerKmForwardJourneyOne;
    @BindView(R.id.et_freight_rate_per_ton_per_km_forward_journey_two)
    EditText etFreightRatePerTonPerKmForwardJourneyTwo;
    @BindView(R.id.et_freight_rate_per_ton_per_km_return_journey_one)
    EditText etFreightRatePerTonPerKmReturnJourneyOne;
    @BindView(R.id.et_freight_rate_per_ton_per_km_return_journey_two)
    EditText etFreightRatePerTonPerKmReturnJourneyTwo;
    @BindView(R.id.et_maintenance_cost_per_km_one)
    EditText etMaintenanceCostPerKmOne;
    @BindView(R.id.et_maintenance_cost_per_km_two)
    EditText etMaintenanceCostPerKmTwo;
    @BindView(R.id.btn_submit)
    Button btn_submit;

    private int total_trip_distance,total_load_carried,cost_maintenance_km_year,cost_running_year,cost_maintenance_year,distance_year
            ,fuel_cost_year,trip_mileage,distance_month,payload_tons_year,total_load_trip,total_tons_km_year,total_freight_earned_year;
    public static InputFragment newInstance() {
        InputFragment fragment = new InputFragment();
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        if(view==null)
        {
            view=inflater.inflate(R.layout.frag_input,container,false);
            ButterKnife.bind(this,view);

        }
        return view;
    }


    @OnClick(R.id.btn_submit)
    public void submit()
    {
        Toast.makeText(mActivity, "clicked", Toast.LENGTH_SHORT).show();
        calculateValues();
try {

}catch (Exception e){
e.printStackTrace();
}
        Bundle bundle=new Bundle();
        bundle.putInt("total_trip_distance",total_trip_distance);
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

        OutputFragment fragment = new OutputFragment();
        fragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_content,fragment,"outputfragment").commit();


    }

    /*1.	Payload in tons – Manual entry – 20.0 Tons
    2.	OJ Pay load – Manual entry – 20.0 Tons
    3.	RJ pay load – Manual entry – 0.0 Tons
    4.	Distance with load OJ – Manual entry – 75.0 Tons
    5.	Distance with load RJ – Manual entry – 0.0 Tons
    6.	Distance without load – Manual entry – 75.0 Tons
    7.	Number of trips per month – Manual entry – 65.0
    8.	Operative month – Manual entry - 11
    9.	Mileage with load OJ – Manual entry – 3.80 kmpl
    10.	Mileage with load RJ – Manual entry – 0.0 kmpl
    11.	Mileage without load – manual entry – 4.50 kmpl
    12.	Fuel price - Manual entry – Rs.55.00
    13.	Vehicle price – Manual entry – Rs.0.00
    14.	Body build cost – Manual entry – Rs.0.00
    15.	Tenure in month – Manual entry - 47
    16.	Interest rate – Manual entry – 5.5%
    17.	Freight rate per ton per km forward journey – Manual entry – Rs.0.00
    18.	Freight rate per ton per km return journey – Manual entry – Rs.0.00
    19. Maintenance cost per km - Rs. 20.00



    Background Calculations
    1.	Total trip distance = distance with load OJ + distance with load RJ + distance without load – 150.0 Tons
    2.	Total load carried per trip = OJ load + RJ load – 20.0 Tons
    3.	Cost of maintenance per km per year = maintenance cost per year / total distance per year – Rs.0.90
    4.	Running Cost per year = (Fuel cost + Maintenance cost) per year – Rs.1, 802,436
    5.	Maintenance cost per year = cost of maintenance per km x distance per year – Rs.96, 525
    6.	Distance per year = No of trips per year x distance per trip – 107250 kms
    7.	Fuel cost per year = fuel price x [(distance per year) / trip mileage per km] – Rs.1301425
    8.	Trip mileage = total trip distance/ [(trip distance with load/mileage with load) + (Distance without load/mileage without load)] – 4.1KMPL
    9.	Distance per month = No of trips in month x distance per trip – 9750 kms
    10.	Payload in tons per year = total load per trip x trip per year – 14300 Tons
    11.	Total load per trip = onward load + return load – 20.0 Tons
    12.	Total ton-km per year = [[(onward journey load x onward distance) + (return journey load x return distance)] x No of trips in month x No of months] - 1072500
    13.	Total freight earned per year = [(Freight rate per ton per km OJ x load OJ x OJ Distance with load) + (Freight rate per ton per km x Load RJ x RJ Distance with load)] x number of trips per year. – Rs.0.00
*/
    private void calculateValues()
    {

        total_trip_distance= TripCalculate.getTotalTripDistance(getNumber(etDistanceWithLoadOJOne),getNumber(etDistanceWithLoadRJOne),getNumber(etDistanceWithoutLoadOne));
        total_load_carried=TripCalculate.getTotalLoadPerTrip(getNumber(etOJPayOne),getNumber(etRJPayOne));
        cost_maintenance_km_year=TripCalculate.getMaintenanceCostPerKmPerYear(getNumber(etMaintenanceCostPerKmOne),total_trip_distance);

        cost_running_year=TripCalculate.getRunningCostPerYear(getNumber(etFuelPriceOne),cost_maintenance_km_year);
        cost_maintenance_year=TripCalculate.getMaintenanceCostPerYear(cost_maintenance_km_year,total_trip_distance);
        distance_year=TripCalculate.getDiatancePerYear(getNumber(etTripPerMonthOne)*11,total_trip_distance);
        fuel_cost_year=TripCalculate.getFuelCostPerYear(getNumber(etFuelPriceOne),distance_year,getNumber(etTripPerMonthOne));

        int milage_with_load=getNumber(etMileageWithLoadOJOne)+getNumber(etMileageWithLoadRJOne);
        int trip_distance_with_load=total_trip_distance-getNumber(etDistanceWithoutLoadOne);

        trip_mileage=TripCalculate.getTripMileage(total_trip_distance,trip_distance_with_load,milage_with_load,getNumber(etDistanceWithoutLoadOne),getNumber(etMileageWithoutLoadOne));

        distance_month=TripCalculate.getDistancePerMonth(getNumber(etTripPerMonthOne),total_trip_distance);
        payload_tons_year=TripCalculate.getPayLoadInTonsPerYear(total_load_carried,total_trip_distance);
        total_load_trip=TripCalculate.getTotalLoadPerTrip(getNumber(etOJPayOne),getNumber(etRJPayOne));
        total_tons_km_year=TripCalculate.getTotalTonKmPerYear(getNumber(etOJPayOne),getNumber(etDistanceWithLoadOJOne),getNumber(etDistanceWithLoadRJOne),getNumber(etDistanceWithLoadRJOne),getNumber(etTripPerMonthOne),11);
        total_freight_earned_year=TripCalculate.getTotalFreightEarnedPerYear(getNumber(etFreightRatePerTonPerKmForwardJourneyOne),getNumber(etOJPayOne),getNumber(etDistanceWithLoadRJOne),getNumber(etTripPerMonthOne),getNumber(etPayloadOne),getNumber(etDistanceWithLoadRJOne),getNumber(etTripPerMonthOne)*11);

        Log.i("total_trip_distance",total_trip_distance+"");
        Log.i("total_load_carried",total_load_carried+"");
        Log.i("cost_maintnce_km_year",cost_maintenance_km_year+"");
        Log.i("cost_running_year",cost_running_year+"");
        Log.i("cost_maintenance_year",cost_maintenance_year+"");
        Log.i("distance_year",distance_year+"");
        Log.i("fuel_cost_year",fuel_cost_year+"");
        Log.i("trip_mileage",trip_mileage+"");
        Log.i("distance_month",distance_month+"");
        Log.i("payload_tons_year",payload_tons_year+"");
        Log.i("total_load_trip",total_load_trip+"");
        Log.i("total_tons_km_year",total_tons_km_year+"");
        Log.i("total_freht_earned_year",total_freight_earned_year+"");


    }

    private int getNumber(EditText editText)
    {
        int number= Integer.parseInt(editText.getText().toString());

        return number;
    }

    @OnTextChanged({R.id.et_body_build_cost_one,R.id.et_body_build_cost_two})
    public void onTextChanged(CharSequence text) {
        Toast.makeText(mActivity, "Text changed: " + text, Toast.LENGTH_SHORT).show();
    }
}
