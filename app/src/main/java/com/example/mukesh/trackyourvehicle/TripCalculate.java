package com.example.mukesh.trackyourvehicle;

/**
 * Created by ViRus on 07-May-16.
 */
public class TripCalculate
{
    /*

    1.	Total trip distance = distance with load OJ + distance with load RJ + distance without load – 150.0 Tons
    2.	Total load carried per trip = OJ load + RJ load – 20.0 Tons
    3.	Cost of maintenance per km per year = maintenance cost per year / total distance per year – Rs.0.90
    4.	Running Cost per year = (Fuel cost + Maintenance cost) per year – Rs.1, 802,436
    5.	Maintenance cost per year = cost of maintenance per km x distance per year – Rs.96, 525
    6.	Distance per year = No of trips per year x distance per trip – 107250 kms
    7.	Fuel cost per year = fuel price x [(distance per year) / trip mileage per km] – Rs.1301425
    8.	Trip mileage = total trip distance/ [(trip distance with load/mileage with load) + (Distance without load/mileage without load)] – 4.1KMPL
    9.	Distance per month = No of trips in month x distance per trip – 9750 kms
    10.	Payload in tons per year = total load per trip x trip per year – 14300 Tons
    11.	Total load per trip = onward load + return load – 20.0 Tons
    12.	Total ton-km per year = [[(onward journey load x onward distance) + (return journey load x return distance)] x No of trips in month x No of months] - 1072500
    13.	Total freight earned per year = [(Freight rate per ton per km OJ x load OJ x OJ Distance with load) + (Freight rate per ton per km x Load RJ x RJ Distance with load)] x number of trips per year. – Rs.0.00
    14. Maintenance cost per year = maintenance cost per km * distance in a year
    15. Initial Cost = body cost + vehicle price
    16  Crew Salary per year = Operative_month total * crew salary month
    17. Total Fixed cost per year= Crew Salary per year + taxes + Admin expanses

    */


   //1.
    public static double getTotalTripDistance(double distance_OJ,double distance_RJ,double distance_no_load)
    {
        return distance_OJ + distance_RJ + distance_no_load;
    }

    //2
    public static double getTotalTripLoadCarried(double OJ_Load,double RJ_Load)
    {
        return OJ_Load + RJ_Load;
    }

    //3
    public static double getMaintenanceCostPerKmPerYear(double cost_maintenance_year,double total_distance_year)
    {

        return cost_maintenance_year/ ((total_distance_year==0)?1:total_distance_year);
    }

    //4
    public static double getRunningCostPerYear(double cost_fuel_year,double cost_maintenance_year)
    {
        return cost_fuel_year + cost_maintenance_year;
    }

    //5
    public static double getMaintenanceCostPerYear(double cost_maintenance_km,double total_distance_year)
    {
        return cost_maintenance_km * total_distance_year;
    }

    //6
    public static double getDistancePerYear(double no_trip_year, double trip_distance)
    {
        return no_trip_year * trip_distance;
    }

    //7
    public static double getFuelCostPerYear(double price_fuel,double distance_year,double trip_mileage_km)
    {
        double disDivMileage=(distance_year / ((trip_mileage_km==0)?1:trip_mileage_km));
        return price_fuel * disDivMileage ;
    }

    //8
    public static double getTripMileage(double total_trip_distance,double trip_distance_load,double mileage_load,double distance_without_load,double mileage_without_load)
    {
        double div= ((trip_distance_load / ((mileage_load==0) ? 1:mileage_load) + (distance_without_load / ((mileage_without_load==0)?1:mileage_without_load))));

        return total_trip_distance / ((div==0)?1:div);
    }

    //9
    public static double getDistancePerMonth(double no_trips_month,double distance_trip)
    {
        return no_trips_month * distance_trip;
    }

    //10
    public static double getPayLoadInTonsPerYear(double total_load_trip,double trip_year)
    {
        return total_load_trip * trip_year;
    }

    //11
    public static double getTotalLoadPerTrip(double onward_load,double return_load)
    {
        return onward_load + return_load;
    }

    //12
    public static double getTotalTonKmPerYear(double onward_load,double onward_distance,double return_load,double return_distance,double no_trips_month,double no_month)
    {
        return ((onward_load * onward_distance) + (return_load * return_distance)) * no_trips_month * no_month;
    }


    //13
    public static double getTotalFreightEarnedPerYear(double freight_rate_ton_km_OJ,double load_OJ,double distance_load_OJ,double freight_rate_ton_km_RJ,double load_RJ,double distance_load_RJ,double no_trips_year)
    {
        return ((freight_rate_ton_km_OJ * load_OJ * distance_load_OJ) + (freight_rate_ton_km_RJ * load_RJ * distance_load_RJ)) * no_trips_year;
    }


    //15
    public static double getInitialCost(double body_cost,double vehicle_price)
    {
        return body_cost + vehicle_price;
    }


    //16
    public static double getCrewSalaryYear(double operative_moth,double crew_salary_month)
    {
        return operative_moth * crew_salary_month;
    }

    //16
    public static double getTotalFixedCost(double crew_salary_year,double taxes ,double admin_expenses)
    {
        return crew_salary_year + taxes + admin_expenses;
    }

}
