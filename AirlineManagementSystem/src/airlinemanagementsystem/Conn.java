
package airlinemanagementsystem;

import java.sql.*;

public class Conn {
   
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem","root","9019093948@123");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
