package com.green.java.ch01;

public class VariableNumber2 {
    public static void main(String[] args){
        // 리터럴 Literal, 값 그 자체
        byte b1 = 127;

        int i1 =128;
        // 형 변환 나의 형태를 바꾸는 오버플로우 현상
        b1= (byte)i1;

        System.out.println(b1);

    }
}
