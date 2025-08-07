public class TypeCastingDemo {
    public static void main(String[] args) {
        // Widening Casting (Implicit)
        int intVal = 100;
        double doubleVal = intVal; // int to double
        System.out.println("Widening Casting:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to double: " + doubleVal);

        // Narrowing Casting (Explicit)
        double pi = 3.14159;
        int intPi = (int) pi; // double to int (fraction part lost)
        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + pi);
        System.out.println("Converted to int: " + intPi);

        // More Examples
        long longVal = 1000L;
        int narrowedInt = (int) longVal; // long to int
        System.out.println("\nlong to int: " + narrowedInt);

        float floatVal = 45.67f;
        byte byteVal = (byte) floatVal; // float to byte
        System.out.println("float to byte: " + byteVal);
    }
}
