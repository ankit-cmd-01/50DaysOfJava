/**
 * 1. Abstract Class
 * An abstract class is a template that cannot be instantiated on its own.
 * It defines a common interface for its subclasses.
 */
abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     * 2. Abstract Method
     * An abstract method has no implementation (no body).
     * It acts as a contract, forcing any concrete subclass to provide its own implementation.
     */
    public abstract double calculateArea();
}

/**
 * Concrete Subclass: Circle
 * This class extends the abstract Shape class and provides a specific
 * implementation for the abstract calculateArea() method.
 */
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // This is the mandatory implementation of the abstract method.
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Concrete Subclass: Rectangle
 */
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

/**
 * The main class to demonstrate abstraction.
 */
public class Abstraction {
    public static void main(String[] args) {
        // You CANNOT create an object of an abstract class.
        // The following line would cause a compile error:
        // Shape myShape = new Shape("Red");

        // You create objects of the concrete classes.
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Shape: Circle, Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("--------------------");

        System.out.println("Shape: Rectangle, Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}