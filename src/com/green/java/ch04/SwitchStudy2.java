package com.green.java.ch04;

import java.util.Scanner;

public class SwitchStudy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("점수 입력 : ");
            int score = scanner.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("잘못된 입력");
                break;
            }
            char grade = 'D';

            switch (score / 10) {
                case 9: case 10:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
            }

            System.out.printf("%d점의 학점은 %c입니다.\n\n", score, grade);
        }
    }
}
