package com.example.finaldatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloApplication  implements Initializable {
    @FXML
    private ImageView loginpic;

    @FXML
    private Button logadmin;

    @FXML
    private Button loguser;



    @FXML
    void B1(ActionEvent event)throws IOException {
        {
 //System.out.println("b1");
         Parent m = FXMLLoader.load(getClass().getResource("loguser.fxml"));

          Scene ms = new Scene(m);
            Stage m3;
            m3=(Stage)((Node)event.getSource()).getScene().getWindow();
            m3.setScene(ms);
            m3.show();
        }
    }
    @FXML
    void B2(ActionEvent event) throws IOException{
        {
          // System.out.println("b2");
         Parent m = FXMLLoader.load(getClass().getResource("logadmin.fxml"));

           Scene ms = new Scene(m);
           Stage m3;
           m3=(Stage)((Node)event.getSource()).getScene().getWindow();
            m3.setScene(ms);
            m3.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}