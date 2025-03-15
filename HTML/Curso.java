/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor de Curso que tiene como parametro un atributo nombre.
     * @param nombre
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Sobreescribe la clase toString para mostar eb xpediente,el nif, el nombre y apellidos del alumno.
     * @return
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade alumnos a un ArrayList de personas.
     * @param p
     */
    public void aniadirAlumno(Persona p) {

        listaAlumnos.add(p);
    }

    /**
     * GETTER de ListaAlumnos
     * @return
     *
     */
    public TreeSet<Persona> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(TreeSet<Persona> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
}
