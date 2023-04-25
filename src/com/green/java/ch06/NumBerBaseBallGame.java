package com.green.java.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class NumBerBaseBallGame {
    public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumberArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("[Game Start]");

//        for (int i = 0; i < NUMBER_COUNT; i++) {
//            boolean isOut = true;
//            for (int j = 0; j < NUMBER_COUNT; j++) {
//                if (numArr[i] == myArr[j] && i == j) {
//                    strike++;
//                    isOut = false;
//                    break;
//                } else if (numArr[i] == myArr[j]) {
//                    ball++;
//                    isOut = false;
//                    break;
//                }
//            }
//            if (isOut) {
//                out++;
//            }
//        }
        int cnt = 0;
        int[] myArr = new int[NUMBER_COUNT];

        while (true) {
            cnt++;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.print((i + 1) +"번 숫자 입력: ");
                myArr[i] = scanner.nextInt();
            }

            int strike = 0, ball = 0, out = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int j = 0; j < NUMBER_COUNT; j++) {
                    if (numArr[i] == myArr[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            out = NUMBER_COUNT - (strike + ball);
            System.out.printf("S: %d, B: %d, O: %d\n", strike, ball, out);

            if (strike == NUMBER_COUNT) {
                break;
            }
        }
        System.out.println("[Game Over] count: " + cnt);
    }

    static int[] getRandomNumberArr(int numberCount) {
        int[] arr = new int[numberCount];
        int selectedIdx = 0;
        Loop:
        while (selectedIdx < arr.length) {
            int rVal = getRandomNumber2(1, 9);

            for (int i = 0; i < selectedIdx; i++) {
                if (arr[i] == rVal) {
                    continue Loop;
                }
            }
            arr[selectedIdx++] = rVal;
        }

        return arr;
    }
    static int getRandomNumber2(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
