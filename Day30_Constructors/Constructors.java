/**
 * A simple class to model a car and demonstrate constructors.
 */
class Car {
    String make;
    int year;

    /**
     * 1. No-Argument Constructor
     * This is called when an object is created without any arguments.
     * e.g., Car myCar = new Car();
     */
    public Car() {
        this.make = "Unknown";
        this.year = 2025;
        System.out.println("No-argument constructor executed.");
    }

    /**
     * 2. Parameterized Constructor
     * This is called when an object is created with arguments.
     * e.g., Car myCar = new Car("Toyota", 2023);
     */
    public Car(String make, int year) {
        // The 'this' keyword distinguishes instance variables from parameters.
        this.make = make;
        this.year = year;
        System.out.println("Parameterized constructor executed.");
    }

    // A method to display the car's state.
    public void displayInfo() {
        System.out.println("Car Make: " + this.make + ", Year: " + this.year);
    }
}

/**
 * The main class to demonstrate creating objects with different constructors.
 */
public class Constructors {
    public static void main(String[] args) {
        // Create an object using the no-argument constructor.
        System.out.println("Creating car1...");
        Car car1 = new Car();
        car1.displayInfo();

        System.out.println("--------------------");

        // Create an object using the parameterized constructor.
        System.out.println("Creating car2...");
        Car car2 = new Car("Honda", 2024);
        car2.displayInfo();
    }
}