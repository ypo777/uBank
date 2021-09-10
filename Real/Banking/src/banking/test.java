package banking;
import java.sql.*;

public class test {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    public static void main(String[] args){

        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uBank?" +
                                                    "user=root&password=juxdoit");
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