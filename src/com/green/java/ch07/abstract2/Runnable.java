package com.green.java.ch07.abstract2;

public interface Runnable extends CanFly, Fightable {
    void run();
    void move(int x, int y);
}
