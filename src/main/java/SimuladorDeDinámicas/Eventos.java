package SimuladorDeDinámicas;
import ModeladoDeEntidades.*;

import java.util.Random;
import java.util.ArrayList;

public abstract class Eventos {
    protected Random random = new Random();

    public abstract void aplicarEvento(ArrayList<Organismo> poblacion);
}
