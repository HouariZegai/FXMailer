package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.enums.Color;
import com.houarizegai.templateemailsender.enums.TextType;

public class Text implements Node {
    private String content;
    private String color;
    private String textType;

    public Text(String content, Color color, TextType textType) {
        this.content = content;
        this.color = color.getCode();
        this.textType = textType.getValue();
    }

    public Text(String content) {
        this.content = content;
        this.color = Color.BLACK.getCode();
        this.textType = TextType.NORMAL.getValue();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextType() {
        return textType;
    }

    public void setTextType(TextType textType) {
        this.textType = textType.getValue();
    }

    @Override
    public String toString() {
        String txtTypeOpenTag = "",
                txtTypeCloseTag = "";

        if(!TextType.NORMAL.getValue().equalsIgnoreCase(textType)) {
            txtTypeOpenTag = String.format("<%s %s>", textType, color == null ? "style='color: %s'" : "");
            txtTypeCloseTag = String.format("</%s>", textType);
        }

        return txtTypeOpenTag + content + txtTypeCloseTag;
    }
}
