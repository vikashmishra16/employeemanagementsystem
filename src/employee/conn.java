package employee;
import java.sql.*;

public class conn {
    public Connection c;
    public Statement s;
    public conn(){
      try{
         Class.forName("com.mysql.jdbc.Driver");
         c =DriverManager.getConnection("jdbc:mysql://localhost:3308/mysql?zeroDateTimeBehavior=convertToNull","root","");
         s =c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
