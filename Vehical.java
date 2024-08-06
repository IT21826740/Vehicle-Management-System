package Q2;

public class Vehical {
    String make;
    String model;
    int year;

    public Vehical(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

   double getRentalCost(int days){
        return days*30;
    }


    double getRentalCost(int days,int hours){
        return getRentalCost(days)+ (hours*30/24);
    }
    
}
