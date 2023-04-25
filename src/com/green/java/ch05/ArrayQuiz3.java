package com.green.java.ch05;

public class ArrayQuiz3 {
    public static void main(String[] args) {
        int[] numArr = {11,14,2,7,36,35};

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                System.out.println(numArr[i]);
            }
        }
    }
}
