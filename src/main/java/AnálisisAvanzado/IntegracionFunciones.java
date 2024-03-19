package AnálisisAvanzado;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import ModeladoDeEntidades.Organismo;
import ModeladoDeEntidades.Ambiente;

// Clase que registra y ejecuta las interacciones entre organismos y entre organismos y el ambiente.
public class IntegracionFunciones {
    private Map<String, BiConsumer<Organismo, Organismo>> interaccionesOrganismos;
    private Map<String, BiConsumer<Organismo, Ambiente>> interaccionesAmbiente;

    // Constructor de la clase.
    public IntegracionFunciones() {
        this.interaccionesOrganismos = new HashMap<>();
        this.interaccionesAmbiente = new HashMap<>();
    }

    // Método que registra una interacción entre organismos.
    public void registrarInteraccionOrganismos(String clave, BiConsumer<Organismo, Organismo> accion) {
        interaccionesOrganismos.put(clave, accion);
    }

    // Método que ejecuta una interacción entre organismos.
    public void ejecutarInteraccionOrganismos(String clave, Organismo org1, Organismo org2) {
        if (interaccionesOrganismos.containsKey(clave)) {
            interaccionesOrganismos.get(clave).accept(org1, org2);
        } else {
            System.out.println("Interacción no registrada: " + clave);
        }
    }

    // Método que registra una interacción entre organismos y el ambiente.
    public void registrarInteraccionAmbiente(String clave, BiConsumer<Organismo, Ambiente> accion) {
        interaccionesAmbiente.put(clave, accion);
    }

    // Método que ejecuta una interacción entre organismos y el ambiente.
    public void ejecutarInteraccionAmbiente(String clave, Organismo org, Ambiente ambiente) {
        if (interaccionesAmbiente.containsKey(clave)) {
            interaccionesAmbiente.get(clave).accept(org, ambiente);
        } else {
            System.out.println("Interacción no registrada: " + clave);
        }
    }
}
