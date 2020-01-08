package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.util.Constants;
import com.houarizegai.templateemailsender.util.Tools;

import java.util.LinkedList;

public class Footer {
    private String about;
    private LinkedList<Link> links;

    public Footer() {
        links = new LinkedList<>();
    }

    public Footer(String about, Link... links) {
        this();
        this.about = about;
        addLinks(links);
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public LinkedList<Link> getLinks() {
        return links;
    }

    public boolean addLink(Link link) {
        if(this.links.size() > 3)
            return false;

        this.links.add(link);
        return true;
    }

    public boolean addLinks(Link... links) {
        if(this.links.size() > Constants.MAX_FOOTER_CONTACT_LINKS || links.length == 0)
            return false;

        for(Link link : links) {
            this.links.add(link);
            if(this.links.size() == Constants.MAX_FOOTER_CONTACT_LINKS)
                break;
        }

        return true;
    }

    @Override
    public String toString() {
        String footer = Tools.loadFile("footer");

        StringBuilder linksStr = new StringBuilder();
        if(links.isEmpty()) {
            return String.format(footer, about, "");
        } else {
            linksStr.append("Contact: ").append(links.poll());
            while(!links.isEmpty())
                linksStr.append(" | ").append(links.poll());

            return Tools.replaceString(footer, about, String.valueOf(linksStr));

        }
    }
}
