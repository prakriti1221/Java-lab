package unit4_lab_Jdbc;

import java.sql.*;

public class Transaction {
public static void main(String[] args) throws ClassNotFoundException {
        
        try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakritidb", "root", "root");
            con.setAutoCommit(false);
            
            Statement stmt = con.createStatement();
            
            String sql1 = "UPDATE Collegetbl SET College_name = 'BernHardt College' WHERE College_id = '1'";
            stmt.executeUpdate(sql1);
            
            String sql2 = "UPDATE Collegetbl SET College_name = 'Prime College' WHERE College_id = '2'";
            stmt.executeUpdate(sql2);
            
            con.commit();
         
            stmt.close();
            con.close();
            
            System.out.println("Transaction completed successfully.");
            
        } 
        catch (SQLException e) {            
            e.printStackTrace();
        }
    }
}
