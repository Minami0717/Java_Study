package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = "서영기";
        System.out.print("나이 입력: ");
        int age = scan.nextInt();



        System.out.printf("나의 이름은 %s이고, 나이는 %5d 입니다.",name,age);
        Integer val = 12;
        System.out.println("val1 = "+val);
        System.out.println("val2 = " + val.toString() );

    }
}
