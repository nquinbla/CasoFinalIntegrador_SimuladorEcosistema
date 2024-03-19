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
        switch (opcion) { // invitado
            case 1:
                System.out.println("----- INVITADO -----");
                System.out.println("Bienvenido al gestor de simulaciones como invitado.");

                break;


            case 2: // investigador
                System.out.println("----- INVESTIGADOR -----");
                System.out.println("Bienvenido al gestor de simulaciones como investigador.");

                System.out.print("Usuario: ");
                String usuario = scanner.next();
                System.out.print("Contraseña: ");
                String contraseña = scanner.next();

                GestiónUsuariosYSimulaciones.Autenticacion autenticacion = new GestiónUsuariosYSimulaciones.Autenticacion();
                if (autenticacion.iniciarSesion(usuario, contraseña)) {
                    System.out.println("Inicio de sesión exitoso.");
                    // Aquí puedes agregar el código para manejar las acciones del investigador

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
