import java.sql.*;
import java.util.*;

public class JDBCExample {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "29072006";

    // Get DB connection
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            // Step 1: Create Database if not exists
            Connection rootCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/", USER, PASSWORD);
            Statement rootStmt = rootCon.createStatement();
            rootStmt.executeUpdate("CREATE DATABASE IF NOT EXISTS studentdb");
            rootStmt.close();
            rootCon.close();

            // Step 2: Connect to studentdb
            Connection con = getConnection();
            Statement stmt = con.createStatement();

            // Step 3: Create Table if not exists
            String createTable = "CREATE TABLE IF NOT EXISTS students (" +
                                 "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "name VARCHAR(50), " +
                                 "age INT)";
            stmt.executeUpdate(createTable);
            System.out.println("✅ Table 'students' is ready.");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n========= MENU =========");
                System.out.println("1. Insert a Row");
                System.out.println("2. Add a New Column");
                System.out.println("3. Modify Existing Row");
                System.out.println("4. Rename a Column");
                System.out.println("5. Filter Rows (WHERE condition)");
                System.out.println("6. Show All Data");
                System.out.println("7. Remove Duplicates");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
                        PreparedStatement psInsert = con.prepareStatement(insertSQL);
                        psInsert.setString(1, name);
                        psInsert.setInt(2, age);
                        int rows = psInsert.executeUpdate();
                        System.out.println("✅ " + rows + " record inserted successfully!");
                        psInsert.close();
                    }

                    case 2 -> {
                        System.out.print("Enter new column name: ");
                        String colName = sc.nextLine();
                        System.out.print("Enter data type (e.g., VARCHAR(50), INT): ");
                        String dataType = sc.nextLine();

                        String alterSQL = "ALTER TABLE students ADD COLUMN " + colName + " " + dataType;
                        stmt.executeUpdate(alterSQL);
                        System.out.println("✅ Column '" + colName + "' added successfully!");
                    }

                    case 3 -> {
                        System.out.print("Enter student ID to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new Age: ");
                        int newAge = sc.nextInt();

                        String updateSQL = "UPDATE students SET name = ?, age = ? WHERE id = ?";
                        PreparedStatement psUpdate = con.prepareStatement(updateSQL);
                        psUpdate.setString(1, newName);
                        psUpdate.setInt(2, newAge);
                        psUpdate.setInt(3, id);
                        int rows = psUpdate.executeUpdate();
                        System.out.println("✅ " + rows + " record updated successfully!");
                        psUpdate.close();
                    }

                    case 4 -> {
                        System.out.print("Enter current column name: ");
                        String oldCol = sc.nextLine();
                        System.out.print("Enter new column name: ");
                        String newCol = sc.nextLine();

                        String renameSQL = "ALTER TABLE students CHANGE " + oldCol + " " + newCol + " VARCHAR(50)";
                        stmt.executeUpdate(renameSQL);
                        System.out.println("✅ Column renamed from '" + oldCol + "' to '" + newCol + "'!");
                    }

                    case 5 -> {
                        System.out.print("Enter age to filter (e.g., >20): ");
                        String condition = sc.nextLine();

                        String filterSQL = "SELECT * FROM students WHERE age " + condition;
                        ResultSet rs = stmt.executeQuery(filterSQL);
                        System.out.println("\n🎓 Filtered Results:");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") +
                                               ", Name: " + rs.getString("name") +
                                               ", Age: " + rs.getInt("age"));
                        }
                        rs.close();
                    }

                    case 6 -> {
                        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
                        System.out.println("\n📋 All Students:");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") +
                                               ", Name: " + rs.getString("name") +
                                               ", Age: " + rs.getInt("age"));
                        }
                        rs.close();
                    }

                    case 7 -> {
                        String removeDuplicatesSQL = 
                            "DELETE FROM students WHERE id NOT IN (" +
                            "SELECT MIN(id) FROM students GROUP BY name, age)";
                        int rowsRemovedDuplicates = stmt.executeUpdate(removeDuplicatesSQL);
                        System.out.println("✅ " + rowsRemovedDuplicates + " duplicate record(s) removed!");
                    }

                    case 0 -> System.out.println("👋 Exiting program...");
                    default -> System.out.println("❌ Invalid choice! Try again.");
                }

            } while (choice != 0);

            stmt.close();
            con.close();
            sc.close();
            System.out.println("✅ Database connection closed.");

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
