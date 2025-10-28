class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                           " with priority " +
                           Thread.currentThread().getPriority());
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
