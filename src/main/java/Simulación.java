
import ModeladoDeEntidades.*;
import SimuladorDeDinámicas.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;



// Clase que representa la simulación de un ecosistema
public class Simulación {
    private Random random = new Random();
    private EventoAleatorio[] eventos = {new E_DesastreNatural(), new E_CambioClimatico()};
    private Crecimiento crecimiento = new Crecimiento();
    private Reproduccion reproduccion = new Reproduccion();
    private List<Animal> animalesMovidos = new ArrayList<>();

    // Método que inicia la simulación
    public void iniciarSimulacion() {
        int dia = 1;
        while (true) {
            System.out.println("Día " + dia + " de la simulación:");
            desplazarAnimales();
            aplicarEventos();
            pelear();
            mostrarResultados();

            System.out.println("Presione Enter para el siguiente turno o escriba 'salir' para terminar la simulación.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("salir".equalsIgnoreCase(input)) {
                break;
            }
            dia++;
            animalesMovidos.clear();
        }
    }

    // Método que desplaza a los animales de forma aleatoria
    public void desplazarAnimales() {
        List<Animal> animales = Animal.getAnimalesList();
        if (animales != null) {
            for (Animal animal : animales) {
                if (!animalesMovidos.contains(animal)) {
                    Organismo.Posicion posicion = animal.getPosicion();
                    if (posicion != null) {
                        posicion.setX(posicion.getX() + random.nextInt(3) - 1);
                        posicion.setY(posicion.getY() + random.nextInt(3) - 1);
                        System.out.println(animal.getNombre() + " se ha movido a la posición (" + posicion.getX() + ", " + posicion.getY() + ")");
                        animalesMovidos.add(animal);
                        break;
                    }
                }
            }
        }
    }

    // Método que aplica eventos aleatorios a los animales
    public void aplicarEventos() {
        List<Animal> animales = Animal.getAnimalesList();
        if (animales != null) {
            for (Animal animal : animales) {
                if (animal != null) {
                    if (random.nextInt(100) < 10) { // 10% de probabilidad de que ocurra un evento
                        EventoAleatorio evento = eventos[random.nextInt(eventos.length)];
                        evento.aplicar(animal);
                    }
                }
            }
        }
    }

    // Método que simula una pelea entre animales
    public void pelear() {
        List<Animal> animales = Animal.getAnimalesList();
        if (animales != null) {
            for (Animal animal1 : animales) {
                if (animal1 != null) {
                    for (Animal animal2 : animales) {
                        if (animal2 != null && !animal1.equals(animal2) && animal1.getPosicion().equals(animal2.getPosicion())) {
                            if (animal1.getSalud() > animal2.getSalud()) {
                                animal2.setSalud(0);
                                System.out.println(animal1.getNombre() + " ha ganado la pelea contra " + animal2.getNombre());
                            } else {
                                animal1.setSalud(0);
                                System.out.println(animal2.getNombre() + " ha ganado la pelea contra " + animal1.getNombre());
                            }
                        }
                    }
                }
            }
        }
    }

    // Método que muestra los resultados de la simulación
    public void mostrarResultados() {
        List<Animal> animales = Animal.getAnimalesList();
        if (animales != null) {
            for (Animal animal : animales) {
                if (animal != null) {
                    System.out.println(animal);
                }
            }
        }
    }
}
