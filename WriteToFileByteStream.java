import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileByteStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // You can hardcode or take input from user
            String filePath = "C:\\Users\\vidhi\\Downloads\\output.txt"; // ✅ full path with filename

            // Ask user for number of lines
            System.out.print("Enter the number of lines to write: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            // Create or overwrite file at the given path
            FileOutputStream fos = new FileOutputStream(filePath);

            // Take user input line by line
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter line " + i + ": ");
                String line = sc.nextLine() + "\n";
                fos.write(line.getBytes());
            }

            fos.close();
            System.out.println("\n✅ Data successfully written to: " + filePath);

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
