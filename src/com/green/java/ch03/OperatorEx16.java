package com.green.java.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println("pi = " + pi);
        System.out.println("shortPi = " + shortPi);
    }
}