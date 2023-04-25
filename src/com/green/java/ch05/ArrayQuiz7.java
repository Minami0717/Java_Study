package com.green.java.ch05;

public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length + 1];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        copyArr[copyArr.length - 1] = 100;

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
        }
    }
}
