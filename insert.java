package unit4_lab_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakritidb", "root", "root");
		
		//create statement
		Statement st = con.createStatement();
		
		System.out.println("Inserting records...");
		
		//execute SQL query
		String query = "Insert Into person values('Prabesh','Paudel', '9845366417')";
		st.executeUpdate(query);
		
		System.out.println("Records inserted successfully");
		
		con.close();
		st.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
}
