import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding normally
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        System.out.println("Original Set: " + set);

        // ---- Add First ----
        String firstElement = "Cherry";
        LinkedHashSet<String> temp1 = new LinkedHashSet<>();
        temp1.add(firstElement);
        temp1.addAll(set);
        set = temp1;
        System.out.println("After addFirst(): " + set);

        // ---- Add Last ----
        String lastElement = "Orange";
        LinkedHashSet<String> temp2 = new LinkedHashSet<>(set);
        temp2.add(lastElement);  // adds at the end
        set = temp2;
        System.out.println("After addLast(): " + set);
    }
}
