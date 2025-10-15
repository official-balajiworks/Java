class OutOfMemoryDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[Integer.MAX_VALUE]; // huge array
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: " + e);
        }
    }
}
