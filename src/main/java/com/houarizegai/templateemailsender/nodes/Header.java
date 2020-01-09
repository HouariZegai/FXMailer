package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.util.Tools;

public class Header {
    private String imagePath;
    private String text;

    public Header() {
    }

    public Header(String imagePath, String text) {
        this.imagePath = imagePath;
        this.text = text;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        String header = Tools.loadTemplateFile("header");
        return String.format(header, imagePath, text);
    }
}
