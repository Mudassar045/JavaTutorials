import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbHelperMySQL
{
    public static Connection con = null;

    public DbHelperMySQL() {
        if(con==null)
        {
            //Configuring and Starting the database
            ConfigureConnection();
        }
    }
    private void ConfigureConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //database information

            String dbType = "jdbc:mysql:";
            String dbUrl = "//localhost:";
            String dbPort = "3306/";
            String dbName = "mydb";
            String dbUser = "root";
            String dbPass = "";

            // Establishing connection
            con = DriverManager.getConnection(dbType+dbUrl+dbPort+dbName,dbUser,dbPass);
            //  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
