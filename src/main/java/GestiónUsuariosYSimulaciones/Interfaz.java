package GestiónUsuariosYSimulaciones;

import java.util.Scanner;

// Clase que representa la interfaz de usuario
public class Interfaz {

    private Autenticacion autenticacion;
    private Registro registro;

    // Constructor de la clase
    public Interfaz() {
        autenticacion = new Autenticacion();
        registro = new Registro();
    }

    // Método para mostrar la interfaz de usuario
    public void mostrarInterfaz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al gestor de simulaciones.");

        // Solicitar credenciales de inicio de sesión
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        // Intentar iniciar sesión
        if (autenticacion.iniciarSesion(usuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso.");
            System.out.println("¿Desea registrar una nueva simulación? (S/N)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Ingrese los datos de la simulación:");
                String datosSimulacion = scanner.nextLine();
                registro.registrarSimulacion(usuario, datosSimulacion);
            }
        } else {
            System.out.println("Inicio de sesión fallido. Usuario o contraseña incorrectos.");
        }
    }

    // Método main para probar la interfaz
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.mostrarInterfaz();
    }
}
