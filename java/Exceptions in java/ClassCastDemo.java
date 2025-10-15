class ClassCastDemo {
    public static void main(String[] args) {
        try {
            Object obj = Integer.valueOf(10);
            String s = (String) obj;  // invalid cast
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e);
        }
    }
}
