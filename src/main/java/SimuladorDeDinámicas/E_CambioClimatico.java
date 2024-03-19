package SimuladorDeDinámicas;

import ModeladoDeEntidades.Animal;

public class E_CambioClimatico extends EventoAleatorio{
    @Override
    public void aplicar(Animal animal) {
        if (random.nextBoolean()) {
            double alimentacion = Double.parseDouble(animal.getAlimentacion());
            alimentacion -= random.nextInt(10);
            animal.setAlimentacion(String.valueOf(alimentacion));
        }
    }
}
