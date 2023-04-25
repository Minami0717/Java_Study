package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, answer;
        String result = "";

        answer = getRandomNumber(1, 100);
        System.out.println(answer);

        do {
            System.out.print("1~100사이의 정수를 입력: ");
            input = scanner.nextInt();

            if (input > answer) {
                result = "down";
            } else if (input < answer) {
                result = "up";
            } else {
                result = "good";
            }
            System.out.println(result);
        } while (input != answer);
    }
    static int getRandomNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
