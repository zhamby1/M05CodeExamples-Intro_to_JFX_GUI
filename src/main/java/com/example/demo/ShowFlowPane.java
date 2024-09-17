package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane =  new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        //gaps are like margins in between elements and not inside
        pane.setHgap(5);
        pane.setVgap(5);

        //place some control nodes in the pane
        //label which is just non interactive text to label something.. labels are usually attached to other fields or controls
        pane.getChildren().addAll(new Label("First Name"),
                new TextField(),
                new Label("MI"));
        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMI,
                new Label("Last Name"),
                new TextField());



        Scene scene = new Scene(pane,200,250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
