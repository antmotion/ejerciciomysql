package ejercicio1;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by carlos on 01/10/2015.
 */

public class testmisql
        {
            public static void main(String[] args) throws SQLException
            {
                estudianteDAO estudao= new estudianteDAO();
                estudiante estu= new estudiante("pedro",6);
                estudao.registrarPersona(estu);

                ArrayList<estudiante> listadeestudiantes = estudao.listaestudiantes();
                if (listadeestudiantes.size()>0) {
                    int numeroPersona=0;
                    //se recorre la lista de personas asignandose cada posicion en un objeto persona
                    for (int i = 0; i <listadeestudiantes.size(); i++) {
                        numeroPersona++;
                        estu=listadeestudiantes.get(i);
                        System.out.println("**************************************");
                        System.out.println("Nombre estudiante: "+estu.obtenernombre());
                        System.out.println("Id Persona: "+estu.obtenerIDE());
                        System.out.println("*************************************************\n");
                    }
                }else {
                    System.out.println("Actualmente no hay registros");
                }
            }
        }

