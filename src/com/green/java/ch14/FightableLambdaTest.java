package com.green.java.ch14;

public class FightableLambdaTest {
    public static void run(Fightable f) {
        f.punch();
    }
    public static void main(String[] args) {
        Fightable f1 = () -> {
            System.out.println("punch");
        };

        Fightable f2 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("punch");
            }
        };

        run(f1);
        run(f2);
    }
}
