package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println("shortPi = " + shortPi);

        System.out.println(Math.round(315.4));
        System.out.println(Math.round(315.5));
        System.out.println(Math.ceil(315.00000001));
        System.out.println(Math.floor(315.999999));
    }
}