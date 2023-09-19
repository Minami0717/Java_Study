package com.green.java.ch14;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class RefMethod1 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s);
        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println("f = " + (f.apply("10") + 10));
        System.out.println("f2 = " + (f2.apply("10") + 20));

        BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println("f3.apply(s1, s2) = " + f3.apply(s1, s2));

        BiFunction<String, String, Boolean> f4 = String::equals;
        System.out.println("f4.apply(s1, s2) = " + f4.apply(s1, s2));

        BiPredicate<String, String> p1 = String::equals;
        System.out.println("p1 = " + p1.test(s1, s2));

        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s3 = MyClass::new;

        MyClass mc = s.get();
        mc.setNum(10);
        System.out.println(mc.getNum());

    }
}

class MyClass {
    private int num;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}