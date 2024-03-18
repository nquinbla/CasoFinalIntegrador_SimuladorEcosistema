package SimuladorDeDinámicas;

import ModeladoDeEntidades.Organismo;
import java.util.List;

public class ResultadosSimulación {
    public double calcularSaludPromedio(List<Organismo> poblacion) {
        double sumaSalud = 0.0;
        for (Organismo organismo : poblacion) {
            sumaSalud += organismo.getSalud();
        }
        return sumaSalud / poblacion.size();
    }

    public String calcularTendenciaPoblacional(List<Organismo> poblacionActual, List<Organismo> poblacionAnterior) {
        if (poblacionActual.size() > poblacionAnterior.size()) {
            return "La población está aumentando";
        } else if (poblacionActual.size() < poblacionAnterior.size()) {
            return "La población está disminuyendo";
        } else {
            return "La población se mantiene estable";
        }
    }

    public void mostrarResultados(List<Organismo> poblacionActual, List<Organismo> poblacionAnterior) {
        double saludPromedio = calcularSaludPromedio(poblacionActual);
        String tendenciaPoblacional = calcularTendenciaPoblacional(poblacionActual, poblacionAnterior);

        System.out.println("Salud promedio de la población: " + saludPromedio);
        System.out.println("Tendencia poblacional: " + tendenciaPoblacional);
    }
}