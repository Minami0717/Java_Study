package com.green.java.ch14;

import java.util.*;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(integer -> System.out.print(integer + ", "));
        System.out.println();

        list.removeIf(integer -> integer % 2 == 0 || integer % 3 == 0);
        list.forEach(integer -> System.out.print(integer + ", "));
        System.out.println();

        list.replaceAll(integer -> integer * 10);
        list.forEach(integer -> System.out.print(integer + ", "));
        System.out.println();

        Map<String, Object> map = new HashMap<>();
        map.put("age", 27);
        map.put("name", "홍길동");
        map.put("height", 177.7);

        int age = (int)map.get("age");
        String name = (String) map.get("name");
        double height = (double) map.get("height");

        System.out.println("height = " + height);
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        map.forEach((key, value) -> System.out.printf("%s: %s\n", key, value));
    }
}
