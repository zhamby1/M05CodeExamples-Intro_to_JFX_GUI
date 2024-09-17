package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BindCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        //creating a circle and setting its property
        Pane pane = new Pane();
        Circle circlebound = new Circle();
//        circlebound.setCenterX(100);
//        circlebound.setCenterY(100);
        circlebound.centerXProperty().bind(pane.widthProperty().divide(2));
        circlebound.centerYProperty().bind(pane.heightProperty().divide(2));
        circlebound.setRadius(50);
        circlebound.setStroke(Color.BLACK);
        circlebound.setFill(Color.RED);

        //create a pane to hold the circle
        pane.getChildren().add(circlebound);

        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("Circle Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
