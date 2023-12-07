package com.neo.domain;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter s2: ");
        String s2 = scanner.nextLine();

        Set<Character> commonChar = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                commonChar.add(s1.charAt(i));
                commonChar.add(s2.charAt(j));
            }
        }

        int count = commonChar.size();
        System.out.println("Count ::" + count);
    }
}
