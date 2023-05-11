package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(list.contains(10));

        System.out.println(list);
    }
}
