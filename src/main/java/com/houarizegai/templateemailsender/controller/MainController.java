package com.houarizegai.templateemailsender.controller;

import com.houarizegai.templateemailsender.App;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private JFXTextField fieldEmailTitle, fieldSenderEmail;
    @FXML
    private JFXPasswordField fieldSenderPassword;

    @FXML
    private JFXComboBox<?> comboRecevicesFormatType;
    @FXML
    private JFXTextArea areaTo;

    @FXML
    private JFXTextField fieldHeaderTitle;
    @FXML
    private Label lblHeaderImgName;

    @FXML
    private JFXTextArea areaBody;

    @FXML
    private JFXTextField fieldFooterAbout;
    @FXML
    private JFXTextArea areaFooterContactLinks;

    @FXML
    private WebView webViewTemplate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
    @FXML
    private void onLoadHeaderImage() {

    }

    @FXML
    private void onPreview() {
        // Just for testing
        webViewTemplate.getEngine().loadContent(App.getTemplate());
    }

    @FXML
    private void onSend() {

    }

}
