package com.houarizegai.templateemailsender;

import com.houarizegai.templateemailsender.enums.Tags;
import com.houarizegai.templateemailsender.nodes.*;

public class App {
    public static void main(String[] args) {
        Header header = new Header("null", "JavaFX Course");
        Footer footer = new Footer("Houari ZEGAI, JavaFX Instructor",
                new Link("GitHub", "https://github.com/houarizegai"),
                new Link("Twitter", "https://twitter.com/houarizegai"));

        Body body = new Body();

        List ol = new List(true,"HTML", "CSS", "JS");

        List ul = new List(false);
        ul.addAll("Java", "Python");
        ul.add("JavaScript");

        body.addAll(ol, ul, Tags.BR,
                new Text("Visit my GitHub at: "),
                new Link("GitHub Profile", "https://github.com/houarizegai"),
                Tags.BR, Tags.HR, new Text("Testing"));

        FullPage fullPage = new FullPage(header, body, footer);
        System.out.println(fullPage);
    }
}
