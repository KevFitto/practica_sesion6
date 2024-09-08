package models;

import java.util.ArrayList;

/**
 * @author fitto
 * @version 1.0
 * @created 05-sep.-2024 16:03:42
 */
public class Faculty {

    private String edificio;
    private int id;
    private String nombre;
    private ArrayList<Coordination> coordinations;  // Lista para almacenar las coordinaciones

    public Faculty() {
        coordinations = new ArrayList<>();  // Inicializar la lista en el constructor
    }

    /**
     * Agrega una nueva coordinación a la lista
     *
     * @param id El ID de la coordinación
     * @param nombre El nombre de la coordinación
     */
    public void agregarCoordinacion(int id, String nombre) {
        Coordination nuevaCoordinacion = new Coordination(id, nombre);
        coordinations.add(nuevaCoordinacion);
    }

    /**
     * Retorna la lista de coordinaciones
     *
     * @return ArrayList de Coorditation
     */
    public ArrayList<Coordination> mostrarListoCoordinacion() {
        return coordinations;
    }

    // Métodos getters y setters para edificio, id, y nombre

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
