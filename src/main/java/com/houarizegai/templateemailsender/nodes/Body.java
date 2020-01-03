package com.houarizegai.templateemailsender.nodes;

import java.util.LinkedList;

public class Body extends LinkedList<Node> {
    @Override
    public String toString() {
        if(this.isEmpty())
            return "";

        StringBuilder generatedCode = new StringBuilder();
        generatedCode.append("<div>\n");
        for(Node node : this) {
            generatedCode.append("\t").append(node);
        }
        generatedCode.append("</div>\n");

        return generatedCode.toString();
    }
}
