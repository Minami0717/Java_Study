package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0)");

        while (true) {
            System.out.print(">> ");
            num = scanner.nextInt();
            if (num == 0) { break; }
            sum += num;
        }
        System.out.println("합계: " + sum);

//        for(;;) {
//            if (!flag) break;
//            num = scanner.nextInt();
//            if (num == 0) { flag = false; }
//            sum += num;
//        }
//        System.out.println("합계: " + sum);
    }
}
