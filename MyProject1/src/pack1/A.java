package pack1; // declaring package name

public class A {
    public int pub = 10;        // public access
    protected int pro = 20;     // protected access
    int def = 30;               // default access
    private int pri = 40;       // private access

    public void display() {
        System.out.println("Inside class A (pack1)");
        System.out.println("Public: " + pub);
        System.out.println("Protected: " + pro);
        System.out.println("Default: " + def);
        System.out.println("Private: " + pri);
    }
}
