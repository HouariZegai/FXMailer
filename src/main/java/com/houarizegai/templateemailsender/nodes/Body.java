package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.util.Tools;
import java.util.LinkedList;

public class Body extends LinkedList<Node> {

    public boolean addAll(Node... nodes) {
        if(nodes.length < 1)
            return false;

        for(Node node : nodes)
            this.add(node);

        return true;
    }

    @Override
    public String toString() {
        StringBuilder generatedCode = new StringBuilder();
        generatedCode.append(Tools.loadFile("body-start"));

        if(!this.isEmpty()) {
            for(Node node : this) {
                generatedCode.append(node);
            }
        }

        generatedCode.append(Tools.loadFile("body-end"));

        return generatedCode.toString();

    }
}
