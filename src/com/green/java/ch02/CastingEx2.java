package com.green.java.ch02;

public class CastingEx2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
        //10을 3으로 나눠서 소수점이 나타나도록 해주세요.
        //3.0이 나오지 않도록 해주세요.

        double m1 = n1;
        double m2 = n2;
        double b = m1/m2;
        System.out.println(b);

        double a =(double) n1/ (double) n2;
        System.out.println(a);


    }
}
