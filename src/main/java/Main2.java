import java.util.Scanner;
import Gestión.Usuario;


public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un usuario
        Usuario usuario = new Usuario();
        System.out.println("Por favor, introduce tu nombre de usuario:");
        String nombreUsuario = scanner.nextLine();
        usuario.setNombre(nombreUsuario);

        System.out.println("Por favor, introduce tu contraseña:");
        String contraseñaUsuario = scanner.nextLine();
        usuario.setContraseña(contraseñaUsuario);

        // Crear un simulador
        Simulador simulador = new Simulador();

        // Autenticar al usuario
        if (usuario.autenticar(nombreUsuario, contraseñaUsuario)) {
            // Si la autenticación es exitosa, iniciar la configuración del ecosistema
            System.out.println("Autenticación exitosa. Comenzando configuración del ecosistema...");

            boolean continuarConfiguracion = true;
            while (continuarConfiguracion) {
                System.out.println("Por favor, introduce el nombre de la especie:");
                String nombreEspecie = scanner.nextLine();

                System.out.println("Por favor, introduce la energía inicial de la especie:");
                int energiaInicial = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.println("¿Es esta especie un animal o una planta?");
                String tipoEspecie = scanner.nextLine();

                if (tipoEspecie.equalsIgnoreCase("animal")) {
                    System.out.println("Por favor, introduce la velocidad del animal:");
                    int velocidad = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Animales animal = new Animales(nombreEspecie, energiaInicial, velocidad);
                    simulador.agregarEspecie(animal);
                } else if (tipoEspecie.equalsIgnoreCase("planta")) {
                    System.out.println("Por favor, introduce la tasa de crecimiento de la planta:");
                    int tasaCrecimiento = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Plantas planta = new Plantas(nombreEspecie, energiaInicial, tasaCrecimiento);
                    simulador.agregarEspecie(planta);
                }

                System.out.println("¿Deseas agregar otra especie? (s/n)");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    continuarConfiguracion = false;
                }
            }

            // Iniciar la simulación
            boolean continuarSimulacion = true;
            while (continuarSimulacion) {
                simulador.simularUnDia();

                System.out.println("¿Deseas continuar la simulación? (s/n)");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    continuarSimulacion = false;
                }
            }
        } else {
            System.out.println("Autenticación fallida");
        }

        scanner.close();
    }
}