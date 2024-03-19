package ModeladoDeEntidades;

// Clase Planta
public abstract class Planta extends Organismo {
    protected String nombre;
    protected String especie;
    protected int cantidadAgua;


    // Constructor de la clase Planta
    public Planta(int x, int y, int edad, int salud, boolean EstadoReproductivo, String nombre, String especie, int cantidadAgua) {
        super(x, y, edad, salud, EstadoReproductivo);
        this.nombre = nombre;
        this.especie = especie;
        this.cantidadAgua = cantidadAgua;
    }

    // Getters y setters de la clase Planta
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    public int getCantidadAgua() {return cantidadAgua;}
    public void setCantidadAgua(int cantidadAgua) {this.cantidadAgua = cantidadAgua;}

    // Método Override
    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", especie=" + especie + '}';
    }
}
