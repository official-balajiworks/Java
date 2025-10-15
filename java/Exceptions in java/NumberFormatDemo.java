class NumberFormatDemo {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int num = Integer.parseInt(s);  // invalid number
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        }
    }
}
