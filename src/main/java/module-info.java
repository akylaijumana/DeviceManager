module org.example.devicemanaging {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.devicemanaging to javafx.fxml;
    exports org.example.devicemanaging;
    exports org.example.devicemanaging.controller;
    opens org.example.devicemanaging.controller to javafx.fxml;
    exports org.example.devicemanaging.model;
    opens org.example.devicemanaging.model to javafx.fxml;
}
