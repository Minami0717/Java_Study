package com.green.java.ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, answer;
        String result = "";
        answer = (int)(Math.random() * 100) + 1;
        System.out.println(answer);

        System.out.print("1~100사이의 정수를 입력: ");
        input = scanner.nextInt();

        while (input != answer) {
            if (input > answer) {
                result = "down";
            } else if (input < answer) {
                result = "up";
            }
            System.out.println(result);

            System.out.print("1~100사이의 정수를 입력: ");
            input = scanner.nextInt();
        }
        result = "good";
        System.out.println(result);
    }
}
