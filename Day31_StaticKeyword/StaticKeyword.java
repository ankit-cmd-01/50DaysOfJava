class Student {
    // --- Instance Members ---
    // Each student object will have its own copy of these variables.
    private String name;
    private int studentId;

    // --- Static Members ---

    /**
     * 1. Static Variable (or Class Variable)
     * A single copy of this variable is shared among all Student objects.
     */
    private static int studentCount = 0;

    /**
     * 3. Static Block
     * This block is executed only once, when the class is first loaded by the JVM.
     * It's used for static initializations.
     */
    static {
        System.out.println("Student class is loading...");
    }

    // Constructor to initialize instance variables
    public Student(String name) {
        this.name = name;
        // Increment the shared static counter and assign it as the ID.
        studentCount++;
        this.studentId = studentCount;
    }

    // Instance Method
    public void displayInfo() {
        System.out.println("ID: " + this.studentId + ", Name: " + this.name);
    }

    /**
     * 2. Static Method
     * This method belongs to the class, not to any specific object.
     * It can be called directly using the class name (e.g., Student.getStudentCount()).
     */
    public static int getStudentCount() {
        // A static method can only access other static members directly.
        // It cannot access instance variables like 'name' or 'studentId'.
        return studentCount;
    }
}


public class StaticKeyword {
    public static void main(String[] args) {
        // Calling the static method before creating any objects.
        System.out.println("Initial number of students: " + Student.getStudentCount());

        System.out.println("\nCreating new students...");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.displayInfo();
        student2.displayInfo();

        System.out.println("\nFinal number of students: " + Student.getStudentCount());
    }
}