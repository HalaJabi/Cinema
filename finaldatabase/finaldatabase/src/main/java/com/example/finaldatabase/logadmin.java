//done

package com.example.finaldatabase;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.sql.*;

public class logadmin {

    @FXML
    private ImageView user;

    @FXML
    private TextField email;

    @FXML
    private PasswordField pass;


    @FXML
    private Button goin;


    @FXML
    private JFXButton back;
    @FXML
    private Button creatt;


    @FXML
    void go(ActionEvent event)  throws IOException {


        if(goin==event.getSource()){
            //  System.out.println("m");
            if (this.email.getText().isEmpty() || this.pass.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(null, "   Please Fill All Fields  ");
                // invalid.setText("Please Fill All Fields");
            }
            else {


                    try {
                       int flage=0;
                        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                        String url = "jdbc:oracle:thin:@localhost:1521:xe";
                        Connection con = DriverManager.getConnection(url,"c##farm","654321");
                        String sql = "Select * from Employee where Gmail=? and ePassword=?";
                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1, email.getText());
                        pst.setString(2, pass.getText());
                        ResultSet rs = pst.executeQuery();



                        while(rs.next()){
                            if(rs.getString(2).equals(email.getText())){
                                //    id=rs.getString(5);

                                if(goin==event.getSource()){
                                    flage=1;
                                    Parent m = FXMLLoader.load(getClass().getResource("addmin.fxml"));

                                    Scene ms = new Scene(m);
                                    Stage m3;
                                    m3=(Stage)((Node)event.getSource()).getScene().getWindow();
                                    m3.setScene(ms);
                                    m3.show();}


                                return;}}

                        if (flage==0) {
                            JOptionPane.showMessageDialog(null, "  ID or password is incorrect  ");
                            email.setText("");
                            pass.setText("");

                        }

                    }


                catch (Exception ex) {
                    // goin.go(SController.class.getName()).log(PlatformLogger.Level.SEVERE, null, ex);
                }

            }

        }
    }

    @FXML
    void back1(ActionEvent event) throws IOException {
        {
            Parent m = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            Scene ms = new Scene(m);
            Stage m3;
            m3 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            m3.setScene(ms);
            m3.show();

        }
    }
    @FXML
    public void creat(ActionEvent actionEvent) throws  IOException {

        Parent m = FXMLLoader.load(getClass().getResource("createadmin.fxml"));

        Scene ms = new Scene(m);

        Stage m3 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        m3.setScene(ms);
        m3.show();


    }


}
