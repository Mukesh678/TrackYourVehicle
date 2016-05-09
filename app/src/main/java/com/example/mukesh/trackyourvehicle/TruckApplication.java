package com.example.mukesh.trackyourvehicle;

import android.app.Application;
import android.content.Context;

/**
 * Created by hardik.hirpara on 11/17/2015.
 */
public class TruckApplication extends Application
{
    private static TruckApplication application = null;

    public TruckApplication(){
        application = this;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        application = this;


    }


    public static Context getAppContext()
    {
        if(application == null){
            application = new TruckApplication();
        }
        return application;
    }

}
