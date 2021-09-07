/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.sql.*;

public class reID {
    public static void sortID() throws SQLException {
        Integer count = 1;
        Connection conn = javaconnect.ConncerDB();
        String s    = "select Number from Customer_Data";
        Statement stmt = conn.createStatement();
        
        PreparedStatement ps;
        
        ResultSet rs = stmt.executeQuery(s);
        
        while(rs.next())
        {
            String id = rs.getString("Number");
            count++;
            String c    = count.toString();
            ps= conn.prepareStatement("update Customer_Data set Number='"+c+"' where Number = '"+id+"'");
            ps.executeUpdate();
            
        }
        
        
    }
}
