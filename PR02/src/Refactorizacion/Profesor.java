package Refactorizacion;


import java.time.LocalDate;
import java.util.Objects;

/*
 * Antonio J. Martin
 * E-mail: ajmartin81@gmail.com
 * Github: ajmartin81
 */

public class Profesor extends Persona {
    private Boolean tutor;
    private Boolean jefeDepartamento;

    public Profesor(String Nombre, String Apellidos, LocalDate fn, String Direccion, String DNI, String Email, String Telefono) {
        this.nombre = Nombre;
        this.apellidos = Apellidos;
        this.fechaNacimiento = fn;
        this.direccion = Direccion;
        this.dni = DNI;
        this.email = Email;
        this.telefono = Telefono;
    }


    public Boolean getTutor() {
        return tutor;
    }

    public void setTutor(Boolean tutor) {
        this.tutor = tutor;
    }

    public Boolean getJefeDepartamento() {
        return jefeDepartamento;
    }

    public void setJefeDepartamento(Boolean jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
    }   
    

    @Override
    public String toString() {
        return apellidos + ", "+ nombre + "\nFecha de nacimiento: =" + fechaNacimiento + "\nDireccion: " + direccion + "\nDNI: " + dni + "\nEmail: " + email + "\nTelefono: " + telefono + (tutor?"\nEs tutor.":"\nNo es tutor") + (jefeDepartamento?"\nDirige su departamento.":"");
    }
    
}
