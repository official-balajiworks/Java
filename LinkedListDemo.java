import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> list = new LinkedList<>();

        // (a) Insertion
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After insertion: " + list);

        // (b) Deletion
        list.remove("Banana");
        System.out.println("After deletion: " + list);

        // (c) Add First
        list.addFirst("Mango");
        System.out.println("After adding first: " + list);

        // (d) Add Last
        list.addLast("Orange");
        System.out.println("After adding last: " + list);

        // (e) Display elements
        System.out.println("\nFinal Linked List elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
