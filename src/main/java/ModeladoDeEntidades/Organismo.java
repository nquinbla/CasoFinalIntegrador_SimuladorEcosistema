package ModeladoDeEntidades;

// Clase organismo
public abstract  class Organismo {
    protected int posX;
    protected int posY;
    protected int edad;
    protected int salud;
    protected boolean EstadoReproductivo;
    protected String nombreEspecie;
    protected boolean esDepredador;
    protected boolean esPresa;
    protected boolean estaVivo;

    // Constructor de la clase Organismo
    public Organismo(int x, int y, int edad, int salud, boolean EstadoReproductivo, String nombreEspecie, boolean esDepredador, boolean esPresa, boolean estaVivo) {
        this.posX = x;
        this.posY = y;
        this.edad = 0; // edad inicial
        this.salud = 100; // salud inicial
        this.EstadoReproductivo = false; // no reproductivo al inicio
        this.nombreEspecie = nombreEspecie;
        this.esDepredador = esDepredador; // se asigna si es depredador o no
        this.esPresa = esPresa; // se asigna si es presa o no
        this.estaVivo = true; // el organismo está vivo al inicio
    }

    // Getters y setters de la clase Organismo
    public int getPosX() {return posX;}
    public void setPosX(int posX) {this.posX = posX;}

    public int getPosY() {return posY;}
    public void setPosY(int posY) {this.posY = posY;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public int getSalud() {return salud;}
    public void setSalud(int salud) {this.salud = salud;}

    public boolean isEstadoReproductivo() {return EstadoReproductivo;}
    public void setEstadoReproductivo(boolean EstadoReproductivo) {this.EstadoReproductivo = EstadoReproductivo;}

    public String getNombreEspecie() {return nombreEspecie;}
    public void setNombreEspecie(String nombreEspecie) {this.nombreEspecie = nombreEspecie;}

    public boolean isEsDepredador() {return esDepredador;}
    public void setEsDepredador(boolean esDepredador) {this.esDepredador = esDepredador;}

    public boolean isEsPresa() {return esPresa;}
    public void setEsPresa(boolean esPresa) {this.esPresa = esPresa;}

    public boolean isEstaVivo() {return estaVivo;}
    public void setEstaVivo(boolean estaVivo) {this.estaVivo = estaVivo;}

    // Métodos de la clase Organismo
    public void envejecer() {
        this.edad++;
        if (this.edad >= 5) { // Por ejemplo, consideremos que el estado reproductivo inicia a los 5 años
            this.EstadoReproductivo = true;
        }
    }

    public void morir() {
        this.estaVivo = false;
        System.out.println("El organismo ha muerto en (" + this.posX + ", " + this.posY + ")");
    }

    public void interactuar(Ambiente ambiente) {
        // Método para que los organismos interactúen con el ambiente
    }



    // Métodos Override
    @Override
    public String toString() {
        return "Organismo{" + "x=" + x + ", y=" + y + ", edad=" + edad + ", salud=" + salud + ", EstadoReproductivo=" + EstadoReproductivo + '}';
    }
}
