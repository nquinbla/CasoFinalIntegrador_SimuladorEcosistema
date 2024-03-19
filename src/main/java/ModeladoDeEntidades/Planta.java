package ModeladoDeEntidades;

// Clase Planta
public class Planta extends Organismo {
    protected String nombre;
    protected String especie;
    protected int cantidadAgua;
    protected int cantidadLuz;
    protected int cantidadNutrientes;


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
