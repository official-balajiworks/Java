// Abstract class AC
abstract class AC {
    // Abstract methods
    abstract void amethod1();
    abstract void amethod2();

    // Non-abstract methods
    void namethod1() {
        System.out.println("Non-abstract Method 1 in AC");
    }

    void namethod2() {
        System.out.println("Non-abstract Method 2 in AC");
    }
}

// Class CC extends abstract class AC
public class CC extends AC {
    // Implement abstract methods
    void amethod1() {
        System.out.println("Abstract Method 1 implemented in CC");
    }

    void amethod2() {
        System.out.println("Abstract Method 2 implemented in CC");
    }

    public static void main(String[] args) {
        CC obj = new CC();
        obj.amethod1();
        obj.amethod2();
        obj.namethod1();
        obj.namethod2();
    }
}