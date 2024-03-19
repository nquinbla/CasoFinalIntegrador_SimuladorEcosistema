import ModeladoDeEntidades.*;
import GestiónUsuariosYSimulaciones.*;
import SimuladorDeDinámicas.*;

import java.util.Scanner;

public class Simulador {

    // Crear objetos de las clases Animal
    Animal newAnimal = new Animal(2, 3, 24, 100, true, "León", "Panthera leo", "Macho");
    Animal newAnimal2 = new Animal(65, 3, 22, 100, true, "Leona", "Panthera leo", "Hembra");
    Animal newAnimal3 = new Animal(2, 3, 65, 100, true, "Lobo", "Canis Lopus", "Macho");
    Animal newAnimal4 = new Animal(2, 3, 21, 100, true, "Loba", "Canis Lopus", "Hembra");
    Animal newAnimal5 = new Animal(2, 3, 24, 100, true, "Tigre", "Panthera tigris", "Macho");
    Animal newAnimal6 = new Animal(2, 3, 22, 100, true, "Tigresa", "Panthera tigris", "Hembra");
    Animal newAnimal7 = new Animal(2, 3, 24, 100, true, "Elefante", "Loxodonta africana", "Macho");
    Animal newAnimal8 = new Animal(2, 3, 22, 100, true, "Elefanta", "Loxodonta africana", "Hembra");
    Animal newAnimal9 = new Animal(2, 3, 24, 100, true, "Jirafa", "Giraffa camelopardalis", "Macho");
    Animal newAnimal10 = new Animal(2, 3, 22, 100, true, "Jirafa", "Giraffa camelopardalis", "Hembra");


    // Crear objetos de las clases Planta
    Planta newPlanta = new Planta(2, 3, 24, 100, true, "Rosa", "Rosa", 100, 100, 100);
    Planta newPlanta2 = new Planta(2, 3, 24, 100, true, "Girasol", "Helianthus annuus", 100, 100, 100);
    Planta newPlanta3 = new Planta(2, 3, 24, 100, true, "Orquídea", "Orchidaceae", 100, 100, 100);
    Planta newPlanta4 = new Planta(2, 3, 24, 100, true, "Margarita", "Bellis perennis", 100, 100, 100);
    Planta newPlanta5 = new Planta(2, 3, 24, 100, true, "Tulipán", "Tulipa", 100, 100, 100);
    Planta newPlanta6 = new Planta(2, 3, 24, 100, true, "Lirio", "Lilium", 100, 100, 100);
    Planta newPlanta7 = new Planta(2, 3, 24, 100, true, "Marihuana", "Cannabis sativa", 100, 100, 100);
    Planta newPlanta8 = new Planta(2, 3, 24, 100, true, "Coca", "Erythroxylum coca", 100, 100, 100);
    Planta newPlanta9 = new Planta(2, 3, 24, 100, true, "Amapola", "Papaver somniferum", 100, 100, 100);
    Planta newPlanta10 = new Planta(2, 3, 24, 100, true, "Cactus", "Cactaceae", 100, 100, 100);




   public static void main(String[] args) {
        System.out.println("----- GESTOR DE SIMULACIONES -----");
        System.out.println("Bienvenido al gestor de simulaciones, por favor, seleccione una opción:");
        System.out.println("1. Invitado");
        System.out.println("2. Investigador");
        System.out.println("3. Salir");

        // Crear un objeto de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Leer la opción seleccionada por el usuario
        int opcion = scanner.nextInt();

        // Crear un objeto de la clase Simulador
        Simulador simulador = new Simulador();

        // Según la opción seleccionada por el usuario, ejecutar el método correspondiente
        switch (opcion) {
            case 1: // invitado
                System.out.println("----- INVITADO -----");
                System.out.println("Bienvenido al gestor de simulaciones como invitado.");
                break;

            case 2: // investigador
                System.out.println("----- INVESTIGADOR -----");
                System.out.println("Bienvenido al gestor de simulaciones como investigador.");

                Interfaz interfaz = new Interfaz();

                // Solicitar credenciales de inicio de sesión
                System.out.print("Usuario: ");
                scanner.nextLine(); // consume the newline
                String usuario = scanner.nextLine();
                System.out.print("Contraseña: ");
                String contraseña = scanner.nextLine();

                // Intentar iniciar sesión
                if (interfaz.getAutenticacion().iniciarSesion(usuario, contraseña)) {
                    System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario + ".");
                    // interfaz.mostrarInterfaz(); // Este método no existe en tu clase Interfaz
                } else {
                    System.out.println("Inicio de sesión fallido. Usuario o contraseña incorrectos.");
                } break;

            case 3: // SALIR
                System.out.println("Saliendo del gestor de simulaciones...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}