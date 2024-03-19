package SimuladorDeDinámicas;

import ModeladoDeEntidades.Animal;

// Clase que modela el evento de enfermedad en un animal
public class E_Enfermedad extends EventoAleatorio {
    @Override
    public void aplicar(Animal animal) {
        int reduccionSalud = random.nextInt(45);
        animal.setSalud(animal.getSalud() - reduccionSalud);
        if (random.nextBoolean()) {
            animal.setEstadoReproductivo(false);
        }
    }
}
