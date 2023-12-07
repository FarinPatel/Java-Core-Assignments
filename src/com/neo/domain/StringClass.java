package com.neo.domain;

public class StringClass {
    public static void main(String[] args){
        String s1 = "Farhin";
        String s2 = "Farhin";
        String s3 = new String("Farhin");

        System.out.println("S1 hascode ::"+s1.hashCode());
        System.out.println("S2 hascode ::"+s2.hashCode());
        System.out.println("S3 hascode ::"+s3.hashCode());

        if(s1.equals(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
