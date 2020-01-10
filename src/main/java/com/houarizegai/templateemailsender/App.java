package com.houarizegai.templateemailsender;

import com.houarizegai.templateemailsender.enums.Tags;
import com.houarizegai.templateemailsender.nodes.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
            stage.setScene(new Scene(root));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        stage.setTitle("Template Mails Sender");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static String getTemplate() {
        Header header = new Header("null", "JavaFX Course");
        Footer footer = new Footer("Houari ZEGAI, JavaFX Instructor",
                new Link("GitHub", "https://github.com/houarizegai"),
                new Link("Twitter", "https://twitter.com/houarizegai"));

        Body body = new Body();

        List ol = new List(true,"HTML", "CSS", "JS");

        List ul = new List(false);
        ul.addAll("Java", "Python");
        ul.add("JavaScript");

        body.addAll(ol, ul, Tags.BR,
                new Text("Visit my GitHub at: "),
                new Link("GitHub Profile", "https://github.com/houarizegai"),
                Tags.BR, Tags.HR, new Text("Testing"));

        FullPage fullPage = new FullPage(header, body, footer);
        return String.valueOf(fullPage);
    }
}
