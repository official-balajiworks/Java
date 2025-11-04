import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFileCharacterStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // You can hardcode or take user input
            String filePath = "C:\\Users\\vidhi\\Downloads\\file1.txt"; // ✅ Added semicolon

            // Create FileReader (Character Stream)
            FileReader reader = new FileReader(filePath);

            System.out.println("\n📖 File content:\n");

            int ch;
            // Read and display each character until end of file
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();
            System.out.println("\n\n✅ File read successfully!");

        } catch (IOException e) {
            System.out.println("⚠️ Error reading file: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
