import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbHelperPSQL
{
    public static Connection con = null;

    public DbHelperPSQL() {
        if(con==null)
        {
            //Configuring and Starting the database
            ConfigureConnection();
        }
    }
    private void ConfigureConnection()
    {
        try {
            Class.forName("org.postgresql.Driver");
            //database information

            String dbType = "jdbc:postgresql:";
            String dbUrl = "//localhost:";
            String dbPort = "7770/";
            String dbName = "postgres";
            String dbUser = "postgres";
            String dbPass = "root";

            // Establishing connection
            con = DriverManager.getConnection(dbType+dbUrl+dbPort+dbName,dbUser,dbPass);
           // con = DriverManager.getConnection("jdbc:postgresl://locahost:7770/postgres","postgres","root");
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
