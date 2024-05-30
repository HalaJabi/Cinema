package com.example.finaldatabase;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class addmin {
    public void back(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("logadmin.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();
    }



    public void update(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("updatemove.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();

    }

    public void delete(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("deldetmove.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();


    }

    public void add(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("addmove.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();

    }

    public void out(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("logout.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();
    }
}
