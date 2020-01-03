package com.houarizegai.templateemailsender;

import com.houarizegai.templateemailsender.enums.Color;
import com.houarizegai.templateemailsender.enums.TextType;
import com.houarizegai.templateemailsender.nodes.*;

public class App {
    public static void main(String[] args) {
        Header header = new Header(null, "JavaFX Course", Color.WHITE, Color.BLUE);
        Footer footer = new Footer("JavaFX Instructor", Color.WHITE, Color.RED);
        Body body = new Body();
        body.add(new Text("Hello Houari", Color.BLACK, TextType.H1));

        FullPage fullPage = new FullPage(header, body, footer);
        System.out.println(fullPage);
    }
}
