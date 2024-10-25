module org.example.devicemanaging {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.devicemanaging to javafx.fxml;
    exports org.example.devicemanaging;
}
