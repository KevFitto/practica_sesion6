package org.kyfd;

import models.Coordination;
import models.Faculty;
import models.Professor;

public class Main {
    public static void main(String[] args) {
        // Crear una coordinación
        Coordination coordinacion1 = new Coordination(12345, "Ingenieria en Sistemas");

        // Crear un profesor y asignarle una coordinación
        Professor profesor1 = new Professor();
        profesor1.setNombre("Kevin");
        profesor1.setApellidos("Fittoria");
        profesor1.setId("123");
        profesor1.setTitulo("ING.");
        profesor1.setCoordinacion(coordinacion1);

        // Crear una facultad y agregar la coordinación
        Faculty facultad1 = new Faculty();
        facultad1.setEdificio("Edificio o");
        facultad1.setId(1);
        facultad1.setNombre("Facultad de Ingenieria");
        facultad1.agregarCoordinacion(12345, "Ingenieria en sistemas");

        // Mostrar información
        System.out.println("Información del Profesor:");
        System.out.println("Nombre: " + profesor1.getNombre() + " " + profesor1.getApellidos());
        System.out.println("ID: " + profesor1.getId());
        System.out.println("Título: " + profesor1.getTitulo());
        System.out.println("Coordinación: " + profesor1.getCoordinacion().getNombre());

        System.out.println("\nInformación de la Facultad:");
        System.out.println("Nombre: " + facultad1.getNombre());
        System.out.println("Edificio: " + facultad1.getEdificio());
        System.out.println("Listado de Coordinaciones:");
        for (Coordination coord : facultad1.mostrarListoCoordinacion()) {
            System.out.println("Coordinacion ID: " + coord.getCodigo() + " Nombre: " + coord.getNombre());
        }
    }
}