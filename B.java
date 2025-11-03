// Interface A with two variables and one constant
interface A {
    int var1 = 10;     // variables in interface are public, static, and final by default
    int var2 = 20;
    int C = 5;         // constant

    // Default methods (have implementation)
    default void dmethod1() {
        System.out.println("Default Method 1");
    }

    default void dmethod2() {
        System.out.println("Default Method 2");
    }

    // Non-concrete (abstract) methods
    void ncmethod1();
    void ncmethod2();
}

// Class B implements Interface A
public class B implements A {
    // Implement abstract methods
    public void ncmethod1() {
        System.out.println("Non-concrete Method 1 implemented in class B");
    }

    public void ncmethod2() {
        System.out.println("Non-concrete Method 2 implemented in class B");
    }

    // Display values of data members
    void display() {
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("Constant C = " + C);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.dmethod1();
        obj.dmethod2();
        obj.ncmethod1();
        obj.ncmethod2();
    }
}