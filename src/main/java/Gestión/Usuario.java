package Gestión;

// [1] Clase Usuario
public class Usuario {
    String nombre; // Nombre del usuario
    String contraseña; // Contraseña del usuario

    // [2] Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // autenticar al usuario
    public boolean autenticar(String nombre, String contraseña) {
        return this.nombre.equals(nombre) && this.contraseña.equals(contraseña);
    }
}
