package com.houarizegai.templateemailsender.enums;

public enum TargetLinkType {
    BLANK("_blank"),
    SELF("_self"),
    PARENT("_parent"),
    TOP("_top");

    private String value;

    TargetLinkType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
