package com.example.finaldatabase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application
{

    public static void main(String [] args){
        launch(args);

    }
    @Override
    public void start(Stage stage) throws IOException
    {

        Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("hello");
        Scene scene=new Scene(root, 950, 600);
        stage.setScene(scene);
        stage.show();

    }


}






