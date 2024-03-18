package AnálisisAvanzado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VisualizaciónDatos {
    public void visualizarDatosSimulacion() {
        // Crear un modelo de tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tiempo");
        model.addColumn("Población");

        // Añadir datos a la tabla
        // Deberías reemplazar esto con tus propios datos
        model.addRow(new Object[]{1, 100});
        model.addRow(new Object[]{2, 120});
        model.addRow(new Object[]{3, 110});
        model.addRow(new Object[]{4, 105});
        model.addRow(new Object[]{5, 115});

        // Crear una tabla y añadirla a un JScrollPane
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Crear un JFrame y añadir el JScrollPane
        JFrame frame = new JFrame("Población a lo largo del tiempo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}