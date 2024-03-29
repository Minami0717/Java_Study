package com.green.java.ch07.cards;

public class Card {
    static final String[] KINDS = {"CLOVER","HEART","DIAMOND","SPADE"};
    static final int NUM_MAX = 13;

    public String kind;
    public String num;

    public Card(String kind, String num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return "kind: " + kind + ", num: " + num;
    }
}
