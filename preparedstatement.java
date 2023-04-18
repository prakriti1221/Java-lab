package unit4_lab_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedstatement {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakritidb", "root", "root");
			
			String updateSql = "UPDATE person SET firstname = ?, lastname = ?, contactnumber = ? WHERE firstname = ?";
			PreparedStatement stmt = con.prepareStatement(updateSql);
			stmt.setString(1, "Prakriti");
	        stmt.setString(2, "Paudel");
	        stmt.setString(3, "9823704233");
	        stmt.setString(4, "Swikriti"); // update the row with firstname = "John"
	        int rowsUpdated = stmt.executeUpdate();
	        System.out.println("Updated " + rowsUpdated + " row(s) in database!");
	        
	        String deleteSql = "DELETE FROM person WHERE firstname = ?";
            stmt = con.prepareStatement(deleteSql);
            stmt.setString(1, "Pranisha"); // delete the row with firstname = "Mary"
            int rowsDeleted = stmt.executeUpdate();
            System.out.println("Deleted " + rowsDeleted + " row(s) from database!");
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}

	}

}
