package ModeladoDeEntidades;

// Clase que modela las interacciones entre los organismos
public class Interacciones {

    //  Método que modela la predación entre dos organismos
    public void predacion(Organismo depredador, Organismo presa) {
        depredador.setSalud(depredador.getSalud() + 12);
        presa.setSalud(presa.getSalud() - 12);
    }

    // Método que modela la competencia por recursos entre dos organismos
    public void competenciaPorRecursos(Organismo organismo1, Organismo organismo2, Ambiente ambiente) {
        if (organismo1.getSalud() > organismo2.getSalud()) {
            organismo1.setSalud(organismo1.getSalud() + ambiente.getRecursosDisponibles() / 2);
            ambiente.setRecursosDisponibles(ambiente.getRecursosDisponibles() / 2);
        } else {
            organismo2.setSalud(organismo2.getSalud() + ambiente.getRecursosDisponibles() / 2);
            ambiente.setRecursosDisponibles(ambiente.getRecursosDisponibles() / 2);
        }
    }

    // Método que modela la polinización entre dos plantas
    public void polinizacion(Planta planta1, Planta planta2) {
        planta2.setSalud(planta2.getSalud() + planta1.getSalud() / 2);
        planta1.setSalud(planta1.getSalud() / 2);
    }


}
