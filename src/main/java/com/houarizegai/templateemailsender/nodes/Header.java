package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.enums.Color;
import javafx.scene.image.Image;

public class Header {
    private Image image;
    private String text;
    private String textColor;
    private String backgroundColor;

    public Header() {
    }

    public Header(Image image, String text, Color textColor, Color backgroundColor) {
        this.image = image;
        this.text = text;
        this.textColor = textColor.getCode();
        this.backgroundColor = backgroundColor.getCode();
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor.getCode();
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor.getCode();
    }

    @Override
    public String toString() {
        return String.format(
                String.valueOf(new StringBuilder("<div style='background: %s'>\n")
                            .append("\t<img src='%s' /><br />\n")
                            .append("\t<h3 style='color: %s'>%s</h3>\n")
                        .append("</div>\n")),
                backgroundColor, image, textColor, text);
    }
}
