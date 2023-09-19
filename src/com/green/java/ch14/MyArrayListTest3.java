package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyArrayListTest3 {
    public static void main(String[] args) {
//        List<Integer> intList = new ArrayList<>();
//        for (int i = 100; i <= 200; i++) {
//            intList.add(i);
//        }
//
//        Stream<Integer> filterStream = intList.stream().filter(integer -> integer % 2 == 0);
//        List<Integer> filterList = filterStream.toList();
//        System.out.println(filterList);
//
        MyArrayList mList = new MyArrayList();
        for (int i = 100; i <= 200; i++) {
            mList.add(i);
        }
//
//        MyArrayList newList = mList.filter(num -> num % 2 == 0);
//        System.out.println(newList);

        MyArrayList filterList2 = mList.filter(num -> num < 151 || num % 2 != 0);
        System.out.println(filterList2);

        MyArrayList filterList3 = mList.filter(num -> num < 151)
                                       .filter(num -> num % 2 == 1);
        System.out.println(filterList3);
    }
}
