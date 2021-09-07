/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.sql.*;

/**
 *
 * @author yanpaingoo
 */
public class getSize {
    //Connection conn;
   // Statement stmt;
   // ResultSet rs;
    
    public static int getID() throws SQLException{
        Connection conn = javaconnect.ConncerDB();
        int count = 0;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Customer_Data");
        
        
        while(rs.next()){
            count++;
            
            
        }
        return count;
        
    }
}
