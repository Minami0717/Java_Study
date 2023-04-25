package com.green.java.ch02;

public class VariableString2 {
    public static void main (String[] args){
        String s1 = "hellow";
        String s2 = "hellow";

        System.out.println(s1 == s2);

        String s3 = new String("hellow");
        String s4 = new String ("hellow");

        System.out.println("s3:" + s3);
        System.out.println("s4" + s4);
        System.out.print("s3 == s4 " + (s3 == s4));
        System.out.print("s3.equals(s4): " + (s4.equals(s3)));

    }
}
