package com.houarizegai.templateemailsender.controller;

import com.houarizegai.templateemailsender.App;
import com.houarizegai.templateemailsender.engine.EmailEngine;
import com.houarizegai.templateemailsender.engine.TemplateBuilder;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private JFXTextField fieldSubject, fieldSenderEmail;
    @FXML
    private JFXPasswordField fieldSenderPassword;

    @FXML
    private JFXComboBox<String> comboRecevicesFormatType;
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
    private JFXTextArea areaFooterContact;

    @FXML
    private WebView webViewTemplate;

    private File headerImg;

    private FileChooser imgChooser;

    private String htmlTemplate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // init combobox
        comboRecevicesFormatType.getItems().add("JSON");
        comboRecevicesFormatType.getSelectionModel().selectFirst();

        // init image chooser
        imgChooser = new FileChooser();
        FileChooser.ExtensionFilter imgChooserExtension = new FileChooser.ExtensionFilter("Image", "*.png", "*.jpg", "*.jpeg", "*.gif");
        imgChooser.getExtensionFilters().add(imgChooserExtension);
    }

    @FXML
    private void onLoadHeaderImage() {
        headerImg = imgChooser.showOpenDialog(App.stage);
        if(headerImg != null)
            lblHeaderImgName.setText(headerImg.getName());
    }

    @FXML
    private void onPreview() {
        htmlTemplate = new TemplateBuilder()
                .setHeader(headerImg == null ? "" : headerImg.getPath(), fieldHeaderTitle.getText())
                .setBody(areaBody.getText())
                .setFooter(fieldFooterAbout.getText(), areaFooterContact.getText())
                .build();

        webViewTemplate.getEngine().loadContent(htmlTemplate);
    }

    @FXML
    private void onSend() {
        htmlTemplate = new TemplateBuilder()
                .setHeader("cid:headerImage", fieldHeaderTitle.getText())
                .setBody(areaBody.getText())
                .setFooter(fieldFooterAbout.getText(), areaFooterContact.getText())
                .build();

        // init email engine
        EmailEngine emailEngine = new EmailEngine()
                .setAuth(fieldSenderEmail.getText().trim(), fieldSenderPassword.getText())
                .setSubject(fieldSubject.getText())
                .setContent(htmlTemplate)
                .setHeaderImage(headerImg.getPath());

        System.out.println(emailEngine.send(areaTo.getText().trim()));
    }

}
