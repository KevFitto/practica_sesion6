package models;

/**
 * @author fitto
 * @version 1.0
 * @created 08-sep.-2024 16:04:58
 */
public class Professor {

    private String apellidos;
    private String id;
    private String nombre;
    private String titulo;
    private Coordination coordinacion;

    public Professor() {
    }

    public Coordination getCoordinacion() {
        return coordinacion;
    }


    public void setCoordinacion(Coordination coordinacion) {
        this.coordinacion = coordinacion;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}