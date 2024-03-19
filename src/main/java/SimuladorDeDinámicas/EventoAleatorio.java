package SimuladorDeDinámicas;

import ModeladoDeEntidades.Animal;
import java.util.Random;

public abstract class EventoAleatorio {

    protected Random random = new Random();

    public abstract void aplicar(Animal animal);
}
