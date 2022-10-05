package com.example;

public class Main {

    public static void main(String[] args) {
        String lorem = FileController.loadData("input.txt");

        System.out.println("Base: " + lorem);
        System.out.println("Replaced 2nd word: " + StringTool.replaceSecondWordWith$(lorem));
        System.out.println("Longest palindrome: " + StringTool.getLongestPalindrome(lorem));

        FileController.saveData("out_1.txt", StringTool.replaceSecondWordWith$(lorem));
        FileController.saveData("out_2.txt", StringTool.getLongestPalindrome(lorem));
    }
}
