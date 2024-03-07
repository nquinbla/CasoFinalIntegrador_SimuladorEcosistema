package Gestión;

import DinámicasPoblaciones.Simulador;

public class InterfazUsuario {
    private Usuario usuario; // Usuario que está usando la interfaz
    private Simulador simulador; // Simulador que se está usando

    // [2] Constructor
    public InterfazUsuario(Usuario usuario, Simulador simulador) {
        this.usuario = usuario;
        this.simulador = simulador;
    }

    // [3] Métodos
    public void iniciarSesión(String nombre, String contraseña) {
        if (usuario.autenticar(nombre, contraseña)) {
            System.out.println("Sesión iniciada");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

    public void configurarSimulador(int poblaciónInicial, int tasaCrecimiento) {
        simulador.setPoblaciónInicial(poblaciónInicial);
        simulador.setTasaCrecimiento(tasaCrecimiento);
    }
}
