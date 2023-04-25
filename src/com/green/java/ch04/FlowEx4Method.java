package com.green.java.ch04;

import java.util.Scanner;
class ScoreObj {
    char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        }
        return 'D';
    }
}

public class FlowEx4Method {
    public static void main(String[] args) {
        int score = 0;
        char grade;

        System.out.print("점수를 입력하세요 > ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        ScoreObj so = new ScoreObj();
        grade = so.getGrade(score);

        System.out.printf("%d점의 학점은 %c입니다.", score, grade);
    }
}