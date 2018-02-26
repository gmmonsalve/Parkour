
package colegio;

import java.util.ArrayList;

/**
 *
 * @author pwightman
 */
public class Estudiante {
    
    String nombre;
    ArrayList<Curso> cursos;
    
    public Estudiante(String nombre){
        this.nombre = nombre;
        cursos = new ArrayList();
    }
    
    
}
