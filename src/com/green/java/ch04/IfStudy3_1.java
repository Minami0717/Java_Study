package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3_1 {
    public static void main(String[] args) {
        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("성별 입력 (w, m): ");
            String gender = scanner.next();

            System.out.print("키 입력 (cm): ");
            int height = scanner.nextInt();

            int stand = 0;
            if (gender.equals("w")) {
                stand = WOMAN_HEIGHT_STAND;
            } else if (gender.equals("m")) {
                stand = MAN_HEIGHT_STAND;
            }

            if (height > stand) {
                System.out.println("평균 초과\n");
            } else if (height < stand) {
                System.out.println("평균 미만\n");
            } else {
                System.out.println("평균\n");
            }
        }
    }
}
