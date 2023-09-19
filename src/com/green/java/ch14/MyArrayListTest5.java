package com.green.java.ch14;

public class MyArrayListTest5 {
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();
        for (int i = 100; i <= 120; i++) {
            ma.add(i);
        }
        System.out.println(ma);

        MyArrayList ma2 = ma.map(num -> num <= 110 ? num + 1 : num * 2);
        System.out.println(ma2);
    }
}
