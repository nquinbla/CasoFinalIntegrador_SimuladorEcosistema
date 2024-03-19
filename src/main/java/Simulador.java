import ModeladoDeEntidades.*;
import GestiónUsuariosYSimulaciones.*;
import SimuladorDeDinámicas.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Simulador {

    // Primero, necesitas crear instancias de las clases que necesitas para tu simulador, como los animales, plantas y ambientes
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


    // Crear ambientes
    Ambiente ambiente = new Ambiente("Tropical", "Selva", 1000);
    Ambiente ambiente2 = new Ambiente("Desértico", "Desierto", 1000);
    Ambiente ambiente3 = new Ambiente("Polar", "Tundra", 1000);
    Ambiente ambiente4 = new Ambiente("Templado", "Bosque", 1000);
    Ambiente ambiente5 = new Ambiente("Subtropical", "Pradera", 1000);
    Ambiente ambiente6 = new Ambiente("Templado", "Montaña", 1000);


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


                // Crear una lista de organismos que incluye los animales y las plantas
                ArrayList<Organismo> poblacion = new ArrayList<>();
                poblacion.addAll(Arrays.asList(simulador.newAnimal, simulador.newAnimal2, simulador.newAnimal3, simulador.newAnimal4, simulador.newAnimal5, simulador.newAnimal6, simulador.newAnimal7, simulador.newAnimal8, simulador.newAnimal9, simulador.newAnimal10));
                poblacion.addAll(Arrays.asList(simulador.newPlanta, simulador.newPlanta2, simulador.newPlanta3, simulador.newPlanta4, simulador.newPlanta5, simulador.newPlanta6, simulador.newPlanta7, simulador.newPlanta8, simulador.newPlanta9, simulador.newPlanta10));

                // Crear una instancia de la clase Crecimiento y pasarle la lista de organismos
                Crecimiento crecimiento = new Crecimiento(poblacion);

                // Crear instancias de las clases de eventos y pasarles la lista de organismos
                E_CambioClimatico cambioClimatico = new E_CambioClimatico(10, 5);
                E_DesastreNatural desastreNatural = new E_DesastreNatural(10, 5);
                E_Enfermedad enfermedad = new E_Enfermedad(10, 5);

                // Crear una lista de eventos
                ArrayList<Eventos> eventos = new ArrayList<>();
                eventos.add(cambioClimatico);
                eventos.add(desastreNatural);
                eventos.add(enfermedad);

                // Simular un número determinado de días
                for (int dia = 1; dia <= numDias; dia++) {
                    System.out.println("----- DÍA " + dia + " -----");

                    // Simular el crecimiento de los organismos
                    crecimiento.crecimientoPoblacionAnimal();
                    crecimiento.crecimientoPoblacionPlanta();

                    // Seleccionar un evento aleatorio y aplicarlo
                    Eventos eventoAleatorio = eventos.get(new Random().nextInt(eventos.size()));
                    eventoAleatorio.aplicarEvento(poblacion);

                    // Imprimir la lista de organismos para ver su estado después de cada día
                    for (Organismo organismo : poblacion) {
                        System.out.println(organismo);
                    } }

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
