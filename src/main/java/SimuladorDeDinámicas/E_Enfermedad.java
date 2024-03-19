package SimuladorDeDinámicas;

import ModeladoDeEntidades.*;
import java.util.ArrayList;

// Clase E_Enfermedad
public class E_Enfermedad extends Eventos {
    private int probabilidadEnfermedad;
    private int probabilidadMuerte;

    public static ArrayList<E_Enfermedad> todasLasEnfermedades = new ArrayList<E_Enfermedad>();



    // Constructor de la clase E_Enfermedad
    public E_Enfermedad(int probabilidadEnfermedad, int probabilidadMuerte) {
        this.probabilidadEnfermedad = probabilidadEnfermedad;
        this.probabilidadMuerte = probabilidadMuerte;
        todasLasEnfermedades.add(this); // Agregar esta instancia a la lista
    }

    // Método aplicarEvento
    @Override
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
