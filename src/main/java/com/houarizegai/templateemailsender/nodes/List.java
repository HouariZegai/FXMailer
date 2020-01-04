package com.houarizegai.templateemailsender.nodes;

import java.util.LinkedList;

public class List extends LinkedList<Node> implements Node {

    private boolean isOrdered;

    public List(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    @Override
    public String toString() {
        StringBuilder generatedCode = new StringBuilder();
        for(Node node : this)
            generatedCode.append(String.format("<li>\n%s</li>\n", node));

        String type = isOrdered ? "ol" : "ul";

        return String.format("<%s>\n%s</%s>\n", type, String.valueOf(generatedCode), type);
    }
}
