package com.example.mukesh.trackyourvehicle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST","esp");
    }
}
