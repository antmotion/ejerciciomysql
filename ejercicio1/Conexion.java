package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by carlos on 01/10/2015.
 */


public class Conexion
{
    private static Connection con=null;
    public static Connection getConnection()throws SQLException
    {
        try
        {
            if( con == null )
            {
                String driver="com.mysql.jdbc.Driver";
                String url="jdbc:mysql://localhost/estudiantes?autoReconnect=true";
                String pwd="0000";
                String usr="root";
                Class.forName(driver);
                con = DriverManager.getConnection(url,usr,pwd);
                System.out.println("Conexión establecida");
            }
        }
        catch(SQLException ex)
        {
            System.out.println("Hubo un problema al intentar conecarse a la base de datos");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
        return con;
    }
}

