package ModeladoDeEntidades;

// Clase Animal
public class Animal extends Organismo {
    protected boolean depredador;
    protected boolean presa;

    // Constructor de la clase Animal
    public Animal(int x, int y, int edad, int salud, boolean EstadoReproductivo, boolean depredador, boolean presa) {
        super(x, y, edad, salud, EstadoReproductivo);
        this.depredador = depredador;
        this.presa = presa;
    }

    // Getters y setters de la clase Animal
    public boolean isDepredador() {
        return depredador;
    }

    public void setDepredador(boolean depredador) {
        this.depredador = depredador;
    }

    public boolean isPresa() {
        return presa;
    }

    public void setPresa(boolean presa) {
        this.presa = presa;
    }

    // Método Override
    @Override
    public String toString() {
        return "Animal{" + "depredador=" + depredador + ", presa=" + presa + '}';
    }

}