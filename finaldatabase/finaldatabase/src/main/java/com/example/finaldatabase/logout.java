package com.example.finaldatabase;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import javax.swing.*;
import net.sf.jasperreports.engine.xml.JRXmlDigesterFactory;
public class logout {


    public void back(ActionEvent actionEvent) throws IOException {
        Parent m = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        Scene ms = new Scene(m);
        Stage m3;
        m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();

    }




        public void js(ActionEvent actionEvent) throws SQLException, IOException, JRException {

        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(url, "c##farm", "654321");
        InputStream input =new FileInputStream(new File("Leaf_Red.jrxml"));


        JasperDesign  jd = JRXmlLoader.load(input);


        JasperReport jr= JasperCompileManager.compileReport(jd);

        JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
//JFrame fram= new JFrame("Report");
//fram.getContentPane().add(new JRViewer(jp));
//fram.pack();
//fram.setVisible(true);


       OutputStream  OUT= new FileOutputStream(new File("movies.pdf"));

       JasperExportManager.exportReportToPdfStream(jp, OUT);
            JOptionPane.showMessageDialog(null,"you edit on jasperreport please check file name movies");

       OUT.close();
        input.close();
        con.close();
    }
}