
package banking;

import java.sql.*;
import javax.swing.JOptionPane;



public class javaconnect {
       static Connection conn;
       ResultSet rs;
       PreparedStatement ps;

    public static Connection ConncerDB(){
        try{
//            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/uBank", "uBank", "12345");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uBank", "root", "Juxdoit2021#");
//            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("SQLException: " + e.getMessage());

        }
        return null;
    }
}
