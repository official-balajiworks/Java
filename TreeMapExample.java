import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(4, "Mango");
        map.put(2, "Cherry");

        // Display TreeMap (sorted order)
        System.out.println("🌳 TreeMap Elements: " + map);

        // First and last keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // Removing a key
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Iterate through entries
        System.out.println("\n📋 Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
