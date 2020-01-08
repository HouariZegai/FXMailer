package com.houarizegai.templateemailsender.nodes;

import com.houarizegai.templateemailsender.util.Tools;

public class FullPage {
    private Header header;
    private Body body;
    private Footer footer;

    public FullPage(Header header, Body body, Footer footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(Tools.loadFile("begin"))
                .append(header)
                .append(body)
                .append(footer)
                .append(Tools.loadFile("end")));
    }
}
