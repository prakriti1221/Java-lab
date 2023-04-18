package unit4_lab_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetExample {
    ResultSet set;
    Connection con;
    Statement statement;

    public ResultsetExample() throws ClassNotFoundException, SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prakritidb", "root", "root");
        statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        set = statement.executeQuery("SELECT * FROM college");
        set.absolute(2); // navigated to 2nd row data
        set.updateString("College_name", "NSC");
        set.updateRow();

        set.first();
        set.deleteRow();
        set.close(); // close the ResultSet before executing another query

        ResultSet data = statement.executeQuery("SELECT * FROM college");
        while (data.next()) {
            System.out.println("College id: " + data.getInt("College_id"));
            System.out.println("College Name: " + data.getString("College_name"));
        }
        data.close(); // close the ResultSet after use
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new ResultsetExample();
    }

}
