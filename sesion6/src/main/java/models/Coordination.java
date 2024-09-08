package models;

/**
 * @author fitto
 * @version 1.0
 * @created 08-sep.-2024 16:01:51
 */
public class Coordination {

    private int codigo;
    private String nombre;
    public Coordination(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
