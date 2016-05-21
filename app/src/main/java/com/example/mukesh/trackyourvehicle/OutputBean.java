package com.example.mukesh.trackyourvehicle;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by pranav on 16/5/16.
 */
public class OutputBean implements Parcelable {
    private double
            total_trip_distance;
    private double total_load_carried;
    private double cost_maintenance_km_year;
    private double cost_running_year;
    private double cost_maintenance_year;
    private double distance_year;
    private double fuel_cost_year;
    private double trip_mileage;
    private double distance_month;

    private double payload_tons_year;

    private double total_load_trip;
    private double total_tons_km_year;
    private double total_freight_earned_year;
    private double total_fixed_cost;
    private double total_finance_cost;



    public double getCost_maintenance_km_year() {
        return cost_maintenance_km_year;
    }

    public double getTotal_fixed_cost() {
        return total_fixed_cost;
    }

    public double getTotal_finance_cost() {
        return total_finance_cost;
    }

    public void setTotal_finance_cost(double total_finance_cost) {
        this.total_finance_cost = total_finance_cost;
    }

    public void setTotal_fixed_cost(double total_fixed_cost) {
        this.total_fixed_cost = total_fixed_cost;
    }

    public void setCost_maintenance_km_year(double cost_maintenance_km_year) {
        this.cost_maintenance_km_year = cost_maintenance_km_year;
    }

    public double getCost_maintenance_year() {
        return cost_maintenance_year;
    }

    public void setCost_maintenance_year(double cost_maintenance_year) {
        this.cost_maintenance_year = cost_maintenance_year;
    }

    public double getCost_running_year() {
        return cost_running_year;
    }

    public void setCost_running_year(double cost_running_year) {
        this.cost_running_year = cost_running_year;
    }

    public static Creator<OutputBean> getCREATOR() {
        return CREATOR;
    }

    public double getDistance_month() {
        return distance_month;
    }

    public void setDistance_month(double distance_month) {
        this.distance_month = distance_month;
    }

    public double getDistance_year() {
        return distance_year;
    }

    public void setDistance_year(double distance_year) {
        this.distance_year = distance_year;
    }

    public double getFuel_cost_year() {
        return fuel_cost_year;
    }

    public void setFuel_cost_year(double fuel_cost_year) {
        this.fuel_cost_year = fuel_cost_year;
    }

    public double getPayload_tons_year() {
        return payload_tons_year;
    }

    public void setPayload_tons_year(double payload_tons_year) {
        this.payload_tons_year = payload_tons_year;
    }

    public double getTotal_freight_earned_year() {
        return total_freight_earned_year;
    }

    public void setTotal_freight_earned_year(double total_freight_earned_year) {
        this.total_freight_earned_year = total_freight_earned_year;
    }

    public double getTotal_load_carried() {
        return total_load_carried;
    }

    public void setTotal_load_carried(double total_load_carried) {
        this.total_load_carried = total_load_carried;
    }

    public double getTotal_load_trip() {
        return total_load_trip;
    }

    public void setTotal_load_trip(double total_load_trip) {
        this.total_load_trip = total_load_trip;
    }

    public double getTotal_tons_km_year() {
        return total_tons_km_year;
    }

    public void setTotal_tons_km_year(double total_tons_km_year) {
        this.total_tons_km_year = total_tons_km_year;
    }

    public double getTotal_trip_distance() {
        return total_trip_distance;
    }

    public void setTotal_trip_distance(double total_trip_distance) {
        this.total_trip_distance = total_trip_distance;
    }

    public double getTrip_mileage() {
        return trip_mileage;
    }

    public void setTrip_mileage(double trip_mileage) {
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
        dest.writeDouble(this.total_trip_distance);
        dest.writeDouble(this.total_load_carried);
        dest.writeDouble(this.cost_maintenance_km_year);
        dest.writeDouble(this.cost_running_year);
        dest.writeDouble(this.cost_maintenance_year);
        dest.writeDouble(this.distance_year);
        dest.writeDouble(this.fuel_cost_year);
        dest.writeDouble(this.trip_mileage);
        dest.writeDouble(this.distance_month);
        dest.writeDouble(this.payload_tons_year);
        dest.writeDouble(this.total_load_trip);
        dest.writeDouble(this.total_tons_km_year);
        dest.writeDouble(this.total_freight_earned_year);
        dest.writeDouble(this.total_fixed_cost);
        dest.writeDouble(this.total_finance_cost);
    }

    protected OutputBean(Parcel in) {
        this.total_trip_distance = in.readDouble();
        this.total_load_carried = in.readDouble();
        this.cost_maintenance_km_year = in.readDouble();
        this.cost_running_year = in.readDouble();
        this.cost_maintenance_year = in.readDouble();
        this.distance_year = in.readDouble();
        this.fuel_cost_year = in.readDouble();
        this.trip_mileage = in.readDouble();
        this.distance_month = in.readDouble();
        this.payload_tons_year = in.readDouble();
        this.total_load_trip = in.readDouble();
        this.total_tons_km_year = in.readDouble();
        this.total_freight_earned_year = in.readDouble();
        this.total_fixed_cost = in.readDouble();
        this.total_finance_cost = in.readDouble();
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
