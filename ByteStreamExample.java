import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("C:\\Users\\vidhi\\Downloads\\file1.txt");
            output = new FileOutputStream("output.txt");

            int data;
            System.out.println("📄 File content being copied:\n");

            while ((data = input.read()) != -1) {
                // Display the character (convert byte to char)
                System.out.print((char) data);

                // Write byte to output file
                output.write(data);
            }

            System.out.println("\n\n✅ File copied successfully using Byte Stream!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            try {
                if (input != null) input.close();
                if (output != null) output.close();
            } 
            catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}
