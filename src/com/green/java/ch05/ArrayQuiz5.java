package com.green.java.ch05;

public class ArrayQuiz5 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int sum = 0;

        for (int j : numArr) {
            if (j % 2 != 0) {
                sum += j;
            }
        }
        System.out.println("odd-sum: " + sum);
    }
}
