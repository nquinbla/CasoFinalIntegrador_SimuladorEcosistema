package GestiónUsuariosYSimulaciones;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimuladorUI extends Application {
    private TextField parametro1Field;
    private TextField parametro2Field;
    private Button iniciarSimulacionButton;
    private Button detenerSimulacionButton;
    private TextArea resultadosArea;

    @Override
    public void start(Stage primaryStage) {
        parametro1Field = new TextField();
        parametro2Field = new TextField();
        iniciarSimulacionButton = new Button("Iniciar simulación");
        detenerSimulacionButton = new Button("Detener simulación");
        resultadosArea = new TextArea();

        VBox layout = new VBox(10, parametro1Field, parametro2Field, iniciarSimulacionButton, detenerSimulacionButton, resultadosArea);
        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setTitle("Simulador");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}