package com.green.java.ch07.arraylist;

public class MyArrayListTest3 {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        myList.set(2, 50);

        System.out.println(myList.contains(50));
        System.out.println(myList.contains(100));

        System.out.println(myList);
    }
}
