package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E04ScenesAndDrawingStuff extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Root node
        Group root = new Group();

        // Scene(root node, width, height, color)
        Scene scene = new Scene(root, 600, 600, Color.DODGERBLUE);
        Stage stage = new Stage();

        // Creating a text node and setting its values
        Text text = new Text();
        text.setText("Oh hell to the NO!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Arial", 50));
        text.setFill(Color.HOTPINK);

        // Creating a line node and setting its values
        Line line = new Line();
        line.setStartX(300);
        line.setStartY(300);
        line.setEndX(500);
        line.setEndY(300);
        line.setFill(Color.DARKORCHID);
        line.setStrokeWidth(5);
        line.setOpacity(0.5);
        line.setRotate(45);
        line.isResizable(); // Doesn't seem to work

        // Creating a rectangle node and setting its values
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(200);
        rectangle.setFill(Color.CORNFLOWERBLUE);
        rectangle.setStroke(Color.MAROON);
        rectangle.setStrokeWidth(5);

        // Creating a triangle/polygon node and setting its values
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 500.0,
                300.0, 400.0,
                300.0, 500.0
        );
        triangle.setFill(Color.GOLD);
        triangle.setStroke(Color.BLUEVIOLET);
        triangle.setStrokeWidth(5);

        // Creating a circle node and setting its values
        Circle circle = new Circle();
        circle.setCenterX(400);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.ORANGERED);
        circle.setStrokeWidth(5);
        circle.setStroke(Color.BLACK);

        // Adding an image onto the scene
        Image image = new Image("file:D:/Projects/Java/Tutorial/Bro Code/JavaFX Tutorial/src/icon.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(500);
        imageView.setY(100);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);

        // Attaching the nodes to the root node
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }
}
