import ModeladoDeEntidades.*;
import GestiónUsuariosYSimulaciones.*;
import SimuladorDeDinámicas.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

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


                // Preguntar al usuario cuántos días quiere simular
                System.out.println("¿Cuántos días te gustaría simular?");
                int numDias = scanner.nextInt();

                ArrayList<Organismo> poblacion = new ArrayList<>();
                poblacion.addAll(Animal.todosLosAnimales);
                poblacion.addAll(Planta.todasLasPlantas);

                Crecimiento crecimiento = new Crecimiento(poblacion);

                E_CambioClimatico cambioClimatico = new E_CambioClimatico(10, 5);
                E_DesastreNatural desastreNatural = new E_DesastreNatural(10, 5);
                E_Enfermedad enfermedad = new E_Enfermedad(10, 5);

                ArrayList<Eventos> eventos = new ArrayList<>();
                eventos.add(cambioClimatico);
                eventos.add(desastreNatural);
                eventos.add(enfermedad);

                for (int dia = 1; dia <= numDias; dia++) {
                    System.out.println("----- DÍA " + dia + " -----");

                    crecimiento.crecimientoPoblacionAnimal();
                    crecimiento.crecimientoPoblacionPlanta();

                    Eventos eventoAleatorio = eventos.get(new Random().nextInt(eventos.size()));
                    eventoAleatorio.aplicarEvento(poblacion);

                    for (Organismo organismo : poblacion) {
                        System.out.println(organismo);
                    }
                }
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
