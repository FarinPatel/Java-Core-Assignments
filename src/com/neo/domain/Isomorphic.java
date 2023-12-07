package com.neo.domain;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {
    public static int count(String str1,String str2){
        if (str1.length() != str2.length()) {
            return 0;
        }

        HashMap< Character, Character> map1 = new HashMap< Character, Character>();
        HashMap< Character, Character> map2 = new HashMap< Character, Character>();
        for (int i = 0 ; i < str1.length() ; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) {
                    return 0;
                }
            } else {
                if (map2.containsKey(ch2)) {
                    return 0;
                } else {
                    map1.put(ch1, ch2);
                    map2.put(ch2, ch1);
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the first string : ");
            String X = scanner.nextLine();

            System.out.print("Enter the second string : ");
            String Y = scanner.nextLine();

            int result = count(X, Y);

            System.out.println("Result ::" + result);

            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                break;
            }

        } while (true);

        scanner.close();
    }
}
