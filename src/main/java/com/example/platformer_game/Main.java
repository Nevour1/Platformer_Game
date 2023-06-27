package com.example.platformer_game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Declare new stage:
        // Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK );
        Text text = new Text("Some Text");

        text.setFont(Font.font("Arial"));

        stage.setFullScreen(true);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setFullScreenExitHint("Press q to exit full screen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setTitle("Platfromer Game Demo");
        stage.setScene(scene);
        stage.show();
    }
}