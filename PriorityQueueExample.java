import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers (natural ascending order)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        // Display the PriorityQueue (order may differ)
        System.out.println("🧮 PriorityQueue elements: " + pq);

        // Peek at the head (smallest element)
        System.out.println("🔹 Head of Queue (highest priority): " + pq.peek());

        // Remove elements using poll()
        System.out.println("\nRemoving elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }

        // Add elements again
        pq.offer(15);
        pq.offer(5);
        pq.offer(25);

        System.out.println("\nNew Queue elements: " + pq);

        // Iterating through queue
        System.out.println("\nIterating through PriorityQueue:");
        for (int num : pq) {
            System.out.println(num);
        }
    }
}
