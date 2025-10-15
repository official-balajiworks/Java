import java.sql.*;

class SQLDemo {
    public static void main(String[] args) {
        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/unknownDB", "root", "1234");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }
    }
}
