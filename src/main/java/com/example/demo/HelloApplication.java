package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
        //create new button with the text ok!
        Button btOK = new Button("OK");
        //pack the scene
        Scene scene = new Scene(btOK,200,250);
        primarystage.setTitle("MyJavaFX");
        primarystage.setScene(scene);
        primarystage.show();

        Stage newstage = new Stage();
        newstage.setTitle("Second Stage");
        newstage.setScene(new Scene(new Button("New Stage"), 200,250));
        newstage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}