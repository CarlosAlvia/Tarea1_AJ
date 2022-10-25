package ventana.tarea1_aj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Pane esctructura = new Pane();
        Button btn1 = new Button("Yellow");
        btn1.setLayoutX(20);
        btn1.setLayoutY(30);
        btn1.setOnAction(e->{cambiarColor(esctructura, btn1.getText());});
        Button btn2 = new Button("Blue");
        btn2.setLayoutX(120);
        btn2.setLayoutY(30);
        btn2.setOnAction(e->{cambiarColor(esctructura, btn2.getText());});
        Button btn3 = new Button("Red");
        btn3.setLayoutX(220);
        btn3.setLayoutY(30);
        btn3.setOnAction(e->{cambiarColor(esctructura, btn3.getText());});
        esctructura.getChildren().addAll(btn1, btn2, btn3);
        scene = new Scene(esctructura, 300, 150);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Botones");
        
    }
    
    public void cambiarColor(Pane esctructura, String color) {
    	esctructura.setStyle("-fx-background-color:" + color);
    }

    public static void main(String[] args) {
        launch();
    }

}
