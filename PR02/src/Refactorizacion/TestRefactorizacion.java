package Refactorizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Antonio J. Martin
 * E-mail: ajmartin81@gmail.com
 * Github: ajmartin81
 */

public class TestRefactorizacion {
    
    static int opcion;
    static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char respuesta;
        String nombre = "";/*
        Solicitamos el nombre de la academia para crearla
        */
        System.out.print("Introduce el nombre de la academia > ");
        nombre = sc.nextLine();
        Academia academia = new Academia(nombre);
        
        opcion = -1;
        
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("1. Academia.");
            System.out.println("2. Cursos.");
            System.out.println("3. Profesores.");
            System.out.println("4. Alumnos.");
            System.out.println("0. Salir.");
            System.out.print("Opcion > ");
            
            leerOpcion(0,4);
            
            switch (opcion) {
                case 1:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu de academia.");
                    System.out.println("1. Modificar nombre.");
                    System.out.println("2. Modificar direccion.");
                    System.out.println("3. Modificar telefono.");
                    System.out.println("4. Modificar email.");
                    System.out.println("5. Ver informacion.");
                    System.out.print("Opcion > ");
                    
                    leerOpcion(1,5);
                    
                    if (opcion == 1){
                        System.out.print("Introduce el nuevo nombre > ");
                        academia.setNombre(sc.nextLine());
                    }else if(opcion == 2){
                        System.out.print("Introduce la direccion > ");
                        academia.setDireccion(sc.nextLine());
                    }else if(opcion == 3){
                        System.out.print("Introduce el telefono > ");
                        academia.setTelefono(sc.nextLine());
                    }else if(opcion == 4){
                        System.out.print("Introduce el email > ");
                        academia.setEmail(sc.nextLine());
                    }else if(opcion == 5){
                        System.out.println("--------------------------------------------------");
                        System.out.println(academia);
                    }
                break;
                case 2:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu de cursos.");
                    System.out.println("1. Crear curso.");
                    System.out.println("2. Seleccionar curso.");
                    System.out.println("3. ELiminar curso.");
                    System.out.println("4. Ver cursos.");
                    System.out.println("5. Añadir alumno.");
                    System.out.println("6. Eliminar alumno.");
                    System.out.println("7. Añadir asignatura.");
                    System.out.println("8. Eliminar asignatura");
                    System.out.println("9. Seleccionar tutor.");
                    System.out.println("10. Seleccionar delegado.");
                    System.out.print("Opcion > ");
                    
                    leerOpcion(1,10);
                    
                    /* Codigo para las diferentes operaciones con cursos */
                    
                break;
                case 3:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu de profesores.");
                    System.out.println("1. Agregar profesor.");
                    System.out.println("2. Modificar profesor.");
                    System.out.println("3. Borrar profesor.");
                    System.out.println("4. Convertir en jefe de departamento.");
                    System.out.println("5. Elimnar profesor");
                    System.out.println("6. Ver listado.");
                    System.out.print("Opcion > ");
                    
                    leerOpcion(1,6);
                    
                    /* Codigo para las diferentes operaciones con profesores */
                    
                break;
                case 4:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu de alumnos.");
                    System.out.println("1. Agregar alumno.");
                    System.out.println("2. Modificar alumno.");
                    System.out.println("3. Borrar alumno.");
                    System.out.println("4. Convertir en delegado.");
                    System.out.println("5. Elimnar alumno");
                    System.out.println("6. Ver listado.");
                    System.out.print("Opcion > ");
                    
                    leerOpcion(1,6);
                    
                    /* Codigo para las diferentes operaciones con profesores */
                    
                break;
            }
        } while (opcion!=0);
        
    }

    public static void leerOpcion(int min, int max) {
        try{
            opcion = sc.nextInt();
            if (opcion>max || opcion<min) throw new InputMismatchException();
        }catch(InputMismatchException  e){
            System.out.println("Opcion incorrecta.");
            opcion=-1;
        }finally{
            sc.nextLine();
        }
    }
    
}
