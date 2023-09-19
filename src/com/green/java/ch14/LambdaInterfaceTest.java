package com.green.java.ch14;

public class LambdaInterfaceTest {
    public static void main(String[] args) {
        LambdaInterface li1 = heal -> System.out.println("heal: " + heal);
        li1.healing(50);
    }
}
