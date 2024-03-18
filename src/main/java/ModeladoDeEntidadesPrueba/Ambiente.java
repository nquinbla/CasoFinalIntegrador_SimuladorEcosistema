package ModeladoDeEntidadesPrueba;

// [1] Clase Ambiente
public class Ambiente {
    private String clima; // Clima del ambiente
    private String terreno; // Terreno del ambiente
    private int recursos; // Recursos del ambiente

    // [2] Constructor de la clase
    public Ambiente(String clima, String terreno, int recursos) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursos = recursos;
    }

    // [3] Getters y Setters
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

    public int getRecursos() {
        return recursos;
    }
    public void setRecursos(int recursos) {
        this.recursos = recursos;
    }

    // [4] Método toString
    @Override
    public String toString() {
        return "Ambiente{" + "clima=" + clima + ", terreno=" + terreno + ", recursos=" + recursos + '}';
    }

    // [5] Método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Ambiente other = (Ambiente) obj;

        if ((this.clima == null) ? (other.clima != null) : !this.clima.equals(other.clima)) {
            return false;
        }

        if ((this.terreno == null) ? (other.terreno != null) : !this.terreno.equals(other.terreno)) {
            return false;
        }

        if (this.recursos != other.recursos) {
            return false;
        }

        return true;
    }


}
