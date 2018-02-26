package colegio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Colegio {

    Profesor profesor;
    String nombrecol;
    ArrayList estudiantes;
    ArrayList cursos;

    /*public Colegio() {
        profesores = new ArrayList();//ArrayList es una arreglo de lista
        estudiantes = new ArrayList();
        cursos = new ArrayList();
    }*/
    public static void main(String[] args) {
        Profesor profe = new Profesor(JOptionPane.showInputDialog("Nombre Profesor:"));//ins obj pro, 
        Curso curso = new Curso(JOptionPane.showInputDialog("Nombre curso:"), profe);//ins obj cur
        profe.addpro(profe);//invcando metodo add profe.

        System.out.println("Nombre de profesor es: " + profe.dameNombre());

    }

}

class Profeso {

    public Profeso() {

    }
}
