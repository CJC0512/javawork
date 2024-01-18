package com.ohgiraffers.section03.overriding;

public class App {
    public static void main(String[] args) {
        Animal an1 = new Animal();
        Animal an2 = new Rabbit();

        System.out.println("computer");
        an2.p1();

        System.out.println("product");
        an1.p1();
    }
}
