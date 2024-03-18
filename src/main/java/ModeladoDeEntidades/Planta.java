package ModeladoDeEntidades;

// Clase Planta
public class Planta extends Organismo{
    protected int cantidadDeAgua;
    protected int cantidadDeLuz;
    protected int cantidadDeNutrientes;

    // Constructor de la clase Planta
    public Planta(int x, int y, int edad, int salud, boolean EstadoReproductivo, int cantidadDeAgua, int cantidadDeLuz, int cantidadDeNutrientes) {
        super(x, y, edad, salud, EstadoReproductivo);
        this.cantidadDeAgua = cantidadDeAgua;
        this.cantidadDeLuz = cantidadDeLuz;
        this.cantidadDeNutrientes = cantidadDeNutrientes;
    }
}
