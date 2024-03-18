import java.util.Scanner;
import Gestión.Usuario;
import AnálisisAvanzado.AnalisisAvanzado;

public class Main {
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
        System.out.println("Por favor, introduce la población inicial:");
        int poblacionInicial = scanner.nextInt();
        simulador.setPoblaciónInicial(poblacionInicial);

        System.out.println("Por favor, introduce la tasa de crecimiento:");
        int tasaCrecimiento = scanner.nextInt();
        simulador.setTasaCrecimiento(tasaCrecimiento);

        // Crear un análisis avanzado
        AnalisisAvanzado analisisAvanzado = new AnalisisAvanzado(simulador);

        // Autenticar al usuario
        if (usuario.autenticar(nombreUsuario, contraseñaUsuario)) {
            // Si la autenticación es exitosa, iniciar la simulación y realizar análisis avanzado
            simulador.simularUnDia();
            analisisAvanzado.resolverProblemas();
            analisisAvanzado.visualizarDatos();
            analisisAvanzado.integrarFunciones();
        } else {
            System.out.println("Autenticación fallida");
        }

        scanner.close();
    }
}