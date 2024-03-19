package ModeladoDeEntidades;

import java.util.ArrayList;

// Clase Ambiente
public class Ambiente {
    protected String clima;
    protected String terreno;
    protected int recursosDisponibles;

    public static ArrayList<Ambiente> todosLosAmbientes = new ArrayList<>();

    // Constructor de la clase Ambiente
    public Ambiente(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }

    // Getters y setters de la clase Ambiente
    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {return terreno;}

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {this.recursosDisponibles = recursosDisponibles;}

    // Método Override
    @Override
    public String toString() {
        return "Ambiente{" + "clima=" + clima + ", terreno=" + terreno + ", recursosDisponibles=" + recursosDisponibles + '}';
    }
}
