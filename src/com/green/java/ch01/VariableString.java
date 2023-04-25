package com.green.java.ch01;

public class VariableString
{
    public static void main (String [] args){
        String s1 = "Hellow"; // 대문자로 시작하는 변수 주소값 복사되어 변수 s1에 저장
        String s2 = "World";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1+s2;

        System.out.println(s3);

        String s4 = s1 + " " +s2;
        System.out.print(s4);


    }
}
