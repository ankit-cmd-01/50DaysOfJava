public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 1 (remainder)

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 5;
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c); // 8

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int num = 5;
        System.out.println("num++: " + (num++)); // 5 (then becomes 6)
        System.out.println("++num: " + (++num)); // 7
        System.out.println("-num: " + (-num));   // -7
    }
}
