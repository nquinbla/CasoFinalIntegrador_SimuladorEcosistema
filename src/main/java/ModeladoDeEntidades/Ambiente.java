package ModeladoDeEntidades;

// Clase Ambiente
public class Ambiente {
    protected String clima;
    protected String terreno;
    protected String recursosDisponibles;

    // Constructor de la clase Ambiente
    public Ambiente(String clima, String terreno, String recursosDisponibles) {
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

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(String recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    // Método Override
    @Override
    public String toString() {
        return "Ambiente{" + "clima=" + clima + ", terreno=" + terreno + ", recursosDisponibles=" + recursosDisponibles + '}';
    }
}
