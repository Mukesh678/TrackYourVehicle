package com.example.mukesh.trackyourvehicle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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
    private EditText et_payload_one ,et_payload_two;
    private EditText et_OJPay_one ,et_OJPay_two;
    private EditText et_RJPay_one ,et_RJPay_two;
    private EditText et_distance_with_loadOJ_one ,et_distance_with_loadOJ_two;
    private EditText et_distance_with_loadRJ_one ,et_distance_with_loadRJ_two;
    private EditText et_distance_withoutLoad_one ,et_distance_withoutLoad_two;
    private EditText et_tripPerMonth_one ,et_tripPerMonth_two;
    private EditText et_operativeMonth_one ,et_operativeMonth_two;
    private EditText et_Mileage_With_Load_OJ_one ,et_Mileage_With_Load_OJ_two;
    private EditText et_Mileage_With_Load_RJ_one ,et_Mileage_With_Load_RJ_two;
    private EditText et_Mileage_Without_Load_one ,et_Mileage_Without_Load_two;
    private EditText et_FuelPrice_one ,et_FuelPrice_two;
    private EditText et_VehiclePrice_one ,et_VehiclePrice_two;
    private EditText et_body_build_cost_one ,et_body_build_cost_two;
    private EditText et_tenure_in_month_one ,et_tenure_in_month_two;
    private EditText et_interest_rate_one ,et_interest_rate_two;
    private EditText et_freight_rate_per_ton_per_km_forward_journey_one ,et_freight_rate_per_ton_per_km_forward_journey_two;
    private EditText et_freight_rate_per_ton_per_km_return_journey_one ,et_freight_rate_per_ton_per_km_return_journey_two;


   private GridLayout gridlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST","esp");

     gridlayout= (GridLayout) findViewById(R.id.gridlayout);

     ArrayList<EditText> myEditTextList = new ArrayList<EditText>();

     for( int i = 0; i < gridlayout.getChildCount(); i++ ){
      if( gridlayout.getChildAt( i ) instanceof EditText ){
       myEditTextList.add( (EditText) gridlayout.getChildAt( i ) );
     Log.e("ID :", gridlayout.getChildAt( i )+"");}}
    }
}
