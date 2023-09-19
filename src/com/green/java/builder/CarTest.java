package com.green.java.builder;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = Car.builder()
                .cc(1000)
                .brand("br")
                .build();

        System.out.println(c1);

        Car c2 = Car.builder()
                .model("sonata")
                .seatCnt(53)
                .build();

        System.out.println(c2);
    }
}
