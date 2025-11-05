import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Apple");
        map.put(3, "Banana");
        map.put(2, "Cherry");
        map.put(4, "Mango");

        // Display all key-value pairs
        System.out.println("🍎 HashMap Elements: " + map);

        // Get value using key
        System.out.println("Get key 2: " + map.get(2));

        // Remove key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Iterate through entries
        System.out.println("\n📋 Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
