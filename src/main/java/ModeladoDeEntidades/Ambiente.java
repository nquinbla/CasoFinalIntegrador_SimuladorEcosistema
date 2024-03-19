package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Ambiente
public class Ambiente {
    protected String clima;
    protected String terreno;
    protected int recursosDisponibles;
    protected int MaxPosX;
    protected int MaxPosY;

    // Constructor de la clase Ambiente
    public Ambiente(String clima, String terreno, int recursosDisponibles, int MaxPosX, int MaxPosY) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
        this.MaxPosX = MaxPosX;
        this.MaxPosY = MaxPosY;
    }

    // Métodos
    public void agregarOrganismo(Organismo organismo) {
        // Lógica para agregar un organismo al ambiente
    }

    public void pasoDelTiempo() {
        // Simular interacciones entre los organismos y el ambiente
    }

    public void simularPredacion(Organismo depredador, Organismo presa) {
        // Simulación básica: el depredador reduce la salud de la presa
        presa.salud -= 20;
        if (presa.salud <= 0) {
            presa.morir(); // La presa muere
        }
    }

    public void simularCompetenciaRecursos(Organismo organismo1, Organismo organismo2) {
        // Simulación básica: ambos organismos compiten por los recursos
    }

    public void simularPolinizacion(Organismo planta, Organismo polinizador) {
        // Simulación básica: el polinizador ayuda en la polinización de la planta
    }

    public int obtenerRecursos(int cantidad) {
        // Método para que los organismos obtengan recursos del ambiente
        return recursosDisponibles >= cantidad ? cantidad : recursosDisponibles;
    }

    public boolean validarPosicion(int posX, int posY) {
        // Método para verificar si una posición está dentro de los límites del ambiente
        return posX >= 0 && posX < MaxPosX && posY >= 0 && posY < MaxPosY;
    }

    public int buscarComida(Animal animal) {
        // Método para simular la búsqueda de comida por parte de un animal
        // Devuelve la cantidad de recursos encontrados
        return (int) (Math.random() * 21); // Se simula encontrando una cantidad aleatoria entre 0 y 20
    }
}