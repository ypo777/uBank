import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {

  public static void main(String[] arg) {
   try {
     Class.forName("com.mysql.jdbc.Driver").newInstance();
   }catch (Exception ex){

   }

  }

}
