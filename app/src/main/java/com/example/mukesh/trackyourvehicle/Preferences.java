package com.example.mukesh.trackyourvehicle;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {
    private static final String PREFS_NAME = "BRT_PREF";

    /**
     * Preference keys
     */

    public static final String KEY_CUSTOMER = "CustName";
    public static final String KEY_MODEL = "ModelNo";
    public static final String KEY_DSE = "Dse";


    private static SharedPreferences get() {
        return TruckApplication.getAppContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }


    public static void writeSharedPreferences(String key, String value) {
        SharedPreferences settings = get();
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void writeSharedPreferencesBool(String key, boolean value) {
        get().edit().putBoolean(key, value).commit();
    }

    public static String getAppPrefString(String key) {
        return get().getString(key, "");
    }

    public static boolean getAppPrefBool(String key, boolean default_value) {
        return get().getBoolean(key, default_value);
    }

    public static void deleteSharedPreferences(String key) {
        get().edit().remove(key).commit();
    }
    public static boolean containsKey(String key)
    {
        return get().contains(key);
    }



}