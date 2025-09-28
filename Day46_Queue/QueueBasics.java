import java.util.LinkedList;
import java.util.Queue;

/**
 * A basic demonstration of the Queue interface in Java, using a LinkedList implementation.
 * This program covers the core FIFO (First-In, First-Out) operations:
 * adding, removing, and inspecting elements.
 */
public class QueueBasics {

    public static void main(String[] args) {

        // --- 1. Creating a Queue ---
        // We declare the variable as the interface 'Queue' and instantiate it
        // with a concrete class 'LinkedList'. This is a common best practice.
        Queue<String> customerLine = new LinkedList<>();
        System.out.println("Created an empty queue. Is it empty? " + customerLine.isEmpty());

        // --- 2. Adding Elements to the Queue ---
        // The add() or offer() method adds an element to the TAIL (end) of the queue.
        // offer() is generally preferred as it returns false for capacity-restricted
        // queues if full, whereas add() throws an exception.
        System.out.println("\n--- Adding elements (Enqueue) ---");
        customerLine.offer("Alice");
        System.out.println("Added 'Alice'. Queue: " + customerLine);
        customerLine.offer("Bob");
        System.out.println("Added 'Bob'.   Queue: " + customerLine);
        customerLine.offer("Charlie");
        System.out.println("Added 'Charlie'. Queue: " + customerLine); // Charlie is at the end.

        // --- 3. Peeking at the Head Element ---
        // The peek() method looks at the element at the HEAD (front) of the queue
        // WITHOUT removing it. It returns null if the queue is empty.
        System.out.println("\n--- Peeking at the head ---");
        String nextInLine = customerLine.peek();
        System.out.println("Element at the head (peek): " + nextInLine); // Alice, the first one in.
        System.out.println("Queue after peek: " + customerLine); // The queue is unchanged.

        // --- 4. Removing Elements from the Queue ---
        // The poll() or remove() method removes and returns the element at the HEAD.
        // This follows the FIFO principle.
        // poll() is preferred as it returns null if the queue is empty, whereas remove() throws an exception.
        System.out.println("\n--- Removing elements (Dequeue) ---");
        String servedCustomer1 = customerLine.poll(); // Removes Alice, who was the first one in.
        System.out.println("Served (polled) customer: " + servedCustomer1);
        System.out.println("Queue after poll: " + customerLine);

        String servedCustomer2 = customerLine.poll(); // Removes Bob.
        System.out.println("Served (polled) customer: " + servedCustomer2);
        System.out.println("Queue after poll: " + customerLine);
        
        // --- 5. Checking the Size ---
        System.out.println("\n--- Final check ---");
        System.out.println("Current size of the queue: " + customerLine.size());
        
        // Remove the last element
        customerLine.poll();
        System.out.println("Queue after final poll: " + customerLine);
        System.out.println("Is the queue empty now? " + customerLine.isEmpty());
        
        // Polling from an empty queue
        String noOneThere = customerLine.poll();
        System.out.println("Polling an empty queue returns: " + noOneThere);
    }
}