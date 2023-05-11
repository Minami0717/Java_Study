package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineObj {
    private int money;
    private List<Drink> drinks;

    VendingMachineObj() {
        drinks = new ArrayList<>();
        drinks.add(new Drink("콜라", 1000, "코카콜라", 500));
        drinks.add(new Drink("사이다", 1500, "칠성", 450));
        drinks.add(new Drink("환타", 2000, "코카콜라", 500));
    }

    void insert(int money) {
        this.money += money;
    }
    void showMoney() {
        System.out.printf("현재 잔액은 %,d원입니다.\n", money);
    }
    void showMenus() {
        System.out.println("번호\t메뉴명\t가격 \t회사 \t용량");
        for (int i = 0; i < drinks.size(); i++) {
            Drink d = drinks.get(i);
            System.out.printf("%d. \t%s \t%,d원\t%-4s\t%dml\n", i+1, d.getName(), d.getPrice(), d.getCompany(), d.getMl());
        }
    }
    void purchaseDrink(int num) {
        Drink d = drinks.get(num-1);
        money -= d.getPrice();
        System.out.println(d.getName() + "을(를) 구매하였습니다.");
    }
}
