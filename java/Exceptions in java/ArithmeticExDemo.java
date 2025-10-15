class ArithmeticExDemo {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;  // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
// Output: ArithmeticException: / by zero   
// This code demonstrates handling an ArithmeticException in Java.
// It attempts to divide a number by zero, which is not allowed and throws an exception.
// The exception is caught in the catch block, and an appropriate message is printed.
// The output shows the type of exception and the message associated with it.