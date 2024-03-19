package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Animal
public class Animal extends Organismo {
    private String especie;
    private int alimentacion;

    private static ArrayList<Animal> animalesList = new ArrayList<>();

    // Constructor de la clase Animal
    public Animal(String nombre, Posicion posicion, int salud, int edad, boolean estadoReproductivo, String especie, int alimentacion) {
        super(nombre, posicion, salud, edad, estadoReproductivo);
        this.especie = especie;
        this.alimentacion = alimentacion;
        animalesList.add(this);
    }

    // Getters y setters de la clase Animal
    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}
    public String getAlimentacion() {return alimentacion;}
    public void setAlimentacion(String alimentacion) {this.alimentacion = Integer.parseInt(alimentacion);}

    public static ArrayList<Animal> getAnimalesList() {return animalesList;}

    @Override
    public String toString() {
        return "Animal: " + this.getNombre();
    }
}