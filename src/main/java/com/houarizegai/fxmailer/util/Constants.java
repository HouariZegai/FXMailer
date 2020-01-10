package com.houarizegai.fxmailer.util;

import java.nio.file.Paths;

public class Constants {
    public static final String HTML_TEMPLATE_LOCATION;

    static { // get relative template folder path
        HTML_TEMPLATE_LOCATION = new StringBuilder().append(Paths.get("").toAbsolutePath())
                .append("\\src\\main\\resources\\template\\").toString();
    }
}
