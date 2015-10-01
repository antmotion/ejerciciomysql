package ejercicio1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ejercicio1.estudiante;

public class estudianteDAO {


    public void registrarPersona(estudiante est)  throws SQLException
    {

        try
        {

            Connection c = Conexion.getConnection();
            PreparedStatement st;
            st=c.prepareStatement("INSERT INTO contacto VALUES ('" + est.obtenernombre() + "', '" + est.obtenerIDE() + "')");
            if(st.executeUpdate()==1)
            {
                System.out.println("el nombre " + est.obtenernombre() + " a sido registrado correctamente");
            }


        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
    public ArrayList< estudiante> listaestudiantes() throws SQLException {

        ArrayList<estudiante> listaestudiantes = new ArrayList< estudiante>();

        int ide=0;
        String nombre=null;

        try {
            Connection c = Conexion.getConnection();
            Statement st = c.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM contacto");
            while(res.next()){
                estudiante estu= new estudiante(nombre,ide);
                estu.insertarIDE(Integer.parseInt(res.getString("rollNo")));
                estu.insertarnombre(res.getString("name"));
                listaestudiantes.add(estu);
            }

        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return listaestudiantes;
    }

}