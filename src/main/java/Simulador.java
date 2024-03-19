import AnálisisAvanzado.IntegracionFunciones;
import AnálisisAvanzado.ResoluciónProblemas;
import AnálisisAvanzado.VisualizacionDatos;
import ModeladoDeEntidades.*;
import GestiónUsuariosYSimulaciones.*;
import SimuladorDeDinámicas.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Simulador {

    Scanner scanner = new Scanner(System.in);
    private Simulador simulador = new Simulador();
    private Autenticacion autenticacion;
    private VisualizacionDatos datos;
    private IntegracionFunciones funciones;
    private ResoluciónProblemas problemas;
    private Random random = new Random();
    private EventoAleatorio[] eventos = {new E_DesastreNatural(), new E_Enfermedad(), new E_CambioClimatico()};

    public void verOrganismos() {
        System.out.println("----- ANIMALES -----");
        for (Animal animal : Animal.getAnimalesList()) {
            System.out.println(animal.toString());
        }

        System.out.println("----- PLANTAS -----");
        for (Planta planta : Planta.getPlantasList()) {
            System.out.println(planta.toString());
        }
    }
    public Simulador() {
        this.autenticacion = new Autenticacion();
        this.datos = new VisualizacionDatos();
        this.funciones = new IntegracionFunciones();
        this.problemas = new ResoluciónProblemas();

        Animal carnivoroMacho1 = new Animal("Leon-M", new Organismo.Posicion(0, 0), 100, 5, true, "Carnívoro", 50);
        Animal carnivoroHembra1 = new Animal("León-H", new Organismo.Posicion(1, 1), 100, 5, true, "Carnívoro", 45);
        Animal carnivoroMacho2 = new Animal("Beluga-M", new Organismo.Posicion(2, 2), 100, 5, true, "Carnívoro", 50);
        Animal carnivoroHembra2 = new Animal("Beluga-H", new Organismo.Posicion(3, 3), 100, 5, true, "Carnívoro", 45);

        Animal herbivoroMacho1 = new Animal("Rinoceronte-M", new Organismo.Posicion(2, 2), 100, 5, true, "Herbívoro", 50);
        Animal herbivoroHembra1 = new Animal("Rinoceronte-H",new Organismo.Posicion(3, 3), 100, 5, true, "Herbívoro", 45);
        Animal herbivoroMacho2 = new Animal("Tortuga-M", new Organismo.Posicion(2, 2), 100, 5, true, "Herbívoro", 50);
        Animal herbivoroHembra2 = new Animal("Tortuga-H", new Organismo.Posicion(3, 3), 100, 5, true, "Herbívoro", 45);

        Animal omnivoroMacho1 = new Animal("Erizos-M", new Organismo.Posicion(4, 4), 100, 5, true, "Omnívoro", 50);
        Animal omnivoroHembra1 = new Animal("Erizos-H", new Organismo.Posicion(5, 5), 100, 5, true, "Omnívoro", 45);
        Animal omnivoroMacho2 = new Animal("Avestruz-M", new Organismo.Posicion(6, 6), 100, 5, true, "Omnívoro", 50);
        Animal omnivoroHembra2 = new Animal("Avestruz-H", new Organismo.Posicion(7, 7), 100, 5, true, "Omnívoro", 45);

        Planta planta1 = new Planta("Tulipán", new Organismo.Posicion(0, 0), 100, 5, true, "Flor", "Bosque");
        Planta planta2 = new Planta("Almendro", new Organismo.Posicion(1, 1), 100, 5, true, "Árbol", "Bosque");
        Planta planta3 = new Planta("Cactus", new Organismo.Posicion(2, 2), 100, 5, true, "Suculentas", "Sabana");
        Planta planta4 = new Planta("Marihuana", new Organismo.Posicion(3, 3), 100, 5, true, "Droga", "Bosque");
        Planta planta5 = new Planta("Limonero", new Organismo.Posicion(4, 4), 100, 5, true, "Fruto", "Bosque");

    }

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
                System.out.println("Bienvenido al gestor de simulaciones como invitado, si desea realizar una simulación, por favor, regístrese.");
                System.out.println("1. Ver organismos");
                System.out.println("2. Volver al menú principal");

                // Leer la opción seleccionada por el usuario
                int opcionInvitado = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                // Según la opción seleccionada por el usuario, ejecutar el método correspondiente
                switch (opcionInvitado) {
                    case 1:
                        simulador.verOrganismos();
                        break;
                    case 2: // SALIR
                        System.out.println("Saliendo del gestor de simulaciones...");
                        break;
                }

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

                    scanner.nextLine(); // consume the newline

                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Ejecutar simulación");
                    System.out.println("2. Visualizar resultados");
                    System.out.println("3. Integrar nuevas funciones");
                    System.out.println("4. Salir");

                    int opcionInvestigador = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    switch (opcionInvestigador) {
                        case 1:
                            System.out.println("Ejecutando simulación...");
                            break;

                        case 2:
                            System.out.println("Visualizando resultados...");
                            break;

                        case 3:
                            System.out.println("Integrando nuevas funciones...");
                            break;

                        case 4:
                            System.out.println("Saliendo del gestor de simulaciones...");
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }

                } else {
                    System.out.println("Inicio de sesión fallido. Usuario o contraseña incorrectos.");
                }
                break;

            case 3: // SALIR
                System.out.println("Saliendo del gestor de simulaciones...");
                break;

            default:
                System.out.println("Opción no válida.");
        } case 3: // SALIR
        System.out.println("Saliendo del gestor de simulaciones...");
        break;
    }
}
}