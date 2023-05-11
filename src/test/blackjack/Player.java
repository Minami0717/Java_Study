package test.blackjack;

import com.green.java.ch07.cards.Card;

import java.util.ArrayList;

public class Player extends Gamer{
    private int money = 1000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
