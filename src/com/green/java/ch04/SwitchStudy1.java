package com.green.java.ch04;

public class SwitchStudy1 {
    public static void main(String[] args) {
        int level = 5;
        switch (level) {
            case 5:
                System.out.println("level5");
                break;
            case 4:
                System.out.println("level4");
                break;
            case 3:
                System.out.println("level3");
                break;
            case 2:
                System.out.println("level2");
                break;
            case 1:
                System.out.println("level1");
                break;
            default:
                System.out.println("level0");
        }
    }
}
