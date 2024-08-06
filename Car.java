package Q2;

public class Car extends Vehical {

    public Car(String make, String model, int year) {
        super(make, model, year);
    
    }

    @Override
    double getRentalCost(int days) {
        return days*50 + days*20;
        
    }
    
}
