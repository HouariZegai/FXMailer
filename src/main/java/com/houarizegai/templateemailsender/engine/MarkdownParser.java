package com.houarizegai.templateemailsender.engine;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;

public class MarkdownParser {
    private static Parser parser;
    private static HtmlRenderer renderer;

    static {
        parser = Parser.builder().build();
        renderer = HtmlRenderer.builder().build();
    }

    public static String toHtml(String content) { // convert: Markdown > HTML
        if(content == null)
            return "";

        return renderer.render(parser.parse(content));
    }
}
