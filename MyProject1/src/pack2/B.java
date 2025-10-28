package pack2; // declaring package name
import pack1.A; // importing pack1 to use class A

public class B extends A { // subclass of A
    public static void main(String[] args) {
        A objA = new A();  // creating object of A
        B objB = new B();  // object of subclass

        System.out.println("Accessing members using objA:");
        System.out.println("Public: " + objA.pub);      // ✅ accessible
        // System.out.println("Protected: " + objA.pro); // ❌ not accessible via object
        // System.out.println("Default: " + objA.def);   // ❌ not accessible (different package)
        // System.out.println("Private: " + objA.pri);   // ❌ not accessible

        System.out.println("\nAccessing inherited members using objB:");
        System.out.println("Public: " + objB.pub);      // ✅ accessible
        System.out.println("Protected: " + objB.pro);   // ✅ accessible (through inheritance)
        // System.out.println("Default: " + objB.def);   // ❌ not accessible
        // System.out.println("Private: " + objB.pri);   // ❌ not accessible
    }
}
