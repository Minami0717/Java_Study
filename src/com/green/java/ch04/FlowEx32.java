package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료: 0) > ");

            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (n > 3 || n < 0) {
                System.out.println("메뉴를 잘못 선택하셨습니다.\n");
            } else {
                System.out.printf("선택하신 메뉴는 %d번입니다.\n\n", n);
            }
        }
    }
}
