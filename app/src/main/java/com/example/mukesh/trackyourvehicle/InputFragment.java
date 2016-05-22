package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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
    @BindView(R.id.et_crew_sal_month_one)
    EditText etCrewSalMonthOne;
    @BindView(R.id.et_crew_sal_month_two)
    EditText etCrewSalMonthTwo;


    @BindView(R.id.btn_submit)
    Button btn_submit;

    private OutputBean bean1, bean2;

    private double finance_amount_age = 1d;

    private double finance_charges_age = 0.055d;

    public static InputFragment newInstance() {

        InputFragment fragment = new InputFragment();
        return fragment;

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.frag_input, container, false);
            ButterKnife.bind(this, view);

        }
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.btn_submit)
    public void submit() {
        Toast.makeText(mActivity, "clicked", Toast.LENGTH_SHORT).show();

        calculateValuesOne();

        calculateValuesOneTwo();

        OutputFragment fragment = OutputFragment.newInstance(bean1, bean2);
        openFragment(fragment);

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
    7.	Fuel cost per year = fuel price x [(distance per year) / trip mileage per km] – Rs.1301425
    8.	Trip mileage = total trip distance/ [(trip distance with load/mileage with load) + (Distance without load/mileage without load)] – 4.1KMPL
    4.	Running Cost per year = (Fuel cost + Maintenance cost) per year – Rs.1, 802,436
    5.	Maintenance cost per year = cost of maintenance per km x distance per year – Rs.96, 525
    6.	Distance per year = No of trips per year x distance per trip – 107250 kms
    9.	Distance per month = No of trips in month x distance per trip – 9750 kms
    10.	Payload in tons per year = total load per trip x trip per year – 14300 Tons
    11.	Total load per trip = onward load + return load – 20.0 Tons
    12.	Total ton-km per year = [[(onward journey load x onward distance) + (return journey load x return distance)] x No of trips in month x No of months] - 1072500
    13.	Total freight earned per year = [(Freight rate per ton per km OJ x load OJ x OJ Distance with load) + (Freight rate per ton per km x Load RJ x RJ Distance with load)] x number of trips per year. – Rs.0.00
*/


    private void calculateValuesOne() {

        bean1 = new OutputBean();

        bean1.setTotal_trip_distance(TripCalculate.getTotalTripDistance(getNumber(etDistanceWithLoadOJOne), getNumber(etDistanceWithLoadRJOne), getNumber(etDistanceWithoutLoadOne)));

        bean1.setTotal_load_carried(TripCalculate.getTotalLoadPerTrip(getNumber(etOJPayOne), getNumber(etRJPayOne)));

        bean1.setDistance_year(TripCalculate.getDistancePerYear(getNumber(etTripPerMonthOne) *getNumber(etOperativeMonthOne), bean1.getTotal_trip_distance()));

        bean1.setCost_maintenance_year(TripCalculate.getMaintenanceCostPerYear(getNumber(etMaintenanceCostPerKmOne), bean1.getDistance_year()));

        bean1.setCost_maintenance_km_year(TripCalculate.getMaintenanceCostPerKmPerYear(bean1.getCost_maintenance_year(), bean1.getDistance_year()));

        double mileage_with_load = getNumber(etMileageWithLoadOJOne) + getNumber(etMileageWithLoadRJOne);
        double trip_distance_with_load = bean1.getTotal_trip_distance() - getNumber(etDistanceWithoutLoadOne);

        bean1.setTrip_mileage(TripCalculate.getTripMileage(bean1.getTotal_trip_distance(), trip_distance_with_load, mileage_with_load, getNumber(etDistanceWithoutLoadOne), getNumber(etMileageWithoutLoadOne)));

        bean1.setFuel_cost_year(TripCalculate.getFuelCostPerYear(getNumber(etFuelPriceOne), bean1.getDistance_year(), bean1.getTrip_mileage()));

        bean1.setCost_running_year(TripCalculate.getRunningCostPerYear(bean1.getFuel_cost_year(), bean1.getCost_maintenance_year()));


        bean1.setDistance_month(TripCalculate.getDistancePerMonth(getNumber(etTripPerMonthOne), bean1.getTotal_trip_distance()));
        bean1.setPayload_tons_year(TripCalculate.getPayLoadInTonsPerYear(bean1.getTotal_load_carried(), getNumber(etTripPerMonthOne) *getNumber(etOperativeMonthOne)));
        // 2nd eqn is same as below
        //total_load_trip=TripCalculate.getTotalLoadPerTrip(getNumber(etOJPayOne),getNumber(etRJPayOne));
        bean1.setTotal_tons_km_year(TripCalculate.getTotalTonKmPerYear(getNumber(etOJPayOne), getNumber(etDistanceWithLoadOJOne), getNumber(etRJPayOne), getNumber(etDistanceWithLoadRJOne), getNumber(etTripPerMonthOne), getNumber(etOperativeMonthOne)));
        bean1.setTotal_freight_earned_year(TripCalculate.getTotalFreightEarnedPerYear(getNumber(etFreightRatePerTonPerKmForwardJourneyOne), getNumber(etOJPayOne), getNumber(etDistanceWithLoadOJOne), getNumber(etFreightRatePerTonPerKmReturnJourneyOne), getNumber(etRJPayOne), getNumber(etDistanceWithLoadRJOne), getNumber(etTripPerMonthOne) * getNumber(etOperativeMonthOne)));

        double initial_cost = TripCalculate.getInitialCost(getNumber(etBodyBuildCostOne),getNumber(etVehiclePriceOne));
        double crew_salary_year = TripCalculate.getCrewSalaryYear(getNumber(etOperativeMonthOne),getNumber(etCrewSalMonthOne));
        double taxes= (double) (initial_cost*0.04);
        double admin_expenses= (double) (initial_cost*0.01);

        bean1.setTotal_fixed_cost(TripCalculate.getTotalFixedCost(crew_salary_year ,taxes , admin_expenses));

        double finance_amount = initial_cost * finance_amount_age;

        bean1.setTotal_finance_cost(finance_amount*finance_charges_age);



    }

    private void calculateValuesOneTwo() {
        bean2 = new OutputBean();

        bean2.setTotal_trip_distance(TripCalculate.getTotalTripDistance(getNumber(etDistanceWithLoadOJTwo), getNumber(etDistanceWithLoadRJTwo), getNumber(etDistanceWithoutLoadTwo)));

        bean2.setTotal_load_carried(TripCalculate.getTotalLoadPerTrip(getNumber(etOJPayTwo), getNumber(etRJPayTwo)));

        bean2.setDistance_year(TripCalculate.getDistancePerYear(getNumber(etTripPerMonthTwo) *getNumber(etOperativeMonthTwo), bean2.getTotal_trip_distance()));

        bean2.setCost_maintenance_year(TripCalculate.getMaintenanceCostPerYear(getNumber(etMaintenanceCostPerKmTwo), bean2.getDistance_year()));

        bean2.setCost_maintenance_km_year(TripCalculate.getMaintenanceCostPerKmPerYear(bean2.getCost_maintenance_year() , bean2.getDistance_year()));

        double mileage_with_load = getNumber(etMileageWithLoadOJTwo) + getNumber(etMileageWithLoadRJTwo);

        double trip_distance_with_load = bean2.getTotal_trip_distance() - getNumber(etDistanceWithoutLoadTwo);


        bean2.setTrip_mileage(TripCalculate.getTripMileage(bean2.getTotal_trip_distance(), trip_distance_with_load, mileage_with_load, getNumber(etDistanceWithoutLoadTwo), getNumber(etMileageWithoutLoadTwo)));

        bean2.setFuel_cost_year(TripCalculate.getFuelCostPerYear(getNumber(etFuelPriceTwo), bean2.getDistance_year(), bean2.getTrip_mileage()));

        bean2.setCost_running_year(TripCalculate.getRunningCostPerYear(bean2.getFuel_cost_year(), bean2.getCost_maintenance_year()));

        bean2.setDistance_month(TripCalculate.getDistancePerMonth(getNumber(etTripPerMonthTwo), bean2.getTotal_trip_distance()));
        bean2.setPayload_tons_year(TripCalculate.getPayLoadInTonsPerYear(bean2.getTotal_load_carried(), getNumber(etTripPerMonthTwo) * getNumber(etOperativeMonthTwo)));
        // 2nd eqn is same as below
        //total_load_trip=TripCalculate.getTotalLoadPerTrip(getNumber(etOJPayTwo),getNumber(etRJPayTwo));
        bean2.setTotal_tons_km_year(TripCalculate.getTotalTonKmPerYear(getNumber(etOJPayTwo), getNumber(etDistanceWithLoadOJTwo), getNumber(etRJPayTwo), getNumber(etDistanceWithLoadRJTwo), getNumber(etTripPerMonthTwo),getNumber(etOperativeMonthTwo)));
        bean2.setTotal_freight_earned_year(TripCalculate.getTotalFreightEarnedPerYear(getNumber(etFreightRatePerTonPerKmForwardJourneyTwo), getNumber(etOJPayTwo), getNumber(etDistanceWithLoadOJTwo), getNumber(etFreightRatePerTonPerKmReturnJourneyTwo), getNumber(etRJPayTwo), getNumber(etDistanceWithLoadRJTwo), getNumber(etTripPerMonthTwo) * getNumber(etOperativeMonthTwo)));

        double initial_cost = TripCalculate.getInitialCost(getNumber(etBodyBuildCostTwo),getNumber(etVehiclePriceTwo));
        double crew_salary_year = TripCalculate.getCrewSalaryYear(getNumber(etOperativeMonthTwo),getNumber(etCrewSalMonthTwo));
        double taxes=(initial_cost*0.04);
        double admin_expenses= (initial_cost*0.01);

        bean2.setTotal_fixed_cost(TripCalculate.getTotalFixedCost(crew_salary_year ,taxes , admin_expenses));

        double finance_amount = initial_cost * finance_amount_age;

        bean2.setTotal_finance_cost(finance_amount*finance_charges_age);
    }

    private double getNumber(EditText editText) {

        double number = Double.parseDouble(editText.getText().toString());
        return number;

    }

}
