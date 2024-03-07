package ModeladoDeEntidades;

// [1] Clase abstracta Organismos
public abstract class Organismos {
    private int posición; // posición en el ecosistema
    private int salud; // salud del organismo
    private int edad; // edad del organismo
    private  boolean reproducirse; // estado reproductivo del organismo
    public static final int EDAD_REPRODUCTIVA = 10; // Define the constant here


    // [2] Constructor de la clase Organismos
    public Organismos(int posición, int salud, int edad, boolean reproducirse) {
        this.posición = posición;
        this.salud = salud;
        this.edad = edad;
        this.reproducirse = reproducirse;
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
        return reproducirse;
    }
    public void setEstadoReproductivo(boolean estadoReproductivo) {
        this.reproducirse = reproducirse;
    }


    public void incrementarEdad() {
        this.edad++;
        if (this.edad >= EDAD_REPRODUCTIVA) {
            this.reproducirse = true;
        }
    }
}
