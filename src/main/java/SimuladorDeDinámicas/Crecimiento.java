package SimuladorDeDinámicas;

import ModeladoDeEntidades.*;
import java.util.List;

public class Crecimiento {

    public void crecimientoPoblacional(Organismo organismo, double factorCrecimiento) {
        organismo.setSalud(organismo.getSalud() + (int)(organismo.getSalud() * factorCrecimiento));
    }

    public void calcularCrecimientoTotal(List<Organismo> organismos, double factorCrecimiento) {
        for (Organismo organismo : organismos) {
            crecimientoPoblacional(organismo, factorCrecimiento);
        }
    }
}
