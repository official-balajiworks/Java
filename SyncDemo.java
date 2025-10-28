class Shared {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(400); } catch (Exception e) {}
        }
    }
}

class MyThread1 extends Thread {
    Shared s;
    MyThread1(Shared s) { this.s = s; } // When you create a new object of MyThread1, you must pass a Shared object as an argument.
    public void run() { s.printTable(5); }
}

class MyThread2 extends Thread {
    Shared s;
    MyThread2(Shared s) { this.s = s; }
    public void run() { s.printTable(100); }
}

public class SyncDemo {
    public static void main(String[] args) {
        Shared obj = new Shared();
        new MyThread1(obj).start();
        new MyThread2(obj).start();
    }
}
