package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Planta
public class Planta extends Organismo {
    protected String nombre;
    protected String especie;
    protected int cantidadAgua;
    protected int cantidadLuz;
    protected int cantidadNutrientes;


    public static ArrayList<Planta> todasLasPlantas = new ArrayList<>();

    static {
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Rosa", "Rosa", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Girasol", "Helianthus annuus", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Orquídea", "Orchidaceae", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Margarita", "Bellis perennis", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Tulipán", "Tulipa", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Lirio", "Lilium", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Marihuana", "Cannabis sativa", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Coca", "Erythroxylum coca", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Amapola", "Papaver somniferum", 100, 100, 100));
        todasLasPlantas.add(new Planta(2, 3, 24, 100, true, "Cactus", "Cactaceae", 100, 100, 100));
    }

    // Constructor de la clase Planta
    public Planta(int x, int y, int edad, int salud, boolean EstadoReproductivo, String nombre, String especie, int cantidadAgua, int cantidadLuz, int cantidadNutrientes) {
        super(x, y, edad, salud, EstadoReproductivo);
        this.nombre = nombre;
        this.especie = especie;
        this.cantidadAgua = cantidadAgua;
        this.cantidadLuz = cantidadLuz;
        this.cantidadNutrientes = cantidadNutrientes;
    }


    // Getters y setters de la clase Planta
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    public int getCantidadAgua() {return cantidadAgua;}
    public void setCantidadAgua(int cantidadAgua) {this.cantidadAgua = cantidadAgua;}

    public int getCantidadLuz() {return cantidadLuz;}
    public void setCantidadLuz(int cantidadLuz) {this.cantidadLuz = cantidadLuz;}

    public int getCantidadNutrientes() {return cantidadNutrientes;}
    public void setCantidadNutrientes(int cantidadNutrientes) {this.cantidadNutrientes = cantidadNutrientes;}

    // Método Override
    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", especie=" + especie + '}';
    }
}
