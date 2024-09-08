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
    private ArrayList<Coordination> coordinations;
    public Faculty() {
        coordinations = new ArrayList<>();
    }

    public void agregarCoordinacion(int id, String nombre) {
        Coordination nuevaCoordinacion = new Coordination(id, nombre);
        coordinations.add(nuevaCoordinacion);
    }

    public ArrayList<Coordination> mostrarListoCoordinacion() {
        return coordinations;
    }

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
