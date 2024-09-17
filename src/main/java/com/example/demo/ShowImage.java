package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ShowImage extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox(10);
        //padding between box and image
        //think of margin/padding left right top bottom in web development
        //padding is spacing within a javafx object
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("C:\\Java Projects\\demo\\src\\main\\resources\\com\\example\\demo\\amoungus.gif");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);
        pane.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
