package com.green.java.ch14;

import java.util.concurrent.atomic.AtomicInteger;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList mList = new MyArrayList();
        for (int i = 100; i <= 200; i++) {
            mList.add(i);
        }
        System.out.println(mList);

//        AtomicInteger sum = new AtomicInteger();
//        mList.forEach(num -> sum.addAndGet(num));

        final IntBox ib = new IntBox();
        mList.forEach(num -> ib.plus(num));
        System.out.println(ib.getSum());

        final IntBox ib2 = new IntBox();
        mList.forEach(num -> {
            if (num % 2 == 0) { ib2.plus(num); }
        });
        System.out.println(ib2.getSum());

        final IntBox ib3 = new IntBox();
        mList.forEach(num -> ib3.plus(num % 2 == 0 ? num * 2 : num));
        System.out.println(ib3.getSum());
    }
}

class IntBox {
    private int sum;
    public void plus(int num) {
        this.sum += num;
    }

    public int getSum() {
        return sum;
    }
}