package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.LinkedList;

public class VendingMachine {
    private LinkedList<Drink> buyDrinks;
    private final ArrayList<Drink> drinkList;
    private int money;
//    private String[] menuNameArr = { "콜라", "사이다", "환타", "미란다"};
//    private int[] menuPriceArr = { 1000, 1500, 2000, 2500};

    VendingMachine() {
        drinkList = new ArrayList<>();
        drinkList.add(new Drink("콜라", 1000, "company", 2));
        drinkList.add(new Drink("사이다", 1500, "company", 1));
        drinkList.add(new Drink("환타", 2000, "company", 3));
        drinkList.add(new Drink("미란다", 2500, "company", 4));
    }

    public int getMoney() {
        return money;
    }
    void insert(int money) {
        this.money += money;
    }
    void showMoney() {
        System.out.printf("현재 잔액은 %,d원입니다.\n", money);
    }
    void showMenus() {
        System.out.println("번호\t메뉴명\t가격");
//        for (int i = 0; i < menuNameArr.length; i++) {
//            System.out.printf("%d. \t%s \t%,d원 \n", i + 1, menuNameArr[i], menuPriceArr[i]);
//        }
        for (int i = 0; i < drinkList.size(); i++) {
            System.out.printf("%d. \t%s \t%,d원 \n", i + 1, drinkList.get(i).getName(), drinkList.get(i).getPrice());
        }
    }
    void purchaseDrink(int num) {
        if (num > 4 || num < 1) { return; }
        if (buyDrinks == null) {
            buyDrinks = new LinkedList<>();
        }
        buyDrinks.add(drinkList.get(num-1));
        money -= drinkList.get(num-1).getPrice();
        System.out.println(drinkList.get(num-1).getName() + "를 구매하였습니다.");
    }
    void showPurchaseList() {
        if (buyDrinks == null) {
            System.out.println("구매한 제품이 없습니다.");
            return;
        }
        System.out.print(buyDrinks.get(0).getName());
        for (int i = 1; i < buyDrinks.size(); i++) {
            System.out.print(", " + buyDrinks.get(i).getName());
        }
        System.out.println("을(를) 구매하였습니다.");
    }
}
