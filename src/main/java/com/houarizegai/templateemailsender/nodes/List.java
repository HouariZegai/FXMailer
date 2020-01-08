package com.houarizegai.templateemailsender.nodes;

import java.util.LinkedList;

public class List extends LinkedList<Node> implements Node {

    private boolean isOrdered;

    public List(boolean isOrdered, String... nodes) {
        this.isOrdered = isOrdered;
        addAll(nodes);
    }

    public List(boolean isOrdered, Node... nodes) {
        this.isOrdered = isOrdered;
        addAll(nodes);
    }

    public List(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public boolean add(String node) {
        return super.add(new Text(node));
    }

    public boolean addAll(Node... nodes) {
        if(nodes.length < 1)
            return false;

        for(Node node : nodes)
            this.add(node);

        return true;
    }

    public boolean addAll(String... nodes) {
        if(nodes.length < 1)
            return false;

        for(String node : nodes)
            this.add(new Text(node));

        return true;
    }

    @Override
    public String toString() {
        StringBuilder generatedCode = new StringBuilder();
        for(Node node : this)
            generatedCode.append(String.format("<li>%s</li>\n", node));

        String type = isOrdered ? "ol" : "ul";

        return String.format("\n<%s>\n%s</%s>\n", type, String.valueOf(generatedCode), type);
    }
}
