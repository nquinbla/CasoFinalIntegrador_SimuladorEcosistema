package ModeladoDeEntidades;

import java.util.ArrayList;
import java.util.List;

// Clase Planta
public class Planta extends Organismo {
    protected String tipo;
    protected String especie;

    private static List<Planta> plantasList = new ArrayList<>();

    // Constructor de la clase Planta
    public Planta(String nombre, Posicion posicion, int salud, int edad, boolean estadoReproductivo, String tipo, String especie) {
        super(nombre, posicion, salud, edad, estadoReproductivo);
        this.tipo = tipo;
        this.especie = especie;
        plantasList.add(this);
    }

    // Getters y setters de la clase Planta
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public static List<Planta> getPlantasList() {
        return plantasList;
    }

    @Override
    public String toString() {
        return "Planta: " + this.getNombre();
    }
}
