package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class E03Stages extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Creating a root node
        Group root = new Group();
        // Creating a scene and setting its background color
        Scene scene = new Scene(root, Color.DODGERBLUE);
        // Setting the title
        stage.setTitle("Thomas the Angry Train h00t h00t");
        // Setting the icon
        Image icon = new Image("file:D:/Projects/Java/Tutorial/Bro Code/JavaFX Tutorial/src/icon.png");
        stage.getIcons().add(icon);
        // Setting the dimensions
        stage.setWidth(420);
        stage.setHeight(420);
        // Setting the resizability and start position
        stage.setResizable(false);
        stage.setX(50);
        stage.setY(50);
        // Setting the full screen options
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press Ctrl + F to exit full screen.");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Ctrl+F"));
        // Setting the scene of the stage
        stage.setScene(scene);
        // Showing the stage
        stage.show();
    }
}
