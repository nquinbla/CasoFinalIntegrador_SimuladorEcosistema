import ModeladoDeEntidades.*;
import GestiónUsuariosYSimulaciones.*;
import SimuladorDeDinámicas.*;

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
                System.out.println("1. Crear un organismo");
                System.out.println("2. Simular dinámicas de poblaciones");
                System.out.println("3. Volver al menú principal");


                // Leer la opción seleccionada por el usuario
                int opcionInvitado = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                // Según la opción seleccionada por el usuario, ejecutar el método correspondiente
                switch (opcionInvitado) {
                    case 1:
                        System.out.println("----- CREAR ORGANISMO -----");
                        System.out.println("Por favor, seleccione el tipo de organismo que desea crear:");
                        System.out.println("1. Planta");
                        System.out.println("2. Animal");
                        System.out.println("3. Volver al menú principal");

                        int opcionCrearOrganismo = scanner.nextInt();
                        scanner.nextLine(); // consume the newline

                        switch (opcionCrearOrganismo) {
                            case 1: // Lógica para crear una nueva planta
                        System.out.println ( "Ingrese el nombre de la planta:" );
                        String nombre = scanner.next ();
                        System.out.println ( "Ingrese el tipo de la planta:" );
                        String tipo = scanner.next ();
                        System.out.println ( "Ingrese la altura de la planta:" );
                        double altura = scanner.nextDouble ();
                        System.out.println ( "Ingrese el estado de salud de la planta " + "(saludable, enferma, en peligro de extinción):" );
                        String salud = scanner.next ();
                        System.out.println ( "Ingrese el estado de reproducción de la planta (true/false):" );
                        boolean estadoReproduccion = scanner.nextBoolean ();

                        // Crear una nueva instancia de Planta con los datos proporcionados
                        Planta nuevaPlanta = new Planta (0, 0, 0, 100, estadoReproduccion, nombre, false, false, true);
                        System.out.println ( "¡Planta creada exitosamente!" );
                     break;

                    case 2: // Lógica para crear un nuevo animal
                        System.out.println ( "Ingrese el nombre del animal:" );
                        String nombreAnimal = scanner.next ();
                        System.out.println ( "Ingrese la especie del animal:" );
                        String especieAnimal = scanner.next ();
                        System.out.println ( "Ingrese la edad del animal:" );
                        int edadAnimal = scanner.nextInt ();
                        System.out.println ( "Ingrese el estado de salud del animal (true para saludable, false para no saludable):" );
                        boolean saludAnimal = scanner.nextBoolean ();
                        System.out.println ( "Ingrese el estado de reproducción del animal (true/false):" );
                        boolean estadoReproduccionAnimal = scanner.nextBoolean ();

                        // Crear una nueva instancia de Animal con los datos proporcionados
                        Animal nuevoAnimal = new Animal (0, 0, edadAnimal, 100, estadoReproduccionAnimal, nombreAnimal, false, false, saludAnimal);
                        System.out.println ( "¡Animal creado exitosamente!" );
                        break;

                    case 3:
                        System.out.println("Volviendo al menú principal...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

                // Preguntar al usuario cuántos días quiere simular
                System.out.println("¿Cuántos días te gustaría simular?");
                int numDias = scanner.nextInt();

                // Crear una población inicial
                ArrayList<Organismo> poblacion = new ArrayList<>();

                // Crear una instancia de la clase Crecimiento
                Especie especie = new Especie("Especie", 1, 1);
                Crecimiento crecimiento = new Crecimiento(especie, poblacion.size());

                // Crear una lista de eventos
                ArrayList<Eventos> eventos = new ArrayList<>();
                // Solicitar al usuario la probabilidad de cambio climático
                System.out.println("Por favor, introduce la probabilidad de cambio climático:");
                int probabilidadCambioClimatico = scanner.nextInt();

                // Solicitar al usuario la probabilidad de muerte
                System.out.println("Por favor, introduce la probabilidad de muerte:");
                int probabilidadMuerte = scanner.nextInt();

                // Crear instancias de los eventos
                E_CambioClimatico cambioClimatico = new E_CambioClimatico(probabilidadCambioClimatico, probabilidadMuerte);
                E_DesastreNatural desastreNatural = new E_DesastreNatural(probabilidadCambioClimatico, probabilidadMuerte);
                E_Enfermedad enfermedad = new E_Enfermedad(probabilidadCambioClimatico, probabilidadMuerte);

                // Añadir los eventos a la lista de eventos
                eventos.add(cambioClimatico);
                eventos.add(desastreNatural);
                eventos.add(enfermedad);

                for (int dia = 1; dia <= numDias; dia++) {
                    System.out.println("----- DÍA " + dia + " -----");

                    crecimiento.crecer();
                    crecimiento.reproducirse();

                    Eventos eventoAleatorio = eventos.get(new Random().nextInt(eventos.size()));
                    eventoAleatorio.aplicarEvento(poblacion);

                    for (Organismo organismo : poblacion) {
                        System.out.println(organismo);
                    } } break;

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
} }