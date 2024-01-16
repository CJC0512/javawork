package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    /* 필기. 차 한대(Car 객체 하나)를 필드로 가진다.*/
    private Car myCar = new Car();

    /* 설명. 자신이 보유한 차량의 시동을 건다.*/
    public void startUP() {
        myCar.startUp();
    }

    /* 설명. 자신이 보유한 차량의 엑셀을 밟는다. */
    public void stepAccelator() {
        myCar.go();
    }

    /* 설명. 자신이 보유한 차량의 브레이크를 밟는다. */
    public void stepBreak() {
        myCar.stop();
    }

    /* 설명. 자신이 보유한 차량의 시동을 끈다.*/
    public void turnOff() {
        myCar.turnOff();
    }
}
