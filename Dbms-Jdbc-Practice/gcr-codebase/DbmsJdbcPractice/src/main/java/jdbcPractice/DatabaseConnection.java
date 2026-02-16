package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
private static final String URL="jdbc:mysql://localhost:3306/practice_db";
private static final String USER = "root";
private static final String PASSWORD = "yash@123";

public static Connection getConnection() {
	Connection con = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Database connected successfully");
	}catch(ClassNotFoundException e) {
		System.err.println("MySQL JDBC Driver not found!");
		e.printStackTrace();
	}
	
	catch(SQLException e) {
		System.out.println("Connection Failed!");
		e.printStackTrace();
	}
	return con;
}
public static void main(String[] args) {
	Connection conn = getConnection();
	if(conn !=null) {
		try {
			conn.close();
			System.out.println("Connection closed.");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
 }
}
