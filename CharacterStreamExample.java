import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreamExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Ask for file path
            String filePath = "C:\\Users\\vidhi\\Desktop\\charstream.txt";

            // Ask for number of lines
            System.out.print("Enter number of lines to write: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            // Create FileWriter (Character Stream)
            FileWriter writer = new FileWriter(filePath);

            // Write user input
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter line " + i + ": ");
                String line = sc.nextLine();
                writer.write(line + "\n");
            }

            writer.close();
            System.out.println("\n✅ Data successfully written to: " + filePath);

            // Now read the file back
            System.out.println("\n📖 File content:");
            FileReader reader = new FileReader(filePath);

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
