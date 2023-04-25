package com.green.java.ch05;

public class MultiArrayStudy2 {
    public static void main(String[] args) {
        int[][] mArr = new int[4][3];

        for (int i = 0; i < mArr.length; i++) {
            for (int j = 0; j < mArr[i].length; j++) {
                mArr[i][j] = i * mArr[i].length + j + 1;
            }
        }

        for (int i = 0; i < mArr.length; i++) {
            System.out.printf("{ %d", mArr[i][0]);
            for (int j = 1; j < mArr[i].length; j++) {
                System.out.printf(", %d", mArr[i][j]);
            }
            System.out.println(" }");
        }
    }
}
