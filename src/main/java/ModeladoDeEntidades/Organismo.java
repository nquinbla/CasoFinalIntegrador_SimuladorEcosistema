package ModeladoDeEntidades;

// Clase organismo
public abstract  class Organismo {
    protected String nombreEspecie;
    protected Posicion posicion;
    protected int edad;
    protected int salud;
    protected boolean EstadoReproductivo;

    // Constructor de la clase Organismo
    public Organismo(String nombreEspecie, Posicion posicion, int edad, int salud, boolean EstadoReproductivo) {
        if (nombreEspecie == null || posicion == null) {
            throw new IllegalArgumentException("Nombre y posición no pueden ser null");
        }
        this.nombreEspecie = nombreEspecie;;
        this.posicion = posicion;
        this.edad = edad;
        this.salud = salud;
        this.EstadoReproductivo = EstadoReproductivo;
    }

    // Getters y setters de la clase Organismo
    public String getNombre() {return nombreEspecie;}
    public void setNombre(String nombre) {this.nombreEspecie = nombre;}
    public Posicion getPosicion() {return posicion;}
    public void setPosicion(Posicion posicion) {this.posicion = posicion;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public int getSalud() {return salud;}
    public void setSalud(int salud) {this.salud = salud;}
    public boolean isEstadoReproductivo() {return EstadoReproductivo;}
    public void setEstadoReproductivo(boolean EstadoReproductivo) {this.EstadoReproductivo = EstadoReproductivo;}
    public String getNombreEspecie() {return nombreEspecie;}
    public void setNombreEspecie(String nombreEspecie) {this.nombreEspecie = nombreEspecie;}



    // Método posición aleatoria
    public static class Posicion {
        private int x;
        private int y;

        public Posicion(int x, int y) {
            this.x = x;
            this.y = y;
        }

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
    }
}