
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
public class create {

    @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField date;
    @FXML
    private TextField number;
    @FXML
    private TextField add;
    @FXML
    private TextField pass;
    public void back(ActionEvent actionEvent) throws IOException {

        Parent m = FXMLLoader.load(getClass().getResource("loguser.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();

    }

    public void cbutton(ActionEvent actionEvent) throws SQLException {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            Connection con = DriverManager.getConnection(url, "c##farm", "654321");
            Statement stm = con.createStatement();
          String s="insert into visitor values('"+id.getText()+"','"+name.getText()+"','"+pass.getText()+"','"+date.getText()+"','"+add.getText()+"','"+number.getText()+"')";
          //  String s="insert into visitor values('1122','AHMAD JABE','5555','11-May-2015','Nablus','0598112808')";
            JOptionPane.showMessageDialog(null,"your account is created");
            stm.executeUpdate(s);
            con.commit();
            con.close();
        }
        catch (Exception ex) {
          //  JOptionPane.showMessageDialog(null, ex.toString());
        }
    }}
