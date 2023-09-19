package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i <= 120; i++) {
            list.add(i);
        }

        List<Integer> rList = list.stream().map(item -> item + 4).toList();
//        System.out.println(rList);
//        System.out.println(list);

        MyArrayList mList = new MyArrayList();
        for (int i = 100; i <= 120; i++) {
            mList.add(i);
        }

        MyArrayList rMList = mList.map(num -> num + 4);
        System.out.println(rMList);
    }
}
