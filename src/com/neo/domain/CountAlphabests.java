package com.neo.domain;

public class CountAlphabests {
    static String s1 = "aabbcc";

    public static void main(String[] args) {
        int[] charCount = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            System.out.println("s1.charAt(i) :"+s1.charAt(i));
            charCount[s1.charAt(i)]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println("Occurrence of " + (char) i + ": " + charCount[i]);
            }
        }
    }
}

