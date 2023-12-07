package com.neo.domain;

public class PalindromClass {

    public static void main(String[] args) {
        String s1 = "Nitin";
        char s3[] = null;
        char[] s1Char = s1.toCharArray();
        for(int i=s1.length()-1;i>=0;i--) {
            s3=new char[s1Char[i]];

        }
        System.out.println("s3:: "+s3);
        System.out.println("s1Char:: "+s1Char);
        if(s3==s1Char){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
