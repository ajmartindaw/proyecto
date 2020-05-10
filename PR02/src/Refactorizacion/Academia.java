/*
 * Antonio J. Martin
 * E-mail: ajmartin81@gmail.com
 * Github: ajmartin81
 */
package Refactorizacion;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Aj
 */
public class Academia {
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    private TreeSet<Curso> cursos;
    private TreeSet<Profesor> profesores;
    private TreeSet<Alumno> alumnos;
    
    public Academia(String nombre){
        this.nombre = nombre;
        this.direccion = "";
        this.email = "";
        this.telefono = "";
        this.cursos = new TreeSet<>(Comparator.comparing(Curso::getNivel).thenComparing(Curso::getLetra));
        this.profesores = new TreeSet<>(Comparator.comparing(Profesor::getApellidos).thenComparing(Profesor::getNombre).thenComparing(Profesor::getDNI));
        this.alumnos = new TreeSet<>(Comparator.comparing(Alumno::getApellidos).thenComparing(Alumno::getNombre).thenComparing(Alumno::getDNI));
    }
    
    public Academia(String nombre, String direccion, String email, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.cursos = new TreeSet<>(Comparator.comparing(Curso::getNivel).thenComparing(Curso::getLetra));
        this.profesores = new TreeSet<>(Comparator.comparing(Profesor::getApellidos).thenComparing(Profesor::getNombre).thenComparing(Profesor::getDNI));
        this.alumnos = new TreeSet<>(Comparator.comparing(Alumno::getApellidos).thenComparing(Alumno::getNombre).thenComparing(Alumno::getDNI));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void introducirCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    public boolean buscarCurso(Curso curso){
        return this.cursos.contains(curso);
    }
    
    public void listarCursos(){
        System.out.println("Curso | Tutor");
        for(Curso curso:this.cursos) System.out.println(curso);
        System.out.println("--------------------------------------------------");
    }
    
    public boolean eliminarCurso(Curso curso){
        Iterator<Curso> it = this.cursos.iterator();
        boolean eliminado = false;
        while(it.hasNext()){
           if(it.next().equals(curso)) {
               it.remove();
               eliminado = true;
           }
       }
       return eliminado;
    }
    
    public void introducirProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }
    
    public boolean buscarProfesor(Profesor profesor){
        return this.profesores.contains(profesor);
    }
    
    public void listarProfesores(){
        System.out.println("Profesores");
        System.out.println("--------------------------------------------------");
        for(Profesor profesor:this.profesores) System.out.println(profesor);
        System.out.println("--------------------------------------------------");
    }
    
    public boolean eliminarProfesor(Profesor profesor){
        Iterator<Profesor> it = this.profesores.iterator();
        boolean eliminado = false;
        while(it.hasNext()){
           if(it.next().equals(profesor)) {
               it.remove();
               eliminado = true;
           }
       }
       return eliminado;
    }
    
    public void introducirAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    public boolean buscarAlumno(Alumno alumno){
        return this.alumnos.contains(alumno);
    }
    
    public void listarAlumnos(){
        System.out.println("ALumnos");
        System.out.println("--------------------------------------------------");
        for(Alumno alumno:this.alumnos) System.out.println(alumno);
        System.out.println("--------------------------------------------------");
    }
    
    public boolean eliminarAlumno(Alumno alumno){
        Iterator<Alumno> it = this.alumnos.iterator();
        boolean eliminado = false;
        while(it.hasNext()){
           if(it.next().equals(alumno)) {
               it.remove();
               eliminado = true;
           }
       }
       return eliminado;
    }

    @Override
    public String toString() {
        return "Academia " + nombre + "\nCalle " + direccion + "\nEmail: " + email + " | Telefono: " + telefono;
    }
    
    
}
