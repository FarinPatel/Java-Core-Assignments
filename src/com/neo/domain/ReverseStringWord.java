package com.neo.domain;

public class ReverseStringWord {
    public static void main(String[] args) {
        String s="i.am.farhin.patel";
        char[] reverseString = new char[s.length()];
        int end = s.length();
        System.out.println("End ::"+end);
        int index=0;

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println("s.charAt(i) ::"+s.charAt(i));
            if (s.charAt(i) == '.') {
                int wordStart = i + 1;
                System.out.println("wordStart ::"+wordStart);
                for (int j = wordStart; j < end; j++) {
                    System.out.println("s.charAt(j) ::"+s.charAt(j));
                    reverseString[index++] = s.charAt(j);
                }
                reverseString[index++] = '.';
                end = i;
            }
        }

        for (int j = 0; j < end; j++) {
            reverseString[index++] = s.charAt(j);
        }
        System.out.println(reverseString);

    }
}