package com.green.java.ch02;

import java.util.Scanner;

public class Naming {
    public static void main(String[] args) {

        // 단어 + 단어 + 단어
        //Hello World Bye
        //기법
        //파스칼 케이스 기법 > 클래스명
        String HellowWorldBye;

        //카멜 케이스 기법 > 변수명, 메소드명
        String hellowWorldBye;

        //스네이크 케이스 기법
        String hello_world_bye;

        // 케밥 케이스 기법
        //String hellow-world-bye;

        //자바 이름에 쓸 수 있는 특수기호 2개: _, $
        String _hi;
        String h$1;

        //이름 처음에 숫자 사용할 수 없다. but 처음만 아니면 된다.
        // String 1a;
        String a1a;

        //이름에 빈칸 사용할 수 없다.
        //String hello World;

        // 상수는 전부 대문자, 스네이크 케이스 기법(언더바로 )
        final int NUM = 13;
       // NUM =20;

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("강아지와 병아리수의 합");
            int dc = scan.nextInt();
            System.out.println("강아지와 병아리 다리의 합");
            int dc2 = scan.nextInt();


            if (dc >1000|| dc2 >4000){
                System.out.println("INPUT ERROR!");

            }
          

            }
    }
}

