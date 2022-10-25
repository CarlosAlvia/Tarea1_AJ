module ventana.tarea1_aj {
    requires javafx.controls;
    requires javafx.fxml;

    opens ventana.tarea1_aj to javafx.fxml;
    exports ventana.tarea1_aj;
}
