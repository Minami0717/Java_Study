package com.green.java.ch14;

public class FightableTest {
    public static void run(Fightable f) {
        f.punch();
    }
    public static void main(String[] args) {
        StreetFighter sf = new StreetFighter();
        run(sf);

        run(new Fightable() {
            @Override
            public void punch() {
                System.out.println("박치기");
            }
        });

        Fightable f1 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("punch");
            }
        };
    }
}

class StreetFighter implements Fightable {
    @Override
    public void punch() {
        System.out.println("주먹을 날린다.");
    }
}