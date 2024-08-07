# Vehicle-Management-System

 a real-world example question that involves both method overloading and method overriding in Java:

## Question: Vehicle Management System

### Problem Statement

You are tasked with developing a simple vehicle management system for a vehicle rental company. The system needs to manage different types of vehicles and calculate rental costs based on the type and rental duration. You need to implement the following:

1. **Vehicle Class**:
   - A base class `Vehicle` with attributes `make`, `model`, and `year`.
   - A method `getRentalCost(int days)` to calculate the rental cost.

2. **Car and Bike Classes**:
   - Two derived classes `Car` and `Bike` that inherit from `Vehicle`.
   - Override the `getRentalCost(int days)` method to provide specific rental cost calculations for cars and bikes.

3. **Rental Cost Calculation**:
   - The base `Vehicle` class should provide a default rental cost calculation.
   - The `Car` class should charge a flat rate per day plus an additional fee for each day.
   - The `Bike` class should charge a flat rate per day with no additional fees.

4. **Method Overloading**:
   - Overload the `getRentalCost` method in the `Vehicle` class to allow calculating the rental cost for both days and hours. The method `getRentalCost(int days, int hours)` should calculate the cost by converting hours to a fraction of a day.

### Requirements

1. **Vehicle Class**:
   - Attributes: `make` (String), `model` (String), `year` (int).
   - Methods:
     - `getRentalCost(int days)`: Returns the rental cost for the given number of days.
     - `getRentalCost(int days, int hours)`: Returns the rental cost for the given number of days and hours.

2. **Car Class**:
   - Inherits from `Vehicle`.
   - Overrides `getRentalCost(int days)` to charge $50 per day plus $20 additional fee for each day.

3. **Bike Class**:
   - Inherits from `Vehicle`.
   - Overrides `getRentalCost(int days)` to charge $20 per day with no additional fees.

4. **Main Program**:
   - Create instances of `Car` and `Bike`.
   - Demonstrate method overloading and overriding by calculating rental costs for different durations.

### Example Output
```
Car Rental for 3 days: $210
Car Rental for 2 days and 12 hours: $180
Bike Rental for 3 days: $60
Bike Rental for 2 days and 12 hours: $50
```



### Explanation of Features

1. **Method Overloading**:
   - The `getRentalCost(int days)` method is overloaded with another method `getRentalCost(int days, int hours)` in the `Vehicle` class to handle both days and hours.

2. **Method Overriding**:
   - The `Car` and `Bike` classes override the `getRentalCost(int days)` method from the `Vehicle` class to provide specific rental cost calculations.

This example allows you to demonstrate understanding and implementation of both method overloading and overriding in a practical scenario.

SELF TRY - LEARN JAVA - Q2
