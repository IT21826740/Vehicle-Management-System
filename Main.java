package Q2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020);
        Bike bike = new Bike("Yamaha", "MT-07", 2018);

        System.out.println("Car Rental for 3 days: " + car.getRentalCost(3));
        System.out.println("Car Rental for 2 days and 12 hours: " + car.getRentalCost(2,12));
        System.out.println("Bike Rental for 3 days: " + bike.getRentalCost(3));
        System.out.println("Bike Rental for 2 days and 12 hours: " + bike.getRentalCost(2, 12));
    }

}
