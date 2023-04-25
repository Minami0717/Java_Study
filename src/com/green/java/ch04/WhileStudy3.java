package com.green.java.ch04;

import java.util.Scanner;

public class WhileStudy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, answer;
        String result = "";
        answer = (int)(Math.random() * 100) + 1;
        System.out.println(answer);

        while (true) {
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

            if (input == answer) { break; }
        }
    }
}
