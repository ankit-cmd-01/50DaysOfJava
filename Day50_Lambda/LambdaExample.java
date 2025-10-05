import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Use a lambda expression with the forEach method to print each name
        // (name) is the parameter
        // -> is the arrow token
        // System.out.println(name) is the body of the lambda
        names.forEach( (name) -> System.out.println(name) );
    }
}