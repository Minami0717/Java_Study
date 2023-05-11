package com.green.java.ch07.arraylist;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(22);
        myList.add(4);
        myList.add(200);
        myList.add(53);
        myList.add(96);
        //10 22 4 200 53 96
        //10 4 22 200 53 96
        //10 4 22 53 200 96
        //10 4 22 53 96 200


        myList.bubbleSort();
        System.out.println(myList);
    }
}
