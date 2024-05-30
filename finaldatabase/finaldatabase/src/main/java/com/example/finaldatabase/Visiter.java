package com.example.finaldatabase;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Visiter {



    public void law(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("law.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();
    }

    public void buy(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("tiket.fxml"));

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

    public void back(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("loguser.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();

    }

    public void ms(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("moves.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();
    }

    public void cinma(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("visit(cinma).fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();

    }
}
