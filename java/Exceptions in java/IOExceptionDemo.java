import java.io.*;

class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("missing.txt");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
