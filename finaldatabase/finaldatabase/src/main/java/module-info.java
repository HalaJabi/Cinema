module com.example.finaldatabase {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.oracle.database.jdbc;
    requires java.desktop;
    requires com.jfoenix;
    requires jasperreports;



    opens com.example.finaldatabase to javafx.fxml;
    exports com.example.finaldatabase;
}