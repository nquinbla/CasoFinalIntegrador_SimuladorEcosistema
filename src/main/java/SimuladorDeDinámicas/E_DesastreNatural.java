package SimuladorDeDinámicas;

import ModeladoDeEntidades.Animal;

public class E_DesastreNatural extends EventoAleatorio{
    @Override
    public void aplicar(Animal animal) {
        int reduccionSalud = random.nextInt(50);
        animal.setSalud(animal.getSalud() - reduccionSalud);
    }
}
