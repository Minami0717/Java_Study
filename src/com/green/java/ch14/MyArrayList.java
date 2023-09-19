package com.green.java.ch14;

import java.util.Arrays;
import java.util.function.Consumer;

@FunctionalInterface
interface MyFunction2 {
    int apply(int num);
}
@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    void add(int n) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = n;
        arr = newArr;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            s.append(", ");
            s.append(arr[i]);
        }
        s.append("]");
        return s.toString();
    }

    public void forEach(MyConsumer consumer) {
        for (int i : arr) {
            consumer.accept(i);
        }
    }

    public MyArrayList filter(MyPredicate predicate) {
        MyArrayList list = new MyArrayList();
        for (int i : arr) {
            if (predicate.test(i)) { list.add(i); }
        }
        return list;
    }

    public MyArrayList map(MyFunction2 function2) {
        MyArrayList list = new MyArrayList();
        for (int i : arr) {
            list.add(function2.apply(i));
        }
        return list;
    }

    public void removeIf(MyPredicate predicate) {
        int[] temp = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < temp.length; i++) {
            if (!predicate.test(arr[i])) {
                temp[idx++] = arr[i];
            }
        }

        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        arr = temp2;
    }

    public void replaceAll(MyFunction2 function2) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = function2.apply(arr[i]);
        }
    }

    static MyArrayList asList(int... nums) {
        MyArrayList ml = new MyArrayList();
        for (int n : nums) {
            ml.add(n);
        }
        return ml;
    }
}
