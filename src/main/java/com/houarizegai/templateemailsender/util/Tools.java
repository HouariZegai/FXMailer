package com.houarizegai.templateemailsender.util;

import com.houarizegai.templateemailsender.App;

import java.io.File;
import java.util.Scanner;

public class Tools {

    public static String loadTemplateFile(String filename) {
        try {
            File file = new File(String.format("%s\\%s.txt", Constants.HTML_TEMPLATE_LOCATION, filename, ".txt"));

            StringBuilder fileContents = new StringBuilder((int) file.length());

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    fileContents.append(scanner.nextLine() + System.lineSeparator());
                }
                return fileContents.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String replaceString(String input, String... replace) {
        for(int i = 0; i < replace.length; i++)
            input = input.replaceFirst("%s", replace[i]);

        return input;
    }
}
