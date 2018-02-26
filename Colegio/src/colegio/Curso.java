package colegio;

import java.util.ArrayList;

/**
 *
 * @author pwightman
 */
public class Curso {

    private String nombre;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Nota> notas;

    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        estudiantes = new ArrayList();
        notas = new ArrayList();

    }

}
