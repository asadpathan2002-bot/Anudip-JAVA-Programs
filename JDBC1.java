1. Write a JDBC program to insert a record into a database (Table:Student: id,name,age,phone_no,email) 


mysql> CREATE DATABASE college;
Query OK, 1 row affected (0.01 sec)

mysql> USE college;
Database changed

mysql> CREATE TABLE Student(
    -> id INT PRIMARY KEY,
    -> name VARCHAR(50),
    -> age INT,
    -> phone_no VARCHAR(15),
    -> email VARCHAR(50)
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> DESC Student;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(50) | YES  |     | NULL    |       |
| age      | int         | YES  |     | NULL    |       |
| phone_no | varchar(15) | YES  |     | NULL    |       |
| email    | varchar(50) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+

CODE:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "root");
           
            String query = "INSERT INTO Student VALUES(?,?,?,?,?)";

            
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Asad");
            ps.setInt(3, 21);
            ps.setString(4, "9876543210");
            ps.setString(5, "asad@gmail.com");

          
            int i = ps.executeUpdate();
            if(i > 0) {
                System.out.println("Record inserted successfully");
            }
          
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

OUTPUT:
Record inserted successfully

mysql> SELECT * FROM Student;
+-----+------+-----+------------+------------------+
| id  | name | age | phone_no   | email            |
+-----+------+-----+------------+------------------+
| 101 | Asad | 21  | 9876543210 | asad@gmail.com   |
+-----+------+-----+------------+------------------+

