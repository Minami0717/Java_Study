package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;
        int n = 1;

//        for (int i = star; i > 0; i--) {
//            for (int j = i-1; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            n++;
//        }

        for (int i = star; i > 0; i--) {
            for (int j = 0; j < star; j++) {
                if (j >= i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
