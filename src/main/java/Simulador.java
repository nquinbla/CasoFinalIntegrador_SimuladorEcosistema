import ModeladoDeEntidades.*;
import GestiónUsuariosYSimulaciones.*;
import SimuladorDeDinámicas.*;

import java.util.Scanner;

public class Simulador {
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
                }
                break;

            case 3: // SALIR
                System.out.println("Saliendo del gestor de simulaciones...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}