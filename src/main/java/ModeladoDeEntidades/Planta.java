package ModeladoDeEntidades;

// Clase Planta
public class Planta extends Organismo {
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

    // Getters y setters de la clase Planta
    public int getCantidadDeAgua() {
        return cantidadDeAgua;
    }

    public void setCantidadDeAgua(int cantidadDeAgua) {
        this.cantidadDeAgua = cantidadDeAgua;
    }

    public int getCantidadDeLuz() {
        return cantidadDeLuz;
    }

    public void setCantidadDeLuz(int cantidadDeLuz) {
        this.cantidadDeLuz = cantidadDeLuz;
    }

    public int getCantidadDeNutrientes() {
        return cantidadDeNutrientes;
    }

    public void setCantidadDeNutrientes(int cantidadDeNutrientes) {
        this.cantidadDeNutrientes = cantidadDeNutrientes;
    }

    // Método Override
    @Override
    public String toString() {
        return "Planta{" + "cantidadDeAgua=" + cantidadDeAgua + ", cantidadDeLuz=" + cantidadDeLuz + ", cantidadDeNutrientes=" + cantidadDeNutrientes + '}';
    }

    // Métodos abstractos
    @Override
    public void moverse() {
        // Implement the method for the Planta class
    }

    @Override
    public void comer() {
        // Implement the method for the Planta class
    }

    @Override
    public Organismo reproducirse(Organismo pareja) {
        // Implement the method for the Planta class
        return pareja;
    }
}
