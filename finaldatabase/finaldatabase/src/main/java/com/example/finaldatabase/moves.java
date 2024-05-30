package com.example.finaldatabase;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oracle.jdbc.driver.OracleDriver;
import oracle.jdbc.pool.OracleDataSource;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class moves{


    @FXML
    private JFXButton  V11,V22,V33;

    @FXML
    private  javafx.scene.control.TextArea a1,a2,a3;



    public void i1(ActionEvent actionEvent) throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##farm", "654321");
        Statement stm = con.createStatement();
        String insQury = "select * From MOVES where MOVESID='0000'";
        ResultSet rs = stm.executeQuery(insQury);
        a1.setText("ID: ");
        while ((rs.next()))
        {
            a1.appendText(rs.getString(1));
            a1.appendText("\n");
            a1.appendText("Name : ");
            a1.appendText(rs.getString(2));
            a1.appendText("\n");
            a1.appendText("Type : ");
            a1.appendText(rs.getString(3));
            a1.appendText("\n");
            a1.appendText("Year_RELEASE :");
            a1.appendText(rs.getString(4));
            a1.appendText("\n");
            a1.appendText("Rating : ");
            a1.appendText(rs.getString(5));
            a1.appendText("\n");
            a1.appendText("Actor : ");
            a1.appendText(rs.getString(6));


        }
        con.close();

    }



    public void i2(ActionEvent actionEvent) throws SQLException {


        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##farm", "654321");
        Statement stm = con.createStatement();
        String insQury = "select * From MOVES where MOVESID='9999'";
        ResultSet rs = stm.executeQuery(insQury);
        a2.setText("ID: ");
        while ((rs.next()))
        {
            a2.appendText(rs.getString(1));
            a2.appendText("\n");
            a2.appendText("Name : ");
            a2.appendText(rs.getString(2));
            a2.appendText("\n");
            a2.appendText("Type : ");
            a2.appendText(rs.getString(3));
            a2.appendText("\n");
            a2.appendText("Year_RELEASE :");
            a2.appendText(rs.getString(4));
            a2.appendText("\n");
            a2.appendText("Rating : ");
            a2.appendText(rs.getString(5));
            a2.appendText("\n");
            a2.appendText("Actor : ");
            a2.appendText(rs.getString(6));


        }
        con.close();
    }



    public void i3(ActionEvent actionEvent) throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##farm", "654321");
        Statement stm = con.createStatement();
        String insQury = "select * From MOVES where MOVESID='0008'";
        ResultSet rs = stm.executeQuery(insQury);
        a3.setText("ID: ");
        while ((rs.next()))
        {
            a3.appendText(rs.getString(1));
            a3.appendText("\n");
            a3.appendText("Name : ");
            a3.appendText(rs.getString(2));
            a3.appendText("\n");
            a3.appendText("Type : ");
            a3.appendText(rs.getString(3));
            a3.appendText("\n");
            a3.appendText("Year_RELEASE :");
            a3.appendText(rs.getString(4));
            a3.appendText("\n");
            a3.appendText("Rating : ");
            a3.appendText(rs.getString(5));
            a3.appendText("\n");
            a3.appendText("Actor : ");
            a3.appendText(rs.getString(6));


        }
        con.close();
    }



    public void BACK(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("visiters.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();
    }
}
