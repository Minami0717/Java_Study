package com.green.java.ch06;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod myMethod = new MyMethod();
        myMethod.sum(1,2);

        int result = myMethod.sum2(10,45);
        System.out.println(result);
    }
}
