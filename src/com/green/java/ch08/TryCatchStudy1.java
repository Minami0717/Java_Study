package com.green.java.ch08;

public class TryCatchStudy1 {
    public static void main(String[] args) {
        try {
            int r1 = 10 / 0;
            System.out.println("다음줄");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생");
        } finally {
            System.out.println("finally");
        }
        System.out.println("끝");
    }
}
