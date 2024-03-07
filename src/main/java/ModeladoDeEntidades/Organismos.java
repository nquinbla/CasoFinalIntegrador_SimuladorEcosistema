package ModeladoDeEntidades;

// [1] Clase abstracta Organismos
public abstract class Organismos {
    private int posición; // posición en el ecosistema
    private int salud; // salud del organismo
    private int edad; // edad del organismo
    private boolean estadoReproductivo; // estado reproductivo del organismo

    // [2] Constructor de la clase Organismos
    public Organismos(int posición, int salud, int edad, boolean estadoReproductivo) {
        this.posición = posición;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    // [3] Getters y setters de la clase Organismos
    public int getPosición() {
        return posición;
    }
    public void setPosición(int posición) {
        this.posición = posición;
    }

    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstadoReproductivo() {
        return estadoReproductivo;
    }
    public void setEstadoReproductivo(boolean estadoReproductivo) {
        this.estadoReproductivo = estadoReproductivo;
    }

}
