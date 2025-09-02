/**
 * 1. ENCAPSULATION: The Animal class bundles data (name) and methods together.
 * The 'name' attribute is private, meaning it's hidden and can only be accessed
 * through public methods like getName() and setName().
 */
class Animal {
    private String name; // Encapsulated data

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

/**
 * 2. INHERITANCE: The Dog class is a child of the Animal class.
 * It inherits all of Animal's public methods and attributes.
 */
class Dog extends Animal {
    public Dog(String name) {
        // 'super(name)' calls the constructor of the parent class (Animal).
        super(name);
    }

    /**
     * 3. POLYMORPHISM (Method Overriding): Dog provides its own specific
     * implementation of the makeSound() method, which was inherited from Animal.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

/**
 * The main class that will be used to create objects and run the program.
 */
public class OOPsBasics {
    public static void main(String[] args) {
        // --- Basic Object Creation ---
        Animal genericAnimal = new Animal("Creature");
        System.out.println("Name: " + genericAnimal.getName());
        genericAnimal.makeSound(); // Calls the parent method

        System.out.println("--------------------");

        // --- Inheritance in Action ---
        Dog myDog = new Dog("Buddy");
        System.out.println("Name: " + myDog.getName()); // Inherited from Animal
        myDog.makeSound(); // Calls the Dog's overridden method

        System.out.println("--------------------");

        // --- Polymorphism in Action ---
        // An 'Animal' reference can hold a 'Dog' object.
        Animal myPet = new Dog("Rex");
        System.out.println("Pet's name: " + myPet.getName());
        
        // This will call the Dog's makeSound() method, not the Animal's.
        // The Java Virtual Machine determines the correct method to call at runtime.
        myPet.makeSound();
    }
}