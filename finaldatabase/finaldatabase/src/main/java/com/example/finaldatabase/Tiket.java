package com.example.finaldatabase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.example.finaldatabase.loguser.id_of_user;
import static com.example.finaldatabase.loguser.id_of_user;

public class Tiket {


    @FXML
    private CheckBox T1;
    @FXML
    private CheckBox T2;
    @FXML
    private CheckBox T3;

String time ;
String salary;

    public void T11(ActionEvent actionEvent) {
     T2.setSelected(false);
     T3.setSelected(false);

    }

    public void T22(ActionEvent actionEvent) {
        T3.setSelected(false);
        T1.setSelected(false);

    }

    public void T33(ActionEvent actionEvent) {
        T1.setSelected(false);
        T2.setSelected(false);
    }

    public void BUY(ActionEvent actionEvent) throws SQLException {


        if (T1.isSelected()) {


            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            Connection con = DriverManager.getConnection(url, "c##farm", "654321");
            Statement stm = con.createStatement();
            String s="insert into MOVE_Visiter values('0000','"+id_of_user+"','4','60')";
            //  String s="insert into visitor values('1122','AHMAD JABE','5555','11-May-2015','Nablus','0598112808')";
            JOptionPane.showMessageDialog(null,"you are buy ticket 1");
            stm.executeUpdate(s);

            con.close();

        }
        else if(T2.isSelected())
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            Connection con = DriverManager.getConnection(url, "c##farm", "654321");
            Statement stm = con.createStatement();
            String s="insert into MOVE_Visiter values('0008','"+id_of_user+"','9','70')";
            JOptionPane.showMessageDialog(null,"you are buy ticket 2");
            stm.executeUpdate(s);

            con.close();

        }
        else if (T3.isSelected())
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            Connection con = DriverManager.getConnection(url, "c##farm", "654321");
            Statement stm = con.createStatement();
            String s="insert into MOVE_Visiter values('9999','"+id_of_user+"','8','110')";
            JOptionPane.showMessageDialog(null,"you are buy ticket 3");
            stm.executeUpdate(s);

            con.close();

        }

        }



    public void back(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("visiters.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();
    }
}
