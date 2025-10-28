import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String name;
    public Task(String name) { this.name = name; }

    public void run() {
        System.out.println("Executing " + name + " by " + Thread.currentThread().getName());
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3); // 3 threads

        for (int i = 1; i <= 6; i++) {
            service.execute(new Task("Task-" + i));  // submit tasks
        }

        service.shutdown(); // stop accepting new tasks
    }
}
