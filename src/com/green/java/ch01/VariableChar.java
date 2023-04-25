package com.green.java.ch01;

import java.util.Scanner;

public class VariableChar {
    public static void main(String[] args) {
        // 변수 선언과 초기화 동시 가능
        char c1 = 'A'; //문자, 문자열x 홑 따움표 사용
        System.out.println(c1);

        c1 = '한';
        System.out.println(c1);
        c1 = 'b';
        System.out.printf("%c : %d \n", c1, (int)c1);

        //문자열에 변수의 값을 주입 c는 char 타입 d 는 정수형 타입
        //아스키코드

        Scanner sc = new Scanner(System.in);


    }
}
