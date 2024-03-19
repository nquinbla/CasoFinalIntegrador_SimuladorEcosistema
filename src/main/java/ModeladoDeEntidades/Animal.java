package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Animal
public class Animal extends Organismo {

    public Animal(int x, int y, int edad, int salud, boolean EstadoReproductivo, String nombreEspecie, boolean esDepredador, boolean esPresa, boolean estaVivo) {
        super(x, y, edad, salud, EstadoReproductivo, nombreEspecie, esDepredador, esPresa, estaVivo);
    }

    @Override
    public void interactuar(Ambiente ambiente) {

        // Al econtrar comida, aumenta su salud
        int recursosEncontrados = ambiente.buscarComida(this);
        if (recursosEncontrados > 0) {
            this.salud += recursosEncontrados;
        }

        // Movimiento aleatorio
        moverseAleatoriamente(ambiente);
    }

    private void moverseAleatoriamente(Ambiente ambiente) {
        // Método para simular el movimiento aleatorio de un animal en el ambiente
        int newX = this.posX + (int) (Math.random() * 3) - 1; // Mover en el rango [-1, 1]
        int newY = this.posY + (int) (Math.random() * 3) - 1; // Mover en el rango [-1, 1]

        // Verificar si la nueva posición está dentro de los límites del ambiente
        if (ambiente.validarPosicion(newX, newY)) {
            this.posX = newX;
            this.posY = newY;
            System.out.println("El animal se ha movido a (" + this.posX + ", " + this.posY + ")");
        }
    }
}

}