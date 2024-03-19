package GestiónUsuariosYSimulaciones;

import java.util.Scanner;

// Clase que representa la interfaz de usuario
public class Interfaz {

    private Autenticacion autenticacion;
    private Registro registro;

    // Constructor de la clase
    public Interfaz() {
        autenticacion = new Autenticacion();
        registro = new Registro();
    }

    // Getters y setters
    public Autenticacion getAutenticacion() {return autenticacion;}
    public Registro getRegistro() {return registro;}


}