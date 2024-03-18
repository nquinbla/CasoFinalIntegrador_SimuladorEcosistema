package SimuladorDeDinámicas;

import ModeladoDeEntidades.Organismo;
import java.util.List;
import java.util.Random;

public class EventosAleatorios {
    private Random random = new Random();

    public void simularEventosAleatorios(List<Organismo> poblacion) {
        int evento = random.nextInt(3);
        switch (evento) {
            case 0: // desastre natural
                for (Organismo organismo : poblacion) {
                    // Asume que el desastre natural reduce la salud de todos los organismos en un 30%
                    organismo.setSalud((int)(organismo.getSalud() * 0.7));
                }
                break;
            case 1: // enfermedad
                for (Organismo organismo : poblacion) {
                    // Asume que la enfermedad reduce la salud de un 20% de los organismos
                    if (random.nextDouble() < 0.2) {
                        organismo.setSalud((int)(organismo.getSalud() * 0.8));
                    }
                }
                break;
            case 2: // cambio climático
                for (Organismo organismo : poblacion) {
                    // Asume que el cambio climático desplaza a todos los organismos a una nueva posición
                    organismo.setX(random.nextInt(100)); // Asume que 100 es el límite del ecosistema en el eje x
                    organismo.setY(random.nextInt(100)); // Asume que 100 es el límite del ecosistema en el eje y
                }
                break;
        }
    }
}