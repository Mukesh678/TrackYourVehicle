package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ViRus on 5/9/2016.
 */
public class OutputFragment extends BaseFragment {

    public static final String KEY_TRUCK_ONE = "key_truck_one";
    public static final String KEY_TRUCK_TWO = "key_truck_two";


    @BindView(R.id.tv_result1)
    TextView tvResult1;
    @BindView(R.id.tv_result2)
    TextView tvResult2;

    private OutputBean bean1, bean2;

//    Result Page
//
//            1.	Increase in operating profit for 5 years = increase in Operating Profit x 5 – Rs.441814
//            2.	Increase in Operating Profit per year = OP1 – OP2 – Rs.88363
//            3.	Operating Profit per year = (Freight Earned per year) – (Operating Cost per year) – Rs.1967436
//            4.	Operating Cost per year = Finance cost per year + Total running cost per year + Total fixed cost per year. - Rs.1967436


    private View view;


    public static OutputFragment newInstance(OutputBean bean1, OutputBean bean2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(OutputFragment.KEY_TRUCK_ONE, bean1);
        bundle.putParcelable(OutputFragment.KEY_TRUCK_TWO, bean2);
        OutputFragment fragment = new OutputFragment();
        fragment.setArguments(bundle);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.frag_output, container, false);
            ButterKnife.bind(this, view);

            bean1 = getArguments().getParcelable(KEY_TRUCK_ONE);
            bean2 = getArguments().getParcelable(KEY_TRUCK_TWO);

            showResult();

        }

        ButterKnife.bind(this, view);
        return view;
    }

    private void showResult() {

        if (bean1 != null && bean2 != null) {
            double operating_cost_year_one = Math.round(bean1.getTotal_finance_cost() + bean1.getCost_running_year() + bean1.getTotal_fixed_cost());
            double operating_profit_year_one = Math.round(bean1.getTotal_freight_earned_year() - operating_cost_year_one);


            double operating_cost_year_two = Math.round(bean2.getTotal_finance_cost() + bean2.getCost_running_year() + bean2.getTotal_fixed_cost());
            double operating_profit_year_two = Math.round(bean2.getTotal_freight_earned_year() - operating_cost_year_two);

            double increasing_in_op= operating_profit_year_one - operating_profit_year_two;
            double increasing_in_op_five_year = increasing_in_op*5;



            tvResult1.setText("Operating Cost Per Year : "+operating_cost_year_one
                    +"\nOperating Profit Per Year : "+operating_profit_year_one
                    +"\nIncreasing In Operating Profit : "+increasing_in_op
                    +"\nIncreasing In Operating Profit For Five Years : "+increasing_in_op_five_year);


            tvResult2.setText("Operating Cost Per Year : "+operating_cost_year_two
                    +"\nOperating Profit Per Year : "+operating_profit_year_two);

        }
    }


}
