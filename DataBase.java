import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {
    public Connection con;
    String url ="jdbc:mysql://localhost:3306/restaurantmanagement";
    String db = "restaurantmanagement";
    String user = "root";
    String pass = "";
    
    public Connection mkDataBase() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
     
        }
        return con;
    }
 
}