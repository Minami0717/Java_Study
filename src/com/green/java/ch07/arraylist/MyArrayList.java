package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];
    }

    public void add(int num) {
        int[] temp = new int[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        temp[items.length] = num;
        items = temp;
    }
    public void add(int idx, int num) {
        if (idx > items.length) { return; }
        int[] temp = new int[items.length + 1];
        temp[idx] = num;

        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i+1] = items[i];
            }
        }
        items = temp;
    }
    public void set(int idx, int num) {
        items[idx] = num;
    }
    public boolean contains(int num) {
        for (int n : items) {
            if (n == num) { return true; }
        }
        return false;
    }
    @Override
    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        return str;
    }
    public int size() {
        return items.length;
    }
    public int get(int idx) {
        return items[idx];
    }
    public void bubbleSort() {
//        for (int i = items.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (items[i] < items[j]) {
//                    int temp = items[i];
//                    items[i] = items[j];
//                    items[j] = temp;
//                }
//            }
//        }
        for (int i = items.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int sideIdx = j + 1;
                if (items[j] > items[sideIdx]) {
                    int temp = items[j];
                    items[j] = items[sideIdx];
                    items[sideIdx] = temp;
                }
            }
        }
    }
}
