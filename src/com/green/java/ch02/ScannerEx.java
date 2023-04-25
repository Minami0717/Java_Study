package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력하세요\n");
        String input = scan.next();
        int num = Integer.parseInt(input);
        System.out.println("입력내용: " + input);
        System.out.printf("num = %d\n", num);

    }
}
