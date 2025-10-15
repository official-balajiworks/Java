class InterruptedExDemo {
    public static void main(String[] args) {
        try {
            Thread t = new Thread();
            t.start();
            t.interrupt();  // interrupt thread
            Thread.sleep(1000); // sleep
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        }
    }
}
