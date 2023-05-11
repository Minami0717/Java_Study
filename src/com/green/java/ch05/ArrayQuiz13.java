package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValueArrFor1(lottoArr);
        System.out.println(Arrays.toString(lottoArr));

        long start = System.currentTimeMillis();
        sortArr2(lottoArr);
        long end = System.currentTimeMillis();

        System.out.println(Arrays.toString(lottoArr));
        System.out.println(end - start);
    }
    static int getRandomValueFromTo(int start, int end) {
        return (int)(Math.random() * (end - start + 1)) + start;
    }
    static void sortArr1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void sortArr2(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void sortArr3(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void setRandomValueArrFor1(int[] arr) {
        Loop:
        for (int i = 0; i < arr.length;) {
            int rVal = getRandomValueFromTo(1, 45);
            for (int j = 0; j < i; j++) {
                if (arr[j] == rVal) { continue Loop; }
            }
            arr[i++] = rVal;
        }
    }
    static void setRandomValueArrFor2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rVal = getRandomValueFromTo(1, 45);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0) {
                    arr[j] = rVal;
                    break;
                } else if (arr[j] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }
    static void setRandomValueArrWhile(int[] arr) {
        int selectedIdx = 0;
        Loop:
        while (selectedIdx < arr.length) {
            int rVal = getRandomValueFromTo(1, 45);

            for (int i = 0; i < selectedIdx; i++) {
                if (arr[i] == rVal) {
                    continue Loop;
                }
            }
            arr[selectedIdx++] = rVal;
        }
    }
}
