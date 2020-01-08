package com.houarizegai.templateemailsender.enums;

import com.houarizegai.templateemailsender.nodes.Node;

public enum Tags implements Node {
    BR("<br />\n"), HR("<hr />\n");

    private String value;

    Tags(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
