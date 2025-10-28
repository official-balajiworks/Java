// 'class' keyword is used to define a blueprint for creating objects
// 'Shared' is the name of the class that will be used for inter-thread communication
class Shared {
    // 'boolean' is a primitive data type that can store true or false
    // 'ready' is an instance variable that indicates if data is ready to be consumed
    boolean ready = false;

    // 'synchronized' keyword ensures that only one thread can execute this method at a time
    // 'void' indicates that the method doesn't return any value
    synchronized void produce() {
        System.out.println("Producing data...");
        ready = true;
        // 'notify()' wakes up a single thread that is waiting on this object's monitor
        notify(); // signal consumer
    }

    // 'synchronized' ensures thread-safe access to shared resources
    synchronized void consume() {
        // 'while' loop continuously checks the condition until it becomes false
        // '!' is the logical NOT operator that inverts the boolean value
        while (!ready) {
            try {
                // 'wait()' causes the current thread to wait until another thread calls notify()
                wait();
            } catch (InterruptedException e) {
                // 'try-catch' handles exceptions that might occur during thread execution
                // 'InterruptedException' is thrown when a waiting thread is interrupted
            }
        }
        System.out.println("Consuming data...");
    }
}

// 'public' keyword makes the class accessible from anywhere
// 'class' defines a new class named 'ITCDemo' (Inter-Thread Communication Demo)
public class ITCDemo {
    // 'public' makes the method accessible from anywhere
    // 'static' means this method belongs to the class rather than instances
    // 'void' indicates no return value
    // 'main' is the entry point of the program
    // 'String[] args' accepts command-line arguments as an array of strings
    public static void main(String[] args) {
        // Creates a new instance of the Shared class
        Shared s = new Shared();

        // 'new Thread()' creates a new thread
        // '() ->' is a lambda expression, a compact way to define anonymous functions
        // 'start()' begins the execution of the thread
        new Thread(() -> s.consume()).start();
        new Thread(() -> s.produce()).start();
    }
}
