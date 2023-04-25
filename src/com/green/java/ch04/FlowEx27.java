package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0)");

        while (flag) {
            System.out.print(">> ");
            num = scanner.nextInt();
            if (num == 0) { flag = false; }
            else { sum += num; }
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
