import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IngresarDatos {
    public static void main(String[] args) {
        // Declaración de variables
        Map<String, Integer> edades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Menú con opciones en líneas separadas
            System.out.println("\n-------------- MENU --------------");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Buscar Dato por Edad");
            System.out.println("3. Eliminar Dato");
            System.out.println("4. Mostrar Mapa Completo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            //Leer las opciones
            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido");
                continue;
            }
            switch (opcion) {
                case 1:

                    System.out.print("Ingrese un Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese un Edad: ");
                    int edad = Integer.parseInt(scanner.nextLine());
                    edades.put(nombre, edad);
                    System.out.print("nombre agregado: " + nombre + " " + edad);
                    break;


                case 2: // Buscar nombre por edad
                    if (edades.isEmpty()) {
                        System.out.println("El mapa está vacío.");
                    } else {
                        System.out.print("Ingrese la edad a buscar: ");
                        try {
                            int edadBuscar = Integer.parseInt(scanner.nextLine());
                            boolean encontrado = false;

                            for (Map.Entry<String, Integer> entry : edades.entrySet()) {
                                if (entry.getValue() == edadBuscar) {
                                    System.out.println("Persona encontrada con edad " + edadBuscar + ": " + entry.getKey());
                                    encontrado = true;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("No se encontró ninguna persona con la edad " + edadBuscar);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ingrese un número válido.");
                        }
                    }
                    break;


                case 3:

                    if (edades.isEmpty()) {
                        System.out.println("El mapa está vacío, no hay datos para eliminar.");
                    } else {
                        System.out.print("Ingrese el nombre de la persona que desea eliminar: ");
                        String nombreEliminar = scanner.nextLine();

                        if (edades.containsKey(nombreEliminar)) {
                            edades.remove(nombreEliminar); // Elimina el dato específico
                            System.out.println("El dato de " + nombreEliminar + " ha sido eliminado.");
                        } else {
                            System.out.println("No se encontró a " + nombreEliminar + " en los datos.");
                        }
                    }
                    break;


                case 4: // Mostrar datos en tabla
                    if (edades.isEmpty()) {
                        System.out.println("El mapa está vacío, no hay datos para mostrar.");
                    } else {
                        System.out.println("+-----------------+-------+");
                        System.out.println("| Nombre          | Edad  |");
                        System.out.println("+-----------------+-------+");

                        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
                            System.out.printf("| %-15s | %-5d |\n", entry.getKey(), entry.getValue());
                        }

                        System.out.println("+-----------------+-------+");
                    }
                    break;

                case 5: // Salir del programa
                            System.out.println("Saliendo del programa...");
                            continuar = false;
                            break;

                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
            }
            scanner.close();
        }
    }

