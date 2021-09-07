package banking;
import java.sql.*;

public class test {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    public static void main(String[] args){
        String URL = "jdbc:mysql://localhost:3306/uBank&";
        String USER = "user=root&";
        String PASSWORD = "password=Juxdoit2021#";

        try{
            conn = DriverManager.getConnection(URL + USER + PASSWORD );
            String sql = "select * from Generator";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                String result = rs.getString("Admin");
                System.out.println(result);
            }

        }catch (Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }



    }
}