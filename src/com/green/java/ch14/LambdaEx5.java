package com.green.java.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 2;

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

        Consumer<Integer> c = System.out::println;
        c.accept(100);

        int val = 9;
        Predicate<Integer> p1 = i -> i > 10;
        System.out.printf("%d > 10 : %b\n", val, p1.test(val));

        Function<Double, Integer> fn1 = Double::intValue;
        System.out.println(fn1.apply(10.5));
    }
}
