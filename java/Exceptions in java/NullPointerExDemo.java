class NullPointerExDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());  // accessing null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
