package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger l'interface FXML
        VBox root = FXMLLoader.load(getClass().getResource("/layouts/App.fxml"));

        // Créer la scène et afficher la fenêtre
        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/styles/main.css").toExternalForm());
        primaryStage.setTitle("Interface FXML");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
} 