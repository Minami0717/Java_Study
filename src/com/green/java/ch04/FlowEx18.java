package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 1; j <= 9; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.printf("%d X %d = %d\t", k+2, j, (k+2) * j);
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
    }
}
