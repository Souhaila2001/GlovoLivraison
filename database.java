package GlovoLivraison;
 import java.sql.Connection;
 import java.sql.DriverManager;

public class database {
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/market", "root","");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
