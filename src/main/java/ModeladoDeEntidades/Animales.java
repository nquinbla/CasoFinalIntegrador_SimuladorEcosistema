package ModeladoDeEntidades;

// [1] Clase Animales
public class Animales extends Organismos{
    // atributos
    private boolean herbívoro;
    private boolean carnívoro;
    private boolean omnívoro;
    private boolean carroñero;

    // [2] Constructor de la clase Animales
    public Animales(int posición, int salud, int edad, boolean estadoReproductivo, boolean herbívoro, boolean carnívoro, boolean omnívoro, boolean carroñero) {
        super(posición, salud, edad, estadoReproductivo);
        this.herbívoro = herbívoro;
        this.carnívoro = carnívoro;
        this.omnívoro = omnívoro;
        this.carroñero = carroñero;
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

    public boolean isCarroñero() {
        return carroñero;
    }
    public void setCarroñero(boolean carroñero) {
        this.carroñero = carroñero;
    }

}
