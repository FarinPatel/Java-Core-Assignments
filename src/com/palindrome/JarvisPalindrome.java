package com.palindrome;

import java.util.Scanner;

public class JarvisPalindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ::");
        String str = sc.nextLine();
        String str1 = str.replaceAll("\\s", "").replaceAll("[^a-zA-Z]", "");
        System.out.println("Updated string :"+str1);
        char charString[] = str1.toCharArray();
        String reverseString ="";
        for(int i=charString.length-1; i>=0;i--){
            reverseString += charString[i];
        }
        System.out.println("Reverse String ::"+reverseString);

        if(str1.equalsIgnoreCase(reverseString))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
