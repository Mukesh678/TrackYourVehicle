package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity
{

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
    @BindView(R.id.btn_submit)
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_submit)
    public void submit(View view )
    {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }


    @OnTextChanged({R.id.et_body_build_cost_one,R.id.et_body_build_cost_two})
    public void onTextChanged(CharSequence text) {
        Toast.makeText(this, "Text changed: " + text, Toast.LENGTH_SHORT).show();
    }
}
