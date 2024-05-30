package com.example.finaldatabase;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.util.Callback;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Cinma implements Initializable {
    @FXML
    private ObservableList guestInfo = FXCollections.observableArrayList();


    @FXML
    private TableView table;

    @FXML
    private TableColumn Tssn;

    @FXML
    private TableColumn Tname;

    @FXML
    private TableColumn  TID;

    @FXML
    private TableColumn  Tadd;
    @FXML
    private javafx.scene.control.TextField idd;

    @FXML
    private Button sarch;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            table.getColumns().clear();
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##farm", "654321");
            Statement stm = con.createStatement();

            String insQury = "select * From visit_TO_CINM";

            ResultSet rs = stm.executeQuery(insQury);
            guestInfo = FXCollections.observableArrayList();



            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {

                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));

                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });


                table.getColumns().addAll(col);


            }
            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    // System.out.println(rs.getString(i));

                    row.add(rs.getString(i));
                }


                guestInfo.add(row);
            }

            //FINALLY ADDED TO TableView

            table.setItems(guestInfo);

        } catch (Exception ex) {
            //  Logger.getLogger(Sign_upController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }




    @FXML
    void sarch1(ActionEvent event) {

        try {
            table.getColumns().clear();
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##farm", "654321");
            Statement stm = con.createStatement();
            String insQury="";
            if(!idd.getText().isEmpty())
                insQury = "select * From visit_TO_CINM where visitID= '"+idd.getText()+"'";
            else insQury =   insQury = "select * from visit_TO_CINM";
            ResultSet rs = stm.executeQuery(insQury);
            guestInfo = FXCollections.observableArrayList();



            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {

                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));

                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });


                table.getColumns().addAll(col);


            }
            while (rs.next()) {
                //Iterate Row

                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column


                    row.add(rs.getString(i));
                }


                guestInfo.add(row);
            }

            //FINALLY ADDED TO TableView

            table.setItems(guestInfo);

        }
        catch (Exception ex) {
            //  Logger.getLogger(Sign_upController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }


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
