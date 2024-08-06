package Q2;

public class Bike extends Vehical{

    public Bike(String make, String model, int year) {
        super(make, model, year);
       
    }

    @Override
    double getRentalCost(int days) {
        return days*20;
    }

    
    
    
}
