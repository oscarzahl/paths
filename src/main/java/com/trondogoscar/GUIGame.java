package com.trondogoscar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIGame extends Application {
  private GameController gameController;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    // Create an instance of GameController and initialize it
    try {
      gameController = new GameController(/* path to your passages file */);
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }

    // Create GUI components
    Label contentLabel = new Label();
    VBox buttonContainer = new VBox(10);
    buttonContainer.setPadding(new Insets(10));

    // Create the main layout
    VBox root = new VBox(10);
    root.setPadding(new Insets(10));
    root.getChildren().addAll(contentLabel, buttonContainer);

    // Set up the scene
    Scene scene = new Scene(root, 400, 300);
    primaryStage.setScene(scene);
    primaryStage.setTitle("GUI Game");
    primaryStage.show();

    // Start the game
    gameController.play(contentLabel, buttonContainer);
  }
}
