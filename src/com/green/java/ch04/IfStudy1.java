package com.green.java.ch04;

public class IfStudy1 {
    public static void main(String[] args) {
        int num = 9;
        if (num == 10) {
            System.out.println("num = 10");
        } else {
            System.out.println("num != 10");
        }

        int num2 = 10;
        if (num2 >= 20) {
            System.out.println("num2 >= 20");
        } else if (num2 >= 10) {
            System.out.println("num2 >= 10");
        } else if (num2 >= 5) {
            System.out.println("num2 >= 5");
        } else {
            System.out.println("num2 < 5");
        }
    }
}
