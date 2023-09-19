package com.green.java.ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s, 16);
        Function<Integer, String> g = i -> Integer.toBinaryString(i);

        System.out.println(f.apply("F"));
        System.out.println(g.apply(15));

        Function<String, String> h = f.andThen(g);
        System.out.println(h.apply("10"));

        Function<String, String> f2 = x -> x;
        System.out.println(f2.apply("aaa"));

        System.out.println("---------------------------");

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        System.out.println(notP.test(99));

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(100));

        String str1 = new String("abc");
        String str2 = new String("abc");

        Predicate<String> p2 = Predicate.isEqual(str1);
        System.out.println("p2.test(str2) = " + p2.test(str2));

    }
}
