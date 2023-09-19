package com.green.java.ch14;

public class MyArrayListTest6 {
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            ma.add(i);
        }

        ma.removeIf(num -> num % 2 == 0);
        System.out.println(ma);

        ma.replaceAll(num -> num * 10);
        System.out.println(ma);
    }
}
