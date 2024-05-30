package com.example.finaldatabase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deldetmove {
    @FXML
    private TextField ssn;
    public void back(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("addmin.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();

    }

    public void delete(ActionEvent actionEvent) throws SQLException {

        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(url, "c##farm", "654321");
        Statement stm = con.createStatement();

        String s="delete from MOVES where MOVESID='"+ssn.getText() + "'";
        //  String s="insert into visitor values('1122','AHMAD JABE','5555','11-May-2015','Nablus','0598112808')";
        JOptionPane.showMessageDialog(null,"you delete  move");
        stm.executeUpdate(s);
        con.close();
    }
}
