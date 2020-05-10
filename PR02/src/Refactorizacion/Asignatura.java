package Refactorizacion;

/*
 * Antonio J. Martin
 * E-mail: ajmartin81@gmail.com
 * Github: ajmartin81
 */

public class Asignatura {

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the num_horas
     */
    public int getNum_horas() {
        return num_horas;
    }

    /**
     * @param num_horas the num_horas to set
     */
    public void setNum_horas(int num_horas) {
        this.num_horas = num_horas;
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    static int contadorAsignaturas = 0;
    private int codigo;
    private String nombre;
    private int num_horas;
    private Profesor profesor;

    public Asignatura(String nombre, int num_horas, Profesor profesor) {
        contadorAsignaturas++;
        this.codigo = contadorAsignaturas;
        this.nombre = nombre;
        this.num_horas = num_horas;
        this.profesor = profesor;
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
        final Asignatura other = (Asignatura) obj;
        if (this.getCodigo() != other.getCodigo()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getCodigo() + " - " + getNombre();
    }

    
    
    
}
