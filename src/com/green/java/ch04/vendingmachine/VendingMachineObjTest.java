package com.green.java.ch04.vendingmachine;

public class VendingMachineObjTest {
    public static void main(String[] args) {
        VendingMachineObj vm = new VendingMachineObj();

        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);

        vm.showMenus();
        vm.purchaseDrink(1);
        vm.purchaseDrink(3);
        vm.purchaseDrink(2);

//        vm.showPurchaseList();
        vm.showMoney();
    }
}
