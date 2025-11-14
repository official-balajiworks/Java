# JDBC Example - Student Database Management

## Overview
This is a **Java JDBC (Java Database Connectivity)** application that demonstrates how to manage a MySQL database for storing student records. The program provides an interactive menu-driven interface to perform CRUD operations (Create, Read, Update, Delete) on a `students` table.

---

## Workflow

### Step-by-Step Process

1. **Database Creation**
   - Connects to MySQL server on `localhost:3306`
   - Creates a database named `studentdb` if it doesn't exist

2. **Table Creation**
   - Creates a `students` table with the following columns:
     - `id` (INT, PRIMARY KEY, AUTO_INCREMENT)
     - `name` (VARCHAR(50))
     - `age` (INT)

3. **Interactive Menu**
   - Displays a menu with 7 options plus exit
   - User can perform various database operations
   - Program continues until user selects exit (Option 0)

4. **Database Connection Closure**
   - Closes all database resources (Statement, Connection, Scanner)
   - Ensures proper cleanup and prevents resource leaks

---

## Features & Functions

### 1. **Insert a Row** (Option 1)
- **Function**: Allows user to add a new student record
- **Input**: Student name and age
- **SQL Query**: `INSERT INTO students (name, age) VALUES (?, ?)`
- **Uses**: `PreparedStatement` for parameterized queries (prevents SQL injection)

### 2. **Add a New Column** (Option 2)
- **Function**: Dynamically adds a new column to the table
- **Input**: Column name and data type (e.g., VARCHAR(50), INT)
- **SQL Query**: `ALTER TABLE students ADD COLUMN <colName> <dataType>`
- **Uses**: `Statement` for DDL (Data Definition Language) operations

### 3. **Modify Existing Row** (Option 3)
- **Function**: Updates student information
- **Input**: Student ID, new name, and new age
- **SQL Query**: `UPDATE students SET name = ?, age = ? WHERE id = ?`
- **Uses**: `PreparedStatement` for secure parameterized updates

### 4. **Rename a Column** (Option 4)
- **Function**: Renames an existing column in the table
- **Input**: Current column name and new column name
- **SQL Query**: `ALTER TABLE students CHANGE <oldCol> <newCol> VARCHAR(50)`
- **Uses**: `Statement` for DDL operations

### 5. **Filter Rows (WHERE condition)** (Option 5)
- **Function**: Retrieves and displays records based on a filter condition
- **Input**: Age condition (e.g., >20, <25, =30)
- **SQL Query**: `SELECT * FROM students WHERE age <condition>`
- **Uses**: `ResultSet` to iterate through filtered results

### 6. **Show All Data** (Option 6)
- **Function**: Displays all student records in the database
- **SQL Query**: `SELECT * FROM students`
- **Uses**: `ResultSet` with loop to print all records

### 7. **Remove Duplicates** (Option 7)
- **Function**: Removes duplicate records based on `name` and `age`
- **Logic**: Keeps only the record with the minimum ID and deletes others
- **SQL Query**: `DELETE FROM students WHERE id NOT IN (SELECT MIN(id) FROM students GROUP BY name, age)`
- **Uses**: `Statement` for DELETE operation with GROUP BY

---

## Database Connection Details

| Property | Value |
|----------|-------|
| Database Type | MySQL |
| Host | localhost |
| Port | 3306 |
| Database Name | studentdb |
| Username | root |
| Password | 29072006 |
| JDBC Driver | com.mysql.cj.jdbc.Driver |
| Connection URL | jdbc:mysql://localhost:3306/studentdb |

---

## Compilation & Execution

### Prerequisites
- **Java Development Kit (JDK)** - Java 8 or higher
- **MySQL Server** - Running on localhost:3306
- **MySQL Connector JAR** - `mysql-connector-j-8.3.0.jar` in the `lib` folder

### Directory Structure
```
JDBCExample/
├── src/
│   ├── JDBCExample.java          (Source file)
│   └── JDBCExample.class         (Compiled bytecode)
├── lib/
│   └── mysql-connector-j-8.3.0.jar  (MySQL JDBC Driver)
└── README.md                      (This file)
```

### Compilation Command

**From the root directory:**
```powershell
javac -cp "lib\mysql-connector-j-8.3.0.jar" src\JDBCExample.java
```

**Explanation:**
- `javac` - Java compiler
- `-cp "lib\mysql-connector-j-8.3.0.jar"` - Classpath flag to include the MySQL connector JAR
- `src\JDBCExample.java` - Source file to compile
- Output: `JDBCExample.class` is generated in the `src` folder

### Execution Command

**From the root directory:**
```powershell
java -cp "lib\mysql-connector-j-8.3.0.jar;src" JDBCExample
```

**Explanation:**
- `java` - Java runtime
- `-cp "lib\mysql-connector-j-8.3.0.jar;src"` - Classpath containing:
  - `lib\mysql-connector-j-8.3.0.jar` - MySQL driver
  - `src` - Location of compiled `.class` file
- `JDBCExample` - Class name to execute

### Alternative Execution (from src folder):
```powershell
cd src
java -cp "..\lib\mysql-connector-j-8.3.0.jar;." JDBCExample
```

---

## Key Java Classes & Methods Used

| Class | Purpose |
|-------|---------|
| `java.sql.Connection` | Manages database connection |
| `java.sql.Statement` | Executes simple SQL queries |
| `java.sql.PreparedStatement` | Executes parameterized SQL queries (secure) |
| `java.sql.ResultSet` | Holds query results and allows iteration |
| `java.sql.DriverManager` | Manages JDBC drivers and connections |
| `java.util.Scanner` | Reads user input from console |

### Important Methods

- **`Class.forName()`** - Loads JDBC driver
- **`DriverManager.getConnection()`** - Establishes database connection
- **`stmt.executeUpdate()`** - Executes INSERT, UPDATE, DELETE, ALTER queries
- **`stmt.executeQuery()`** - Executes SELECT queries
- **`rs.next()`** - Moves cursor to next row in ResultSet
- **`rs.getInt()`, `rs.getString()`** - Retrieves column values

---

## Error Handling

The program includes try-catch blocks to handle:
- **ClassNotFoundException** - JDBC driver not found
- **SQLException** - Database connection or query errors
- **General Exception** - Other runtime errors

All errors are caught and user-friendly messages are displayed.

---

## Sample Output

```
✅ Table 'students' is ready.

========= MENU =========
1. Insert a Row
2. Add a New Column
3. Modify Existing Row
4. Rename a Column
5. Filter Rows (WHERE condition)
6. Show All Data
7. Remove Duplicates
0. Exit
Enter your choice: 1
Enter Name: John Doe
Enter Age: 25
✅ 1 record inserted successfully!
```

---

## Security Notes

⚠️ **Important Security Considerations:**

1. **Credentials in Code**: Database credentials (username, password) are hardcoded in the source file. For production, use:
   - Environment variables
   - Configuration files
   - Spring Cloud Config or similar

2. **SQL Injection Prevention**: This code uses `PreparedStatement` for parameterized queries, which prevents SQL injection attacks.

3. **Input Validation**: Consider adding validation for user inputs in a production environment.

---

## Requirements Met

✅ Connects to MySQL driver using JAR file in `lib` folder  
✅ Performs CRUD operations on students table  
✅ Interactive menu-driven interface  
✅ Includes duplicate removal functionality  
✅ Proper resource management and cleanup  
✅ Error handling and user feedback  
✅ Well-documented with README

---

## Troubleshooting

| Issue | Solution |
|-------|----------|
| "JDBC Driver not found" | Ensure `mysql-connector-j-8.3.0.jar` is in the `lib` folder |
| "Connection refused" | Verify MySQL server is running on localhost:3306 |
| "Access denied" | Check username (root) and password (29072006) in the code |
| "Class file not found" | Recompile using the compilation command above |
| "Unknown database" | Database will be created automatically on first run |

---

## License
This is an educational project for learning JDBC concepts.

---

**Last Updated:** November 14, 2025  
**Author:** JDBC Example Project
