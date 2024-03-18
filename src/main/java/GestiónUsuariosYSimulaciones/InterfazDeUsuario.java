package GestiónUsuariosYSimulaciones;

import javax.swing.*;
import java.awt.*;

public class SimuladorUI extends JFrame {
    private JTextField parametro1Field;
    private JTextField parametro2Field;
    private JButton iniciarSimulacionButton;
    private JButton detenerSimulacionButton;
    private JTextArea resultadosArea;

    public SimuladorUI() {
        parametro1Field = new JTextField(20);
        parametro2Field = new JTextField(20);
        iniciarSimulacionButton = new JButton("Iniciar simulación");
        detenerSimulacionButton = new JButton("Detener simulación");
        resultadosArea = new JTextArea(10, 30);

        setLayout(new FlowLayout());
        add(parametro1Field);
        add(parametro2Field);
        add(iniciarSimulacionButton);
        add(detenerSimulacionButton);
        add(new JScrollPane(resultadosArea));

        setTitle("Simulador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimuladorUI::new);
    }
}