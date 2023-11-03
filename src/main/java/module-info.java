module com.example.password {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.password to javafx.fxml;
    exports com.example.password;
}