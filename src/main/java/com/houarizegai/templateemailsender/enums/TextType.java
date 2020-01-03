package com.houarizegai.templateemailsender.enums;

public enum TextType {
    NORMAL("p"),
    H1("h1"),
    H2("h2"),
    H3("h3"),
    H4("h4"),
    H5("h5"),
    H6("h6");

    private String value;

    TextType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
