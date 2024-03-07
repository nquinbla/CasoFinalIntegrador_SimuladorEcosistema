package ModeladoDeEntidades;

// [1] Clase Animales
public class Animales extends Organismos{
    // atributos
    private boolean herbívoro;
    private boolean carnívoro;
    private boolean omnívoro;

    // [2] Constructor de la clase Animales
    public Animales(int posición, int salud, int edad, boolean estadoReproductivo, boolean herbívoro, boolean carnívoro, boolean omnívoro) {
        super(posición, salud, edad, estadoReproductivo);
        this.herbívoro = herbívoro;
        this.carnívoro = carnívoro;
        this.omnívoro = omnívoro;
    }

    // [3] Getters y setters de la clase Animales
    public boolean isHerbívoro() {
        return herbívoro;
    }
    public void setHerbívoro(boolean herbívoro) {
        this.herbívoro = herbívoro;
    }

    public boolean isCarnívoro() {
        return carnívoro;
    }
    public void setCarnívoro(boolean carnívoro) {
        this.carnívoro = carnívoro;
    }

    public boolean isOmnívoro() {
        return omnívoro;
    }
    public void setOmnívoro(boolean omnívoro) {
        this.omnívoro = omnívoro;
    }

    // [4] Métodos para las interacciones
    public void predar (Animales presa) {
        if (this.carnívoro) {
            presa.setSalud(presa.getSalud() - 10);
        } if (this.omnívoro) {
            presa.setSalud(presa.getSalud() - 5);
        } if (this.herbívoro) {
            presa.setSalud(presa.getSalud() - 2);
        } if (presa.getSalud() <= 0) {
            presa.setEstadoReproductivo(false);
        }
    }

    public void competirPorRecursos() {
        if (this.herbívoro) {
            this.setSalud(this.getSalud() - 2);
        } if (this.carnívoro) {
            this.setSalud(this.getSalud() - 5);
        } if (this.omnívoro) {
            this.setSalud(this.getSalud() - 3);
        }
    }

    public void reproducirse(Animales pareja) {
        if (this.isEstadoReproductivo() && pareja.isEstadoReproductivo()) {
            this.setSalud(this.getSalud() - 5);
            pareja.setSalud(pareja.getSalud() - 5);
        }
    }

}
