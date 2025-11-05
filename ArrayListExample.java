import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Displaying the list
        System.out.println("🍎 Fruit List: " + fruits);

        // Accessing elements using index
        System.out.println("First fruit: " + fruits.get(0));

        // Modifying an element
        fruits.set(1, "Blueberry");
        System.out.println("After modifying: " + fruits);

        // Removing an element
        fruits.remove("Cherry");
        System.out.println("After removing 'Cherry': " + fruits);

        // Checking size
        System.out.println("Number of fruits: " + fruits.size());

        // Checking if list contains a value
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Iterating through elements
        System.out.println("\n📋 List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the list
        fruits.clear();
        System.out.println("\nAfter clearing: " + fruits);
    }
}
