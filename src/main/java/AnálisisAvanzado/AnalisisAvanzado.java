package AnálisisAvanzado;
import DinámicasPoblaciones.Simulador;

// [1] Clase AnalisisAvanzado
public class AnalisisAvanzado {
    private Simulador simulador;


    public AnalisisAvanzado(Simulador simulador) {
        this.simulador = simulador;
    }

    public void resolverProblemas() {
        int iteracionesEstables = 0;
        int poblacionAnterior = simulador.getPoblacion();

        while (iteracionesEstables < 10) {
            simulador.simularUnDia();
            int poblacionActual = simulador.getPoblacion();

            if (poblacionActual == poblacionAnterior) {
                iteracionesEstables++;
            } else {
                iteracionesEstables = 0;
            }

            poblacionAnterior = poblacionActual;
        }

        System.out.println("Equilibrio ecológico encontrado después de " + simulador.getDias() + " días.");
    }

    public void visualizarDatos() {
        // Implementar métodos para visualizar los datos de la simulación
    }

    public void integrarFunciones() {
        // Permitir que los investigadores introduzcan sus propios modelos y funciones
    }
}