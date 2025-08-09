public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Found the number 5. Exiting loop!");
                break; // Immediately exit the for loop
            }
            System.out.println("Count is: " + i);
        }
        System.out.println("Loop finished.");
    }
}