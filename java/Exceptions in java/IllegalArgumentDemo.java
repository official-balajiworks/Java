class IllegalArgumentDemo {
    static void squareRoot(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Negative value not allowed");
        System.out.println(Math.sqrt(x));
    }

    public static void main(String[] args) {
        try {
            squareRoot(-9);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e);
        }
    }
}
