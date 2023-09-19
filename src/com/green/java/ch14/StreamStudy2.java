package com.green.java.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamStudy2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,4,3,2,1,100,200,300);
        List<Integer> newList = intList.stream()
                .distinct()
                .skip(2)
                .limit(3)
                .toList();

        System.out.println(intList);
        System.out.println(newList);

        IntStream.range(1,5).forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(System.out::println);
        List<Integer> list = Arrays.stream(IntStream.rangeClosed(1, 100).toArray())
                .boxed().toList();
        List<Integer> list1 = IntStream.rangeClosed(1, 100).boxed().toList();
        System.out.println(list1);
    }
}
