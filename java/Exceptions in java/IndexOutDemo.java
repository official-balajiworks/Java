class IndexOutDemo {
    public static void main(String[] args) {
        try {
            String str = "Java";
            System.out.println(str.charAt(10));  // invalid index
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e);
        }
    }
}
