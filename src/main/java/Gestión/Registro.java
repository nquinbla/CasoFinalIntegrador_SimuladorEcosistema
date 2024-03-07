package Gestión;
import java.util.List

// [1] Clase Registro
public class Registro {
    private List<String> entradas;
    private List<String> salidas;

    public void agregarEntrada(String entrada) {
        entradas.add(entrada);
    }
    public void agregarSalida(String salida) {
        salidas.add(salida);
    }

    // Setters y getters
    public List<String> getEntradas() {
        return entradas;
    }

    public List<String> getSalidas() {
        return salidas;
    }

public void setEntradas(List<String> entradas) {
        this.entradas = entradas;
    }

    public void setSalidas(List<String> salidas) {
        this.salidas = salidas;
    }
}
