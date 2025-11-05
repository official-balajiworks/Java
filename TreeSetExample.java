import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // Normal additions (sorted automatically)
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");

        System.out.println("Original TreeSet (sorted): " + set);

        set.remove("Apple");
        System.out.println("After removing 'Apple': " + set);

        // ---- AddFirst manually ----
        // If you want something to appear first, pick an element smaller than all others
        String addFirst = "Aardvark"; // Alphabetically before all
        set.add(addFirst);
        System.out.println("After addFirst(): " + set);

        // ---- AddLast manually ----
        // If you want something to appear last, pick an element greater than all others
        String addLast = "Zebra"; // Alphabetically after all
        set.add(addLast);
        System.out.println("After addLast(): " + set);
    }
}
