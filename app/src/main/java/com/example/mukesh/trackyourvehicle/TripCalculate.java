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
    public static float getTotalTripDistance(float distance_OJ,float distance_RJ,float distance_no_load)
    {
        return distance_OJ + distance_RJ + distance_no_load;
    }

    //2
    public static float getTotalTripLoadCarried(float OJ_Load,float RJ_Load)
    {
        return OJ_Load + RJ_Load;
    }

    //3
    public static float getMaintenanceCostPerKmPerYear(float cost_maintenance_year,float total_distance_year)
    {
        return cost_maintenance_year/ total_distance_year;
    }

    //4
    public static float getRunningCostPerYear(float cost_fuel_year,float cost_maintenance_year)
    {
        return cost_fuel_year + cost_maintenance_year;
    }

    //5
    public static float getMaintenanceCostPerYear(float cost_maintenance_km,float total_distance_year)
    {
        return cost_maintenance_km * total_distance_year;
    }

    //6
    public static float getDistancePerYear(float no_trip_year, float trip_distance)
    {
        return no_trip_year * trip_distance;
    }

    //7
    public static float getFuelCostPerYear(float price_fuel,float distance_year,float trip_mileage_km)
    {
        return price_fuel * (distance_year / trip_mileage_km);
    }

    //8
    public static float getTripMileage(float total_trip_distance,float trip_distance_load,float mileage_load,float distance_without_load,float mileage_without_load)
    {
        return total_trip_distance / ( (trip_distance_load / mileage_load) + (distance_without_load / mileage_without_load) );
    }

    //9
    public static float getDistancePerMonth(float no_trips_month,float distance_trip)
    {
        return no_trips_month * distance_trip;
    }

    //10
    public static float getPayLoadInTonsPerYear(float total_load_trip,float trip_year)
    {
        return total_load_trip * trip_year;
    }

    //11
    public static float getTotalLoadPerTrip(float onward_load,float return_load)
    {
        return onward_load + return_load;
    }

    //12
    public static float getTotalTonKmPerYear(float onward_load,float onward_distance,float return_load,float return_distance,float no_trips_month,float no_month)
    {
        return ((onward_load * onward_distance) + (return_load * return_distance)) * no_trips_month * no_month;
    }


    //13
    public static float getTotalFreightEarnedPerYear(float freight_rate_ton_km_OJ,float load_OJ,float distance_load_OJ,float freight_rate_ton_km_RJ,float load_RJ,float distance_load_RJ,float no_trips_year)
    {
        return ((freight_rate_ton_km_OJ * load_OJ * distance_load_OJ) + (freight_rate_ton_km_RJ * load_RJ * distance_load_RJ)) * no_trips_year;
    }


    //15
    public static float getInitialCost(float body_cost,float vehicle_price)
    {
        return body_cost + vehicle_price;
    }


    //16
    public static float getCrewSalaryYear(float operative_moth,float crew_salary_month)
    {
        return operative_moth * crew_salary_month;
    }

    //16
    public static float getTotalFixedCost(float crew_salary_year,float taxes ,float admin_expenses)
    {
        return crew_salary_year * taxes * admin_expenses;
    }

}
