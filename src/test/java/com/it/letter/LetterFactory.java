package com.it.letter;

import java.util.ResourceBundle;

public class LetterFactory {
    static ResourceBundle resourceLetter = ResourceBundle.getBundle("letter");

    public static Letter getValidLetter() {
        return new Letter(resourceLetter.getString("theme"),
                resourceLetter.getString("body"));
    }
}
