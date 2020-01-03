package com.houarizegai.templateemailsender.enums;

public enum Color {
    WHITE("#ffffff"),
    GRAY("#808080"),
    BLACK("#000000"),
    RED("#ff0000"),
    GREEN("#00ff00"),
    BLUE("#2196F3"),
    YELLOW("#ffff00"),
    BROWN("#964B00");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
