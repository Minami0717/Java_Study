package com.green.java.ch05;

public class ArrayQuiz11 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        double avg = (double)sum / numArr.length;
        System.out.printf("avg: %.2f", avg);
    }
}
