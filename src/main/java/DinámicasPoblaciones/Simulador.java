package DinámicasPoblaciones;

import ModeladoDeEntidades.Ambiente;
import ModeladoDeEntidades.Organismos;
import java.util.List;
import java.util.Random;

// [1] Clase Simulador
public class Simulador {
    private Ambiente ambiente; // Ambiente de la simulación
    private List<Organismos> población; // Población de organismos

    // [2] Constructor de la clase
    public void eventosAleatorios() {
        Random random = new Random();
        int evento = random.nextInt(3);
        switch (evento) {
            case 0: // Aplicar desastre natural
                // Seleccionar un organismo al azar
                int organismo = random.nextInt(población.size());
                // Disminuir la salud del organismo
                población.get(organismo).setSalud(población.get(organismo).getSalud() - 10);
                // Si la salud del organismo es menor a 0, eliminarlo de la población
                if (población.get(organismo).getSalud() < 0) {
                    población.remove(organismo);
                } break;

            case 1: // Aplicar enfermedad
                // Seleccionar un organismo al azar
                int organismoEnfermo = random.nextInt(población.size());
                // Disminuir la salud del organismo
                población.get(organismoEnfermo).setSalud(población.get(organismoEnfermo).getSalud() - 5);
                // Si la salud del organismo es menor a 0, eliminarlo de la población
                if (población.get(organismoEnfermo).getSalud() < 0) {
                    población.remove(organismoEnfermo);
                } break;

            case 2:// Aplicar cambio climático
                // Disminuir los recursos del ambiente
                ambiente.setRecursos(ambiente.getRecursos() - 10);
                break;
        }
    }

    // [3] Método para simular el paso del tiempo
    public void resultadosSimulacion() {
        // Calcular y presentar estadísticas sobre la salud del ecosistema y las tendencias
        int saludEcosistema = 0;
        for (Organismos organismo : población) {
            saludEcosistema += organismo.getSalud();
        }
        saludEcosistema = saludEcosistema / población.size();
        System.out.println("Salud del ecosistema: " + saludEcosistema);

        // Calcular y presentar estadísticas sobre la cantidad de recursos del ambiente
        System.out.println("Recursos del ambiente: " + ambiente.getRecursos());

        // Calcular y presentar estadísticas sobre la cantidad de organismos en el ecosistema
        System.out.println("Cantidad de organismos: " + población.size());

// Calcular y presentar estadísticas sobre la cantidad de organismos en edad reproductiva
        int cantidadReproductiva = 0;
        for (Organismos organismo : población) {
            if (organismo.getEdad() >= Organismos.EDAD_REPRODUCTIVA) {
                cantidadReproductiva++;
            }
        }
        System.out.println("Cantidad de organismos en edad reproductiva: " + cantidadReproductiva);
    }
}


