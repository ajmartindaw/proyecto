package Refactorizacion;


import java.time.LocalDate;
import java.util.Objects;

/*
 * Antonio J. Martin
 * E-mail: ajmartin81@gmail.com
 * Github: ajmartin81
 */

public class Alumno extends Persona{
    
    private Boolean delegado;
    private String tutorLegal;

    public Alumno(String Nombre, String Apellidos, LocalDate fn, String Direccion, String DNI, String Email, String Telefono) {
        this.nombre = Nombre;
        this.apellidos = Apellidos;
        this.fechaNacimiento = fn;
        this.direccion = Direccion;
        this.dni = DNI;
        this.email = Email;
        this.telefono = Telefono;
    }


    public Boolean getDelegado() {
        return delegado;
    }

    public void setDelegado(Boolean delegado) {
        this.delegado = delegado;
    }

    public String getTutorLegal() {
        return tutorLegal;
    }

    public void setTutorLegal(String tutorLegal) {
        this.tutorLegal = tutorLegal;
    }

    @Override
    public String toString() {
        return apellidos + ", " + nombre + "\nFecha de nacimiento: =" + fechaNacimiento + "\nDireccion: " + direccion + "\nDNI: " + dni + "\nEmail: " + email + "\nTelefono: " + telefono + "\nTutor legal: " + tutorLegal + "\n---------------" + (delegado?"\nEs delegado de su clase.":"");
    }
    
}
