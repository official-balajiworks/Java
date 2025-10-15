import java.util.*;

class IllegalStateDemo {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            Iterator<String> itr = list.iterator();
            itr.remove();  // illegal state
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e);
        }
    }
}
