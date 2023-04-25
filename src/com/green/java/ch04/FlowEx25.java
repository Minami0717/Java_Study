package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) > ");
        String temp = scanner.nextLine();

        for (int i = 0; i < temp.length(); i++) {
            sum += Integer.parseInt(temp.substring(i,i+1));
        }
        System.out.println("각 자리수의 합 : " + sum);

        sum = 0;
        int num = Integer.parseInt(temp);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum = " + sum);
    }
}
