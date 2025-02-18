import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Alumno {
    private String carnet;
    private String nombreCompleto;

    public Alumno(String carnet, String nombreCompleto) {
        this.carnet = carnet;
        this.nombreCompleto = nombreCompleto;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}

public class Alumnos {
    private static Map<String, Alumno> alumnos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- PROGRAMA UDBVIRTUAL ---");
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Buscar Alumno");
            System.out.println("3. Eliminar Alumno");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private static void ingresarAlumno() {
        System.out.print("Ingrese el carnet del alumno: ");
        String carnet = scanner.nextLine();
        System.out.print("Ingrese el nombre completo del alumno: ");
        String nombreCompleto = scanner.nextLine();

        if (!alumnos.containsKey(carnet)) {
            alumnos.put(carnet, new Alumno(carnet, nombreCompleto));
            System.out.println("Alumno ingresado exitosamente.");
        } else {
            System.out.println("Error: Ya existe un alumno con ese carnet.");
        }
    }

    private static void buscarAlumno() {
        System.out.print("Ingrese el carnet del alumno a buscar: ");
        String carnet = scanner.nextLine();

        if (alumnos.containsKey(carnet)) {
            Alumno alumno = alumnos.get(carnet);
            System.out.println("Alumno encontrado: " + alumno.getNombreCompleto());
        } else {
            System.out.println("Alumno no encontrado, no se puede mostrar.");
        }
    }
    private static void eliminarAlumno() {
    
        Scanner scanner = new Scanner(System.in);        
        
        if (alumnos.isEmpty()) {
            System.out.println("\n** NO hay ningun alumno ingresado **\n");
            return;
        }
        
        System.out.println("\n---------------------------");
        System.out.println("\n** Eliminando Alumno **\n"); 
        
        System.out.print("Carnet: ");
        String carnet = scanner.nextLine();
        
        alumnos.remove(carnet);
        System.out.println("\n** Alumno eliminado **\n");
    }
    
}/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 
public class Alumnos {
  
}
1
  */
