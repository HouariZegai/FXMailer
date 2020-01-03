package com.houarizegai.templateemailsender.nodes;

import java.util.LinkedList;

public class Body extends LinkedList<Node> {
    @Override
    public String toString() {
        if(this.isEmpty())
            return "";

        StringBuilder generatedCode = new StringBuilder();
        for(Node node : this) {
            generatedCode.append(node);
        }

        return generatedCode.toString();
    }
}
