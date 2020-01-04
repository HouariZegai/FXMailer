package com.houarizegai.templateemailsender;

import com.houarizegai.templateemailsender.enums.Color;
import com.houarizegai.templateemailsender.enums.TargetLinkType;
import com.houarizegai.templateemailsender.enums.TextType;
import com.houarizegai.templateemailsender.nodes.*;

public class App {
    public static void main(String[] args) {
        Header header = new Header(null, "JavaFX Course", Color.WHITE, Color.BLUE);
        Footer footer = new Footer("JavaFX Instructor", Color.WHITE, Color.RED);
        Body body = new Body();

        Text h3 = new Text("Hello Houari", Color.BLACK, TextType.H1);

        List ol = new List(true);
        ol.add(new Text("HTML"));
        ol.add(new Text("CSS"));
        ol.add(new Text("JS"));

        List ul = new List(false);
        ul.add(new Text("HTML"));
        ul.add(new Text("CSS"));
        ul.add(new Text("JS"));

        body.add(h3);
        body.add(ol);
        body.add(ul);
        body.add(new Text("Visit my GitHub at: " + new Link("GitHub Profile", "https://github.com/houarizegai", TargetLinkType.BLANK)));

        FullPage fullPage = new FullPage(header, body, footer);
        System.out.println(fullPage);
    }
}
