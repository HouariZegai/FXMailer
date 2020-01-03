package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.enums.Color;

public class Footer {
    private String text;
    private String textColor;
    private String backgroundColor;

    public Footer() {
    }

    public Footer(String text, Color textColor, Color backgroundColor) {
        this.text = text;
        this.textColor = textColor.getCode();
        this.backgroundColor = backgroundColor.getCode();
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

    public void setTextColor(Color color) {
        this.textColor = color.getCode();
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public String toString() {
        return String.format(
                String.valueOf(new StringBuilder("<div style='background: %s'>\n")
                            .append("\t<h3 style='color: %s'>%s</h3>\n")
                        .append("</div>\n")),
                backgroundColor, textColor, text);
    }
}
