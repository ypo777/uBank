
package banking;

import java.sql.*;
import javax.swing.JOptionPane;



public class javaconnect {
       static Connection conn;

    public static Connection ConncerDB(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uBank?" +
                    "user=root&password=juxdoit");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("SQLException: " + e.getMessage());

        }
        return null;
    }
}
