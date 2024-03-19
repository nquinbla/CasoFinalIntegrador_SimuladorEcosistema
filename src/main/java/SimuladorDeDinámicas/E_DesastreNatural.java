package SimuladorDeDinámicas;

import ModeladoDeEntidades.*;
import java.util.ArrayList;

public class E_DesastreNatural extends Eventos{
private int probabilidadDesastre;
    private int probabilidadMuerte;

    public static ArrayList<E_DesastreNatural> todosLosDesastresNaturales = new ArrayList<E_DesastreNatural>();


    public E_DesastreNatural(int probabilidadDesastre, int probabilidadMuerte) {
        this.probabilidadDesastre = probabilidadDesastre;
        this.probabilidadMuerte = probabilidadMuerte;
        todosLosDesastresNaturales.add(this); // Agregar esta instancia a la lista

    }

    @Override
    public void aplicarEvento(ArrayList<Organismo> poblacion) {
        for (Organismo organismo : poblacion) {
            if (organismo instanceof Animal) {
                Animal animal = (Animal) organismo;
                if (random.nextInt(100) < probabilidadDesastre) {
                    animal.setSalud(animal.getSalud() - 10);
                    if (random.nextInt(100) < probabilidadMuerte) {
                        poblacion.remove(animal);
                    }
                }
            }
        }
    }

}
