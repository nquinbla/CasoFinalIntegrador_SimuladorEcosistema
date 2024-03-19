package SimuladorDeDinámicas;

import ModeladoDeEntidades.*;
import java.util.ArrayList;

public class E_CambioClimatico extends Eventos {
    private int probabilidadCambioClimatico;
    private int probabilidadMuerte;

    public E_CambioClimatico(int probabilidadCambioClimatico, int probabilidadMuerte) {
        this.probabilidadCambioClimatico = probabilidadCambioClimatico;
        this.probabilidadMuerte = probabilidadMuerte;
    }

    public void aplicarEvento(ArrayList<Organismo> poblacion) {
        for (Organismo organismo : poblacion) {
            if (organismo instanceof Planta) {
                Planta planta = (Planta) organismo;
                if (random.nextInt(100) < probabilidadCambioClimatico) {
                    planta.setSalud(planta.getSalud() - 10);
                    if (random.nextInt(100) < probabilidadMuerte) {
                        poblacion.remove(planta);
                    }
                }
            }
        }
    }
}
