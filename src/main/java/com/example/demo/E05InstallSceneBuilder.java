package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class E05InstallSceneBuilder extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("E05InstallSceneBuilder.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("አበበ በሶ በልቶ ቁምጣን ያዘው፡፡");
        stage.show();
    }
}
