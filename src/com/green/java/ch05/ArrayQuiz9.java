package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz9 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int temp = numArr[0];
        numArr[0] = numArr[1];
        numArr[1] = temp;

        System.out.println(Arrays.toString(numArr));
    }
}
