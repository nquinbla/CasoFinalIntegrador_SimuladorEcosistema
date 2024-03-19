package AnálisisAvanzado;

import ModeladoDeEntidades.*;
import java.util.List;
import java.util.function.Predicate;


public class ResoluciónProblemas {
    private IntegracionFunciones funciones;
    private VisualizacionDatos datos;

    public ResoluciónProblemas() {
        this.funciones = new IntegracionFunciones();
        this.datos = new VisualizacionDatos();
    }

    public void buscarEquilibrios(List<Animal> animales, Ambiente ambiente) {
        this.funciones.registrarInteraccionAmbiente("equilibrioEspecies", (organismo, amb) -> {
            System.out.println("Evaluando equilibrio en el ambiente.");
        });

        for (Animal animal : animales) {
            this.funciones.ejecutarInteraccionAmbiente("equilibrioEspecies", animal, ambiente);
        }

        System.out.println(VisualizacionDatos.visualizarDatos(animales));
    }

    public void evaluarConservacion(List<Animal> animales, Ambiente ambiente) {
        this.funciones.registrarInteraccionAmbiente("conservacion", (organismo, amb) -> {
            amb.setRecursosDisponibles(amb.getRecursosDisponibles() + 100);
            System.out.println("Aplicando estrategia de conservación: aumento de recursos.");
        });

        animales.forEach(animal -> this.funciones.ejecutarInteraccionAmbiente("conservacion", animal, ambiente));
    }

    public void simularImpactos(Ambiente ambiente, Predicate<Ambiente> cambio) {
        if (cambio.test(ambiente)) {
            System.out.println("El cambio es aplicable y se evaluarán los impactos.");
            ambiente.setClima("Desértico");
        } else {
            System.out.println("El cambio no se aplicará bajo las condiciones actuales.");
        }
    }
}
