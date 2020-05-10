package Refactorizacion;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/*
 * Antonio J. Martin
 * E-mail: ajmartin81@gmail.com
 * Github: ajmartin81
 */

public class Curso {
    private int nivel;
    private char letra;
    private Profesor tutor;
    private Alumno delegado;
    private TreeSet<Alumno> alumnos;
    private HashSet<Asignatura> asignaturas;

    public Curso(int nivel, char letra) {
        this.nivel = nivel;
        this.letra = letra;
        this.tutor = null;
        this.delegado = null;
        this.alumnos = new TreeSet<>(Comparator.comparing(Alumno::getApellidos).thenComparing(Alumno::getNombre).thenComparing(Alumno::getDNI));
        this.asignaturas = new HashSet<>();
    }
    
    public int getNivel() {
        return nivel;
    }

    public char getLetra() {
        return letra;
    }

    public Profesor getTutor() {
        return tutor;
    }

    public void setTutor(Profesor tutor) {
        this.tutor = tutor;
    }

    public Alumno getDelegado() {
        return delegado;
    }

    public void setDelegado(Alumno delegado) {
        this.delegado = delegado;
    }

   public void introducirAsignatura(Asignatura asignatura){
       this.asignaturas.add(asignatura);
   }
   
   public boolean buscarAsignatura(Asignatura asignatura){
       return this.asignaturas.contains(asignatura);
   }

   public boolean eliminarAsignatura(Asignatura asignatura){
       Iterator<Asignatura> it = this.asignaturas.iterator();
       boolean eliminado = false;
       while(it.hasNext()){
           if(it.next().equals(asignatura)) {
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
   
   public void listadoAsignaturas(){
       System.out.println("Asignaturas");
       for (Asignatura asignatura:this.asignaturas) System.out.println(asignatura);
       System.out.println("--------------------------------------------------");
   }
   
   public void listadoAlumnos(){
       System.out.println("Alumnos");
       System.out.println("--------------------------------------------------");
       for (Alumno alumno:this.alumnos) System.out.println(alumno);
       System.out.println("--------------------------------------------------");
   }
   
   public void detallesCurso(){
       System.out.println("Curso" + nivel + "º" + letra);
       System.out.println("Tutor : " + tutor.getApellidos() + ", " + tutor.getNombre());
       System.out.println("Delegado: " + delegado.getApellidos() + ", " + delegado.getNombre());
       System.out.println("--------------------------------------------------");
       this.listadoAsignaturas();
       this.listadoAlumnos();
   }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.nivel != other.nivel) {
            return false;
        }
        if (this.letra != other.letra) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nivel + "º" + letra + " | " + tutor.getNombre() + " " + tutor.getApellidos();
    }
   
   
}
