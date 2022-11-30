package com.kodilla.parmetrized_tests;

public class StringManipulator {
    public String reverseWithLowerCase(String text){
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String text){
        String stringWithoutSpaces = text.replace(" ", "");
        return stringWithoutSpaces.length();
    }

    public int countNumberOfCommas(String text){
        return text.length() - text.replace(",", "").length();
    }
}
