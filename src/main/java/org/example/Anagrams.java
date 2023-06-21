package org.example;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two strings as arguments.");
            return;
        }

        String text1 = args[0];
        String text2 = args[1];

        if (areAnagrams(text1, text2)) {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are NOT anagrams.");
        }
    }

    public static boolean areAnagrams(String text1, String text2) {
        String cleanText1 = text1.replace(" ", "").toLowerCase();
        String cleanText2 = text2.replace(" ", "").toLowerCase();

        if(cleanText1.length() != cleanText2.length()) return false;

        char[] charArray1 = cleanText1.toCharArray();
        char[] charArray2 = cleanText2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
