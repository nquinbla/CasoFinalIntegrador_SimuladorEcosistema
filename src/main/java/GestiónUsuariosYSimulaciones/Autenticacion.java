package GestiónUsuariosYSimulaciones;

import java.util.HashMap;
import java.util.Map;

public class Autenticacion {

    private Map<String, String> usuariosRegistrados; // Almacena usuarios y contraseñas

    public Autenticacion() {
        usuariosRegistrados = new HashMap<>();
        // Simulamos usuarios registrados (usuario, contraseña)
        usuariosRegistrados.put("Nerea Quintanilla", "tartadequeso");
        usuariosRegistrados.put("Ruben", "UAXmaker");
    }

    // Método para iniciar sesión
    public boolean iniciarSesion(String usuario, String contraseña) {
        return usuariosRegistrados.containsKey(usuario) && usuariosRegistrados.get(usuario).equals(contraseña);
    }
}
