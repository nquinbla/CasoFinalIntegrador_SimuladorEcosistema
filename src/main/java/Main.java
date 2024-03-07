import Gestión.Usuario;
import DinámicasPoblaciones.Simulador;
import AnálisisAvanzado.AnalisisAvanzado;

public class Main {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("nombreUsuario");
        usuario.setContraseña("contraseñaUsuario");

        // Crear un simulador
        Simulador simulador = new Simulador();
        simulador.setPoblaciónInicial(100);
        simulador.setTasaCrecimiento(2);

        // Crear un análisis avanzado
        AnalisisAvanzado analisisAvanzado = new AnalisisAvanzado(simulador);

        // Autenticar al usuario
        if (usuario.autenticar("nombreUsuario", "contraseñaUsuario")) {
            // Si la autenticación es exitosa, iniciar la simulación y realizar análisis avanzado
            simulador.simularUnDia();
            analisisAvanzado.resolverProblemas();
            analisisAvanzado.visualizarDatos();
            analisisAvanzado.integrarFunciones();
        } else {
            System.out.println("Autenticación fallida");
        }
    }
}