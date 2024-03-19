package SimuladorDeDinámicas;
import ModeladoDeEntidades.*;

import java.util.Random;
import java.util.ArrayList;

// Clase Eventos
public abstract class Eventos {
    protected Random random = new Random();

    // Método abstracto aplicarEvento
    public abstract void aplicarEvento(ArrayList<Organismo> poblacion);

}


