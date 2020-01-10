package com.houarizegai.templateemailsender;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    public static Stage stage;
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
            stage.setScene(new Scene(root));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        this.stage = stage;
        stage.setTitle("Template Emails Sender");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
