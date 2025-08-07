public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        int number = 15;

        // Simple if
        if (number > 10) {
            System.out.println("The number is greater than 10.");
        }

        // if-else
        if (number % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

        // else-if ladder
        if (number < 0) {
            System.out.println("Negative number.");
        } else if (number == 0) {
            System.out.println("Zero.");
        } else {
            System.out.println("Positive number.");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }
    }
}
