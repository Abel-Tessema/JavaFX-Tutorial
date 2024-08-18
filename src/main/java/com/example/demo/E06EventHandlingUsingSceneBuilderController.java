package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class E06EventHandlingUsingSceneBuilderController {
    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void up() {
//        System.out.println("Up");
        circle.setCenterY(y -= 10);
    }
    public void right() {
//        System.out.println("Right");
        circle.setCenterX(x += 10);
    }
    public void down() {
//        System.out.println("Down");
        circle.setCenterY(y += 10);
    }
    public void left() {
//        System.out.println("Left");
        circle.setCenterX(x -= 10);
    }
}
