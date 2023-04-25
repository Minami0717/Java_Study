package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) > ");
        String temp = scanner.nextLine();
        int sum = sumStringNumber(temp);
        System.out.printf("각 자리수의 합 : %d\n", sum);
    }
    static int sumStringNumber(String str) {
        int sum = 0;
        int num = Integer.parseInt(str);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
