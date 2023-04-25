package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;

        MyMathInstance m = new MyMathInstance();

        System.out.println("sum: " + m.sum(n1, n2));
        System.out.println("static sum: " + MyMathStatic.sum(n1, n2));
    }
}
