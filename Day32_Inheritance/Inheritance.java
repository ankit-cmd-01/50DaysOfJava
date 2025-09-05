/**
 * The Parent Class (Superclass)
 * It has common properties and methods that can be shared.
 */
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " is eating.");
    }
}

/**
 * The Child Class (Subclass)
 * The 'extends' keyword makes Dog a child of Animal.
 * Dog inherits the 'name' field and the 'eat()' method from Animal.
 */
class Dog extends Animal {
    // The Dog's constructor
    public Dog(String name) {
        // 'super(name)' calls the constructor of the parent class (Animal).
        // This is necessary to initialize the 'name' field from the parent.
        super(name);
    }

    // A method specific to the Dog class
    public void bark() {
        System.out.println(this.name + " says: Woof Woof!");
    }
}

/**
 * The main class to demonstrate inheritance.
 */
public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class.
        Dog myDog = new Dog("Buddy");

        // We can access the 'name' field, which was inherited from Animal.
        System.out.println("My dog's name is " + myDog.name);

        // We can call the 'eat()' method, which was inherited from Animal.
        myDog.eat();

        // We can call the 'bark()' method, which is specific to the Dog class.
        myDog.bark();
    }
}