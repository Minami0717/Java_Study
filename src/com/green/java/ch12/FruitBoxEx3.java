package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        Box4<Fruit3> fruit3Box = new Box4<>();
        fruit3Box.add(new Fruit3());
        fruit3Box.add(new Apple3());
        fruit3Box.add(new Grape3());
        Juicer.makeJuice(fruit3Box);

        Box4<Toy3> toyBox = new Box4<>();
        //Juicer.makeJuice(toyBox);
    }
}

class Juicer {
    public static Juice makeJuice(Box4<? extends Fruit3> box) {
        return null;
    }
}

class Juice {
    private String name;

    public Juice(String name) {
        this.name = name + "주스";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Fruit3 {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple3 extends Fruit3 {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape3 extends Fruit3 {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy3 {
    @Override
    public String toString() {
        return "Toy";
    }
}

class Box4<T> {
    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }
    public T get(int idx) {
        return list.get(idx);
    }
    public int size() {
        return list.size();
    }
    @Override
    public String toString() {
        return list.toString();
    }
}

class FruitBox3<T extends Fruit> extends Box4<T> {

}