/**
 * A class with members of every access level.
 */
class Parent {
    // public: Accessible from anywhere.
    public String publicMessage = "This is public.";

    // protected: Accessible within the same package and by subclasses.
    protected String protectedMessage = "This is protected.";

    // default (package-private): Accessible only within the same package.
    String defaultMessage = "This is default (package-private).";

    // private: Accessible only within this Parent class.
    private String privateMessage = "This is private.";

    public void testAccessFromParent() {
        System.out.println(publicMessage);
        System.out.println(protectedMessage);
        System.out.println(defaultMessage);
        System.out.println(privateMessage); // All are accessible from inside the class
    }
}

/**
 * A subclass in the same package.
 */
class Child extends Parent {
    public void testAccessFromChild() {
        System.out.println(publicMessage);    // OK
        System.out.println(protectedMessage); // OK
        System.out.println(defaultMessage);   // OK
        // System.out.println(privateMessage); // COMPILE ERROR! Cannot access private members.
    }
}

/**
 * A separate, non-subclass in the same package.
 */
class Neighbor {
    public void testAccessFromNeighbor() {
        Parent p = new Parent();
        System.out.println(p.publicMessage);    // OK
        System.out.println(p.protectedMessage); // OK
        System.out.println(p.defaultMessage);   // OK
        // System.out.println(p.privateMessage); // COMPILE ERROR! Cannot access private members.
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("--- Testing access from within Parent itself ---");
        Parent parent = new Parent();
        parent.testAccessFromParent();

        System.out.println("\n--- Testing access from a Child class (same package) ---");
        Child child = new Child();
        child.testAccessFromChild();

        System.out.println("\n--- Testing access from a Neighbor class (same package) ---");
        Neighbor neighbor = new Neighbor();
        neighbor.testAccessFromNeighbor();
    }
}