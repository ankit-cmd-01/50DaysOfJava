public class DayOfWeekDemo {

    public static void main(String[] args) {
        // Change this number to test different cases
        int day = 4;
        String dayName;

        // The switch statement evaluates the value of 'day'
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        // Print the result
        System.out.println("The day is: " + dayName);
    }
}