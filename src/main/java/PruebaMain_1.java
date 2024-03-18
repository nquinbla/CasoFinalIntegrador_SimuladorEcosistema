import AnálisisAvanzado.*;
import GestiónUsuariosYSimulaciones.*;
import ModeladoDeEntidades.*;
import SimuladorDeDinámicas.*;

import java.util.Scanner;

public class PruebaMain_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Simulador simulador = new Simulador();

        while (true) {
            System.out.println("------  MENÚ PRINCIPAL  ------");
            System.out.println("Por favor, selecciona una opción:");
            System.out.println("1. Agregar una nueva especie al ecosistema");
            System.out.println("2. Simular un ciclo de tiempo en el ecosistema");
            System.out.println("3. Visualizar datos de la simulación");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Aquí puedes agregar la lógica para agregar una nueva especie al ecosistema

                    break;

                case 2: // Simular X tiempo en el ecosistema
                    System.out.println("----- SIMULACIÓN DE TIEMPO  -----");
                    System.out.println("Por favor, selecciona una opción:");
                    System.out.println("1. Simular un día");
                    System.out.println("2. Simular una semana");
                    System.out.println("3. Simular un mes");
                    System.out.println("4. Simular un año");
                    System.out.println("5. Volver al menú principal");

                    if (opcion == 1) {
                        simulador.simularUnDia();
                    } else if (opcion == 2) {
                        simulador.simularUnaSemana();
                    } else if (opcion == 3) {
                        simulador.simularUnMes();
                    } else if (opcion == 4) {
                        simulador.simularUnAño();
                    } else if (opcion == 5) {
                        break;
                    } else {
                        System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    }

                    break;

                case 3:
                    // Aquí puedes agregar la lógica para visualizar los datos de la simulación
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }
}