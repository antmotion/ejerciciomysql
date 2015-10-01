package ejercicio1;

/**
 * Created by carlos on 01/10/2015.
 */

public class estudiante {
    private String nombre;
    private int ide;
    estudiante(String name, int ide){this.nombre = name;this.ide = ide;}
    public String obtenernombre() {
        return nombre;
    }
    public void insertarnombre(String nombre) {
        this.nombre = nombre;
    }
    public int obtenerIDE() { return ide; }
    public void insertarIDE(int ide) { this.ide = ide; }
}