package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D', opt = '0';

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("점수를 입력하세요 > ");
            score = scanner.nextInt();
        } while (score > 100 || score < 0);

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            opt = ' ';
        }

        if (grade != 'D') {
            if(score % 10 >= 8 || score == 100) {
                opt = '+';
            } else if(score % 10 < 4) {
                opt = '-';
            }
        }
        System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);
    }
}
