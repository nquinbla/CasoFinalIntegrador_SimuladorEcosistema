package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Animal
public class Animal extends Organismo {
    protected String nombre;
    protected String especie;
    protected String sexo;

    public static ArrayList<Animal> todosLosAnimales = new ArrayList<>();


    // Constructor de la clase Animal
    public Animal(int x, int y, int edad, int salud, boolean EstadoReproductivo, String nombre, String especie, String sexo) {
        super(x, y, edad, salud, EstadoReproductivo);
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
    }

    // Getters y setters de la clase Animal
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    // Método Override
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + ", sexo=" + sexo + '}';
    }
}
