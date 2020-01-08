package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.enums.TargetLinkType;

public class Link implements Node {
    private String text;
    private String url;
    private String target;

    public Link(String text, String url) {
        this.text = text;
        this.url = url;
        this.target = TargetLinkType.SELF.getValue();
    }

    public Link(String text, String url, TargetLinkType target) {
        this.text = text;
        this.url = url;
        this.target = target.getValue();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(TargetLinkType target) {
        this.target = target.getValue();
    }

    @Override
    public String toString() {
        if(target == null)
            return String.format("<a href='%s'>%s</a>", url, text);

        return String.format("<a href='%s' target='%s'>%s</a>", url, target, text);
    }
}
