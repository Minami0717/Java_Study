package com.green.java.ch04;

public class ForStudy2 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.print(i);
            if (i != 5) System.out.print(", ");
        }
        System.out.println();
        for (int i = 1; i < 6; i++) {
            if (i > 1) System.out.print(", ");
            System.out.print(i);
        }
    }
}
