
package project;


  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SK
 */
public class ConnectionProvider {
     
    public static Connection getcon(){

    try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "netbanking", "mca5");
            return con;

}catch(ClassNotFoundException | SQLException e){


        return null;

}

   
}


 }

