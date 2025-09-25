import java.util.Stack;

/**
 * A basic demonstration of the Stack class in Java.
 * This program covers the core LIFO (Last-In, First-Out) operations:
 * push, pop, peek, and checking if the stack is empty.
 */
public class StackBasics {

    public static void main(String[] args) {

        // --- 1. Creating a Stack ---
        // We'll create a stack to hold Integer values.
        Stack<Integer> numberStack = new Stack<>();
        System.out.println("Created an empty stack. Is it empty? " + numberStack.isEmpty());

        // --- 2. Pushing Elements onto the Stack ---
        // The push() method adds an element to the TOP of the stack.
        System.out.println("\n--- Pushing elements ---");
        numberStack.push(10);
        System.out.println("Pushed 10. Stack: " + numberStack);
        numberStack.push(20);
        System.out.println("Pushed 20. Stack: " + numberStack);
        numberStack.push(30);
        System.out.println("Pushed 30. Stack: " + numberStack); // 30 is now at the top.

        // --- 3. Peeking at the Top Element ---
        // The peek() method looks at the object at the top of the stack
        // WITHOUT removing it.
        System.out.println("\n--- Peeking at the top ---");
        int topElement = numberStack.peek();
        System.out.println("Element at the top (peek): " + topElement);
        System.out.println("Stack after peek: " + numberStack); // The stack is unchanged.

        // --- 4. Popping Elements from the Stack ---
        // The pop() method removes and returns the element at the top.
        // This follows the LIFO principle.
        System.out.println("\n--- Popping elements (LIFO) ---");
        int removedElement1 = numberStack.pop(); // Removes 30, which was the last one in.
        System.out.println("Popped element: " + removedElement1);
        System.out.println("Stack after pop: " + numberStack);

        int removedElement2 = numberStack.pop(); // Removes 20.
        System.out.println("Popped element: " + removedElement2);
        System.out.println("Stack after pop: " + numberStack);

        // --- 5. Searching for an Element ---
        // The search() method returns the 1-based position from the top of the stack.
        // If the element is not found, it returns -1.
        System.out.println("\n--- Searching for an element ---");
        int position = numberStack.search(10); // 10 is the only element, so it's at position 1.
        System.out.println("Position of 10 from the top is: " + position);
        
        // --- 6. Checking if the Stack is Empty ---
        System.out.println("\n--- Final check ---");
        System.out.println("Is the stack empty now? " + numberStack.isEmpty());
        
        // Pop the last element
        numberStack.pop();
        System.out.println("Stack after final pop: " + numberStack);
        System.out.println("Is the stack empty now? " + numberStack.isEmpty());
    }
}