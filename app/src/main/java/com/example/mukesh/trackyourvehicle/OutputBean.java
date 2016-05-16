package com.example.mukesh.trackyourvehicle;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by pranav on 16/5/16.
 */
public class OutputBean implements Parcelable {
    private float
            total_trip_distance;
    private float total_load_carried;
    private float cost_maintenance_km_year;
    private float cost_running_year;
    private float cost_maintenance_year;
    private float distance_year;
    private float fuel_cost_year;
    private float trip_mileage;
    private float distance_month;

    private float payload_tons_year;

    private float total_load_trip;
    private float total_tons_km_year;
    private float total_freight_earned_year;
    private float total_fixed_cost;
    private float total_finance_cost;



    public float getCost_maintenance_km_year() {
        return cost_maintenance_km_year;
    }

    public float getTotal_fixed_cost() {
        return total_fixed_cost;
    }

    public float getTotal_finance_cost() {
        return total_finance_cost;
    }

    public void setTotal_finance_cost(float total_finance_cost) {
        this.total_finance_cost = total_finance_cost;
    }

    public void setTotal_fixed_cost(float total_fixed_cost) {
        this.total_fixed_cost = total_fixed_cost;
    }

    public void setCost_maintenance_km_year(float cost_maintenance_km_year) {
        this.cost_maintenance_km_year = cost_maintenance_km_year;
    }

    public float getCost_maintenance_year() {
        return cost_maintenance_year;
    }

    public void setCost_maintenance_year(float cost_maintenance_year) {
        this.cost_maintenance_year = cost_maintenance_year;
    }

    public float getCost_running_year() {
        return cost_running_year;
    }

    public void setCost_running_year(float cost_running_year) {
        this.cost_running_year = cost_running_year;
    }

    public static Creator<OutputBean> getCREATOR() {
        return CREATOR;
    }

    public float getDistance_month() {
        return distance_month;
    }

    public void setDistance_month(float distance_month) {
        this.distance_month = distance_month;
    }

    public float getDistance_year() {
        return distance_year;
    }

    public void setDistance_year(float distance_year) {
        this.distance_year = distance_year;
    }

    public float getFuel_cost_year() {
        return fuel_cost_year;
    }

    public void setFuel_cost_year(float fuel_cost_year) {
        this.fuel_cost_year = fuel_cost_year;
    }

    public float getPayload_tons_year() {
        return payload_tons_year;
    }

    public void setPayload_tons_year(float payload_tons_year) {
        this.payload_tons_year = payload_tons_year;
    }

    public float getTotal_freight_earned_year() {
        return total_freight_earned_year;
    }

    public void setTotal_freight_earned_year(float total_freight_earned_year) {
        this.total_freight_earned_year = total_freight_earned_year;
    }

    public float getTotal_load_carried() {
        return total_load_carried;
    }

    public void setTotal_load_carried(float total_load_carried) {
        this.total_load_carried = total_load_carried;
    }

    public float getTotal_load_trip() {
        return total_load_trip;
    }

    public void setTotal_load_trip(float total_load_trip) {
        this.total_load_trip = total_load_trip;
    }

    public float getTotal_tons_km_year() {
        return total_tons_km_year;
    }

    public void setTotal_tons_km_year(float total_tons_km_year) {
        this.total_tons_km_year = total_tons_km_year;
    }

    public float getTotal_trip_distance() {
        return total_trip_distance;
    }

    public void setTotal_trip_distance(float total_trip_distance) {
        this.total_trip_distance = total_trip_distance;
    }

    public float getTrip_mileage() {
        return trip_mileage;
    }

    public void setTrip_mileage(float trip_mileage) {
        this.trip_mileage = trip_mileage;
    }

    public OutputBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(this.total_trip_distance);
        dest.writeFloat(this.total_load_carried);
        dest.writeFloat(this.cost_maintenance_km_year);
        dest.writeFloat(this.cost_running_year);
        dest.writeFloat(this.cost_maintenance_year);
        dest.writeFloat(this.distance_year);
        dest.writeFloat(this.fuel_cost_year);
        dest.writeFloat(this.trip_mileage);
        dest.writeFloat(this.distance_month);
        dest.writeFloat(this.payload_tons_year);
        dest.writeFloat(this.total_load_trip);
        dest.writeFloat(this.total_tons_km_year);
        dest.writeFloat(this.total_freight_earned_year);
        dest.writeFloat(this.total_fixed_cost);
        dest.writeFloat(this.total_finance_cost);
    }

    protected OutputBean(Parcel in) {
        this.total_trip_distance = in.readFloat();
        this.total_load_carried = in.readFloat();
        this.cost_maintenance_km_year = in.readFloat();
        this.cost_running_year = in.readFloat();
        this.cost_maintenance_year = in.readFloat();
        this.distance_year = in.readFloat();
        this.fuel_cost_year = in.readFloat();
        this.trip_mileage = in.readFloat();
        this.distance_month = in.readFloat();
        this.payload_tons_year = in.readFloat();
        this.total_load_trip = in.readFloat();
        this.total_tons_km_year = in.readFloat();
        this.total_freight_earned_year = in.readFloat();
        this.total_fixed_cost = in.readFloat();
        this.total_finance_cost = in.readFloat();
    }

    public static final Creator<OutputBean> CREATOR = new Creator<OutputBean>() {
        @Override
        public OutputBean createFromParcel(Parcel source) {
            return new OutputBean(source);
        }

        @Override
        public OutputBean[] newArray(int size) {
            return new OutputBean[size];
        }
    };
}
