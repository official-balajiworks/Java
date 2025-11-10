import java.sql.*;

class JDBCExample {
    public static void main(String[] args) {
        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "password");

          // Create a Database
          String createDB = "CREATE DATABASE studentdb";
          stmt.executeUpdate(createDB);
          System.out.println("Database created successfully!");

          // Connect to the New Database
          Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "password");
          Statement stmt2 = con2.createStatement();
          
          // Create a Table
          String createTable = "CREATE TABLE students (" +
                     "id INT PRIMARY KEY, " +
                     "name VARCHAR(50), " +
                     "age INT)";
          stmt2.executeUpdate(createTable);
          System.out.println("Table 'students' created successfully!");



          // Add (Insert) a Row
          String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, 101);
          ps.setString(2, "Babe");
          ps.setInt(3, 20);

         int rows = ps.executeUpdate();
         System.out.println(rows + " record(s) inserted successfully!");

        // 3. Modify (Update) a Row
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "Babe Updated");
        ps.setInt(2, 21);
        ps.setInt(3, 101);

        int rows = ps.executeUpdate();
        System.out.println(rows + " record(s) updated successfully!");

        // Delete a Row
        String sql = "DELETE FROM students WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 101);

        int rows = ps.executeUpdate();
        System.out.println(rows + " record(s) deleted successfully!");
          
        // Read (Retrieve) Data
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) {
          System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
        }

         // Create SQL Query (Filtering Columns)
        String sql = "SELECT name, age FROM students WHERE age > 20";

          
        // Execute the Query
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        // Display the Filtered Columns
        while (rs.next()) {
          String name = rs.getString("name");
          int age = rs.getInt("age");
          System.out.println("Name: " + name + ", Age: " + age);
        }

        // removing duplicates
        String sql = "DELETE FROM students WHERE id NOT IN (SELECT * FROM (SELECT MIN(id) FROM students GROUP BY name, age, city) AS temp)";

            rs.close();
            stmt.close();
            con.close(); // Always close the connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
