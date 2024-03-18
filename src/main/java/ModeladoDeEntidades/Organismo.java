package ModeladoDeEntidades;

// Clase organismo
public abstract  class Organismo {
    protected int x;
    protected int y;
    protected int edad;
    protected int salud;
    protected boolean EstadoReproductivo;

    // Constructor de la clase Organismo
    public Organismo(int x, int y, int edad, int salud, boolean EstadoReproductivo) {
        this.x = x;
        this.y = y;
        this.edad = edad;
        this.salud = salud;
        this.EstadoReproductivo = EstadoReproductivo;
    }

    // Getters y setters de la clase Organismo
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public boolean isEstadoReproductivo() {
        return EstadoReproductivo;
    }

    public void setEstadoReproductivo(boolean EstadoReproductivo) {
        this.EstadoReproductivo = EstadoReproductivo;
    }

    // Métodos Override
    @Override
    public String toString() {
        return "Organismo{" + "x=" + x + ", y=" + y + ", edad=" + edad + ", salud=" + salud + ", EstadoReproductivo=" + EstadoReproductivo + '}';
    }

    // Métodos abstractos
    public abstract void moverse();

    public abstract void comer();

    public abstract void reproducirse();

    // Métodos abstractos para interacciones naturales
    public abstract void predation();
    public abstract void competeForResources();
}
