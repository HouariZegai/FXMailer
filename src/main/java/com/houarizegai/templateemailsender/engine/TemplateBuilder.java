package com.houarizegai.templateemailsender.engine;

import com.houarizegai.templateemailsender.util.Tools;

public class TemplateBuilder {
    private String header, body, footer;

    public TemplateBuilder setHeader(String imagePath, String title) {
        this.header = String.format(Tools.loadTemplateFile("header"),
                imagePath == null ? "" : imagePath,
                title == null ? "" : title);

        return this;
    }

    public TemplateBuilder setBody(String content) { // generate body
        this.body = new StringBuilder()
                .append(Tools.loadTemplateFile("body-start"))
                .append(MarkdownParser.toHtml(content))
                .append(Tools.loadTemplateFile("body-end"))
                .toString();

        return this;
    }

    public TemplateBuilder setFooter(String leftContent, String rightContent) {
        this.footer = Tools.replaceString(Tools.loadTemplateFile("footer"),
                MarkdownParser.toHtml(leftContent),
                MarkdownParser.toHtml(rightContent));

        return this;
    }

    public String build() {
        return String.valueOf(new StringBuilder().append(Tools.loadTemplateFile("begin"))
                .append(header)
                .append(body)
                .append(footer)
                .append(Tools.loadTemplateFile("end")));
    }
}
