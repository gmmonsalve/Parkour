/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.ArrayList;

/**
 *
 * @author pwightman
 */
public class Profesor {

    private String nombre;
    private ArrayList<Curso> cursos;
    private ArrayList profesores;

    public Profesor(String nombre) {
        this.nombre = nombre;
        cursos = new ArrayList();

    }

    public String dameNombre() {
        return nombre;
    }

    public void addpro(Profesor profe) {
        this.profesores.add(profe);
    }

}
