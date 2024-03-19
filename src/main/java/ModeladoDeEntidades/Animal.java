package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Animal
public class Animal extends Organismo {
    protected String nombre;
    protected String especie;
    protected String sexo;

    // Lista de todos los animales
    public static ArrayList<Animal> todosLosAnimales = new ArrayList<>();
    static {
        todosLosAnimales.add(new Animal(2, 3, 24, 100, true, "León", "Panthera leo", "Macho"));
        todosLosAnimales.add(new Animal(65, 3, 22, 100, true, "Leona", "Panthera leo", "Hembra"));
        todosLosAnimales.add(new Animal(2, 3, 65, 100, true, "Lobo", "Canis Lopus", "Macho"));
        todosLosAnimales.add(new Animal(2, 3, 21, 100, true, "Loba", "Canis Lopus", "Hembra"));
        todosLosAnimales.add(new Animal(2, 3, 24, 100, true, "Tigre", "Panthera tigris", "Macho"));
        todosLosAnimales.add(new Animal(2, 3, 22, 100, true, "Tigresa", "Panthera tigris", "Hembra"));
        todosLosAnimales.add(new Animal(2, 3, 24, 100, true, "Elefante", "Loxodonta africana", "Macho"));
        todosLosAnimales.add(new Animal(2, 3, 22, 100, true, "Elefanta", "Loxodonta africana", "Hembra"));
        todosLosAnimales.add(new Animal(2, 3, 24, 100, true, "Jirafa", "Giraffa camelopardalis", "Macho"));
        todosLosAnimales.add(new Animal(2, 3, 22, 100, true, "Jirafa", "Giraffa camelopardalis", "Hembra"));
    }


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
