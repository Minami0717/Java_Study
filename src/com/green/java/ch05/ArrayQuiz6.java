package com.green.java.ch05;

public class ArrayQuiz6 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        numArr[0] = 33;

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
        }
    }
}
