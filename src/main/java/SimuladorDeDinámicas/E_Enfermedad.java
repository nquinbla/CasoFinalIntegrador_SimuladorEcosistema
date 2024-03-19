package SimuladorDeDinámicas;

import ModeladoDeEntidades.*;
import java.util.ArrayList;

// Clase E_Enfermedad
public class E_Enfermedad extends Eventos {
    private int probabilidadEnfermedad;
    private int probabilidadMuerte;

    // Constructor de la clase E_Enfermedad
    public E_Enfermedad(int probabilidadEnfermedad, int probabilidadMuerte) {
        this.probabilidadEnfermedad = probabilidadEnfermedad;
        this.probabilidadMuerte = probabilidadMuerte;
    }

    // Método aplicarEvento
    public void aplicarEvento(ArrayList<Organismo> poblacion) {
        for (Organismo organismo : poblacion) {
            if (organismo instanceof Animal) {
                Animal animal = (Animal) organismo;
                if (random.nextInt(100) < probabilidadEnfermedad) {
                    animal.setSalud(animal.getSalud() - 10);
                    if (random.nextInt(100) < probabilidadMuerte) {
                        poblacion.remove(animal);
                    }
                }
            }
        }
    }

}
