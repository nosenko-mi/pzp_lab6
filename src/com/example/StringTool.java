package com.example;

public class StringTool {
    private StringTool(){};

    public static String replaceSecondWordWith$(String input){
        String[] inputSplit = input.split(" ");
        inputSplit[1] = "$";

        StringBuilder inputBuffer = new StringBuilder();
        for (String s : inputSplit) {
            inputBuffer.append(s).append(" ");
        }

        return inputBuffer.toString();
    }

    public static String getLongestPalindrome(String input){
        String longestPalindrome = "";

//        delete all special symbols, punctuation marks
        String clearedStr = input.replaceAll("[!\"#$%&'()*+,./:;<=>?@^_`{|}~]*",  "");
        clearedStr = clearedStr.replaceAll("\\s{2,}",  " ");
        String[] inputSplit = clearedStr.split(" ");

        StringBuilder reversedWord = new StringBuilder();
        int maxLength = 0;
        for (String s : inputSplit) {
            reversedWord.append(s);
            reversedWord.reverse();
            if (s.equalsIgnoreCase(reversedWord.toString()) && s.length() > maxLength){
                maxLength = s.length();
                longestPalindrome = s;
            }
            reversedWord.setLength(0);
        }
        if (longestPalindrome.length() == 0){
            return "There is no palindrome";
        }

        return longestPalindrome;
    }
}
