package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ViRus on 5/9/2016.
 */
public class OutputFragment extends BaseFragment {

    public static final String KEY_TRUCK_ONE = "key_truck_one";
    public static final String KEY_TRUCK_TWO = "key_truck_two";
    public static final String KEY_TRUCK_ONE_STRING = "key_truck_one_string";
    public static final String KEY_TRUCK_TWO_STRING = "key_truck_two_string";

    @BindView(R.id.tv_result1)
    TextView tvResult1;
    @BindView(R.id.tv_result2)
    TextView tvResult2;
    @BindView(R.id.tv_result3)
    TextView tvResult3;
    @BindView(R.id.btn_email)
    FloatingActionButton btn_email;


    private OutputBean bean1, bean2;

//    Result Page
//
//            1.	Increase in operating profit for 5 years = increase in Operating Profit x 5 – Rs.441814
//            2.	Increase in Operating Profit per year = OP1 – OP2 – Rs.88363
//            3.	Operating Profit per year = (Freight Earned per year) – (Operating Cost per year) – Rs.1967436
//            4.	Operating Cost per year = Finance cost per year + Total running cost per year + Total fixed cost per year. - Rs.1967436


    private View view;
    private String input_truck1,input_truck2;


    public static OutputFragment newInstance(OutputBean bean1, OutputBean bean2,String firstTruck,String secondTruck) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(OutputFragment.KEY_TRUCK_ONE, bean1);
        bundle.putParcelable(OutputFragment.KEY_TRUCK_TWO, bean2);
        bundle.putString(OutputFragment.KEY_TRUCK_ONE_STRING, firstTruck);
        bundle.putString(OutputFragment.KEY_TRUCK_TWO_STRING, secondTruck);
        OutputFragment fragment = new OutputFragment();
        fragment.setArguments(bundle);
        return fragment;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null)
        {
            view = inflater.inflate(R.layout.frag_output, container, false);
            ButterKnife.bind(this, view);

            bean1 = getArguments().getParcelable(KEY_TRUCK_ONE);
            bean2 = getArguments().getParcelable(KEY_TRUCK_TWO);

            input_truck1=getArguments().getString(KEY_TRUCK_ONE_STRING);
            input_truck2=getArguments().getString(KEY_TRUCK_TWO_STRING);

            showResult();

        }

        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.btn_email)
    public void emailResult()
    {
        String body= generateEmailBody();

        EmailUtils.sendEmail(mActivity ,"monarch.modi@tatamotors.com", "BTR Report" , body);
    }

    private void showResult() {

        if (bean1 != null && bean2 != null) {
            double operating_cost_year_one = Math.round(bean1.getTotal_finance_cost() + bean1.getCost_running_year() + bean1.getTotal_fixed_cost());
            double operating_profit_year_one = Math.round(bean1.getTotal_freight_earned_year() - operating_cost_year_one);


            double operating_cost_year_two = Math.round(bean2.getTotal_finance_cost() + bean2.getCost_running_year() + bean2.getTotal_fixed_cost());
            double operating_profit_year_two = Math.round(bean2.getTotal_freight_earned_year() - operating_cost_year_two);

            double increasing_in_op= operating_profit_year_one - operating_profit_year_two;
            double increasing_in_op_five_year = increasing_in_op*5;


            Spanned result1= Html.fromHtml("Operating Cost Per Year : "+getColorText(operating_cost_year_one)
                    +"<br>Operating Profit Per Year : "+getColorText(operating_profit_year_one));

            Spanned result2=Html.fromHtml("Operating Cost Per Year : "+getColorText(operating_cost_year_two)
                    +"<br>Operating Profit Per Year : "+getColorText(operating_profit_year_two));

            Spanned result3=Html.fromHtml("Increasing In Operating Profit : "+getColorText(increasing_in_op)
                    +"<br>Increasing In Operating Profit For Five Years : "+getColorText(increasing_in_op_five_year));

            tvResult1.setText(result1);


            tvResult2.setText(result2);

            tvResult3.setText(result3);



        }
    }

    private String getColorText(double value) {

        return "<font color='#EE0000'>"+value+"</font>";
    }

    private String getColorText(String value) {

        return Html.fromHtml("<font color='#EE0000'>"+value+"</font>").toString();
    }

    private String generateEmailBody() {

        StringBuilder sb=new StringBuilder();

//        sb.append(getString(R.string.string1)).append(" :"+bean1.getPayload_tons_year());

        sb.append(getColorText("Customer Name: ")+Preferences.getAppPrefString(Preferences.KEY_CUSTOMER))
        .append("\n")
        .append(getColorText("Model No: ")+Preferences.getAppPrefString(Preferences.KEY_MODEL))
        .append("\n")
        .append(getColorText("DSE: ")+Preferences.getAppPrefString(Preferences.KEY_DSE))
        .append("\n\n")
        .append(getColorText("For Truck one:")+"\n\n")
        .append(input_truck1)
        .append(tvResult1.getText())
        .append("\n\n")
        .append("\n\n")
        .append(getColorText("For Truck two:")+"\n\n")
        .append(input_truck2)
        .append(tvResult2.getText())
        .append("\n\n")
        .append("\n\n")
        .append(tvResult3.getText());

        return sb.toString();
    }

}
