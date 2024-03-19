package SimuladorDeDinámicas;

import ModeladoDeEntidades.Animal;
import java.util.List;

import java.util.Random;

public class Reproduccion {

    private EventoAleatorio[] eventos = {new E_DesastreNatural(), new E_Enfermedad(), new E_CambioClimatico()};
    private Random random = new Random();

    public void aplicarEventoAleatorio(Animal animal) {
        int eventoIndex = random.nextInt(eventos.length);
        eventos[eventoIndex].aplicar(animal);
    }

    public Animal reproducir(Animal animal1, Animal animal2) {
        if (!animal1.getEspecie().equals(animal2.getEspecie())) {
            throw new IllegalArgumentException("Los animales deben ser de la misma especie para reproducirse");
        }

        if (!animal1.isEstadoReproductivo() || !animal2.isEstadoReproductivo()) {
            throw new IllegalArgumentException("Ambos animales deben estar en estado reproductivo para reproducirse");
        }

        if (animal1.getSalud() < 50 || animal2.getSalud() < 50) {
            throw new IllegalArgumentException("Ambos animales deben tener una salud de al menos 50 para reproducirse");
        }

        double alimentacion = Double.parseDouble(animal1.getAlimentacion());

        Animal nuevoAnimal = new Animal(
                "Nombre del nuevo animal",
                animal1.getPosicion(),
                (animal1.getSalud() + animal2.getSalud()) / 2,
                Math.max(animal1.getEdad(), animal2.getEdad()),
                false,
                animal1.getEspecie(),
                alimentacion
        );

        return nuevoAnimal;
    }
}

