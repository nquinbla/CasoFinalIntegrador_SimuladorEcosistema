package ModeladoDeEntidades;

// [1] Clase Plantas
public class Plantas extends Organismos{

    private int  semillas; // cantidad de semillas que produce la planta
    private boolean fruto; // si la planta produce fruto o no
    private boolean flor; // si la planta produce flor o no

    // [2] Constructor de la clase Plantas
    public Plantas(int posición, int salud, int edad, boolean estadoReproductivo, int semillas, boolean fruto, boolean flor) {
        super(posición, salud, edad, estadoReproductivo);
        this.semillas = semillas;
        this.fruto = fruto;
        this.flor = flor;
    }

    // [3] Getters y setters de la clase Plantas
    public int getSemillas() {
        return semillas;
    }
    public void setSemillas(int semillas) {
        this.semillas = semillas;
    }

    public boolean isFruto() {
        return fruto;
    }
    public void setFruto(boolean fruto) {
        this.fruto = fruto;
    }

    public boolean isFlor() {
        return flor;
    }
    public void setFlor(boolean flor) {
        this.flor = flor;
    }

}
