package SimuladorDeDinámicas;

import ModeladoDeEntidades.*;
import java.util.ArrayList;

public class Crecimiento {
    private ArrayList<Organismo> poblacion;

    public Crecimiento(ArrayList<Organismo> poblacion) {
        this.poblacion = poblacion;
    }

    public void crecimientoPoblacionAnimal() {
        ArrayList<Animal> nuevosAnimales = new ArrayList<>();

        for (Organismo organismo : poblacion) {
            if (organismo instanceof Animal) {
                Animal animal = (Animal) organismo;
                animal.setEdad(animal.getEdad() + 1);
                animal.setSalud(animal.getSalud() + 5);

                if (animal.isEstadoReproductivo()) {
                    Animal nuevoAnimal = new Animal(animal.getX(), animal.getY(), 0, 100, true);
                    nuevosAnimales.add(nuevoAnimal);
                }
            }
        }

        poblacion.addAll(nuevosAnimales);
    }

    public void crecimientoPoblacionPlanta() {
        ArrayList<Planta> nuevasPlantas = new ArrayList<>();

        for (Organismo organismo : poblacion) {
            if (organismo instanceof Planta) {
                Planta planta = (Planta) organismo;
                planta.setEdad(planta.getEdad() + 1);
                planta.setSalud(planta.getSalud() + 3);

                if (planta.isEstadoReproductivo()) {
                    Planta nuevaPlanta = new Planta(planta.getX(), planta.getY(), 0, 100, true);
                    nuevasPlantas.add(nuevaPlanta);
                }
            }
        }

        poblacion.addAll(nuevasPlantas);
    }
}