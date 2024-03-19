package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Planta
public class Planta extends Organismo {

    public Planta(int x, int y, int edad, int salud, boolean EstadoReproductivo, String nombreEspecie, boolean esDepredador, boolean esPresa, boolean estaVivo) {
        super(x, y, edad, salud, EstadoReproductivo, nombreEspecie, esDepredador, esPresa, estaVivo);
    }

    @Override
public void interactuar(Ambiente ambiente) {
        this.salud += ambiente.obtenerRecursos(7); //
        if (this.EstadoReproductivo && this.salud >= 75) {
            Planta nuevaPlanta = new Planta(this.posX, this.posY, 0, 100, false, "Planta", false, false, true);
            ambiente.agregarOrganismo(nuevaPlanta);
            System.out.println("¡Una nueva planta ha brotado en (" + this.posX + ", " + this.posY + ")!");
        }
    }
}