package SimuladorDeDinámicas;

import ModeladoDeEntidades.Organismo;
import java.util.ArrayList;
import java.util.List;

// Clase simulador
public class Simulador {
    private List<Organismo> poblacion = new ArrayList<>();

    // Método que simula el crecimiento y la reproducción de la población
    public void simularCrecimientoYReproduccion() {
        List<Organismo> nuevosOrganismos = new ArrayList<>();
        for (Organismo organismo : poblacion) {
            if (organismo.isEstadoReproductivo()) {
                Organismo pareja = seleccionarPareja(organismo);
                if (pareja != null) {
                    Organismo nuevoOrganismo = organismo.reproducirse(pareja);
                    nuevosOrganismos.add(nuevoOrganismo);
                }
            }
        }
        poblacion.addAll(nuevosOrganismos);
    }

    // Método privado que selecciona una pareja para un organismo
    private Organismo seleccionarPareja(Organismo organismo) {
        // Implementa la lógica para seleccionar una pareja para el organismo
        for (Organismo posiblePareja : poblacion) {
            if (esParejaElegible(organismo, posiblePareja)) {
                return posiblePareja;
            }
        }
        return null;
    }

    private boolean esParejaElegible(Organismo organismo, Organismo posiblePareja) {
        // Implementa la lógica para determinar si posiblePareja es una pareja elegible para organismo
        // Por ejemplo, podrías comprobar si son de la misma especie, si el posiblePareja está en estado reproductivo, etc.
        return true;
    }
}