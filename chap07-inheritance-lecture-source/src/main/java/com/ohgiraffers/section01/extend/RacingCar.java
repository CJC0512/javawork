package com.ohgiraffers.section01.extend;

import java.sql.SQLOutput;

public class RacingCar extends Car {
    public RacingCar() {
        System.out.println("RacingCar 기본 생성자 호출...");
    }

    @Override
    public void run() {
//        super.run();        // super.은 자신의 부모 객체를 뜻 함.
        System.out.println("레이싱 자동차가 신나게 달립니다. 쌔애애앵~!!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱 자동차는 경적따위 울리지 않습니다.");
    }

}
