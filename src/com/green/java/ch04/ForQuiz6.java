package com.green.java.ch04;

public class ForQuiz6 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d X %d = %2d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
