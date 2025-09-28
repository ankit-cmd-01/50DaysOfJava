import java.util.LinkedList;
import java.util.Queue;

/**
 * A basic demonstration of the Queue interface in Java, using a LinkedList implementation.
 * This program covers the core FIFO (First-In, First-Out) operations:
 * adding (enqueue), removing (dequeue), and inspecting elements.
 */
public class QueueBasics {

    public static void main(String[] args) {

        // 1. Create a Queue
        // We declare the variable with the interface type 'Queue' and instantiate it
        // with a concrete class 'LinkedList'. This is a common best practice.
        Queue<String> customerLine = new LinkedList<>();
        System.out.println("Created an empty queue. Is it empty? " + customerLine.isEmpty());

        // 2. Add elements to the queue (Enqueue)
        // The offer() method adds an element to the TAIL (end) of the queue.
        System.out.println("\n## Adding elements (Enqueue) ##");
        customerLine.offer("Alice");
        System.out.println("Offered 'Alice'. Queue: " + customerLine);
        customerLine.offer("Bob");
        System.out.println("Offered 'Bob'.   Queue: " + customerLine);
        customerLine.offer("Charlie");
        System.out.println("Offered 'Charlie'. Queue: " + customerLine); // Charlie is at the end.

        // 3. Inspect the head element
        // The peek() method looks at the element at the HEAD (front) of the queue
        // WITHOUT removing it. It returns null if the queue is empty.
        System.out.println("\n## Peeking at the head ##");
        String nextInLine = customerLine.peek();
        System.out.println("Element at the head (peek): " + nextInLine); // Alice, the first one in.
        System.out.println("Queue after peek: " + customerLine); // The queue is unchanged.

        // 4. Remove elements from the queue (Dequeue)
        // The poll() method removes and returns the element at the HEAD.
        // This follows the FIFO principle. It returns null if the queue is empty.
        System.out.println("\n## Removing elements (Dequeue) ##");
        String servedCustomer1 = customerLine.poll(); // Removes Alice, who was the first one in.
        System.out.println("Served (polled) customer: " + servedCustomer1);
        System.out.println("Queue after poll: " + customerLine);

        String servedCustomer2 = customerLine.poll(); // Removes Bob.
        System.out.println("Served (polled) customer: " + servedCustomer2);
        System.out.println("Queue after poll: " + customerLine);
        
        // 5. Check the final state
        System.out.println("\n## Final check ##");
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