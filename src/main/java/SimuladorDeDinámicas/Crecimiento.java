package SimuladorDeDinámicas;

import ModeladoDeEntidades.*;
import java.util.ArrayList;

// Clase Crecimiento
public class Crecimiento {

    // Método para simular el crecimiento de la población de animales
    public static void crecimientoPoblacionAnimal(Animal animal) {
        // Aquí puedes implementar la lógica específica para el crecimiento de la población de animales
        // Por ejemplo, ajustar la salud o edad de los animales según ciertas condiciones
        animal.setEdad(animal.getEdad() + 1);
        animal.setSalud(animal.getSalud() + 5); // Por ejemplo, incrementar la salud en 5 cada año
        // También puedes implementar la lógica para la reproducción de animales
        // Esto puede depender de factores como la edad, la salud y el estado reproductivo del animal
        // animal.reproducirse();
    }

    // Método para simular el crecimiento de la población de plantas
    public static void crecimientoPoblacionPlanta(Planta planta) {
        // Aquí puedes implementar la lógica específica para el crecimiento de la población de plantas
        // Por ejemplo, ajustar la salud o edad de las plantas según ciertas condiciones
        planta.setEdad(planta.getEdad() + 1);
        planta.setSalud(planta.getSalud() + 3); // Por ejemplo, incrementar la salud en 3 cada año
        // También puedes implementar la lógica para la reproducción de plantas
        // Esto puede depender de factores como la edad, la salud y el estado reproductivo de la planta
        // planta.reproducirse();
    }
}