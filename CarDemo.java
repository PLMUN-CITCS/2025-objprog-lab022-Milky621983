// Car class defining attributes and behavior
class Car {
    // Instance variables
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class to demonstrate object instantiation
public class CarDemo {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car();
        
        // Assigning values to attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        
        // Display car information
        myCar.displayInfo();
    }
}
