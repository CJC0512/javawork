package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
//    int hp;

    /* 설명. 필드의 변수명이 바꼈다면 */
    String kinds;
    int mp;

    /* 필기. 오류가 Class 내에서만 발생하겠금 설계. => 단일 책임의 원칙
    *       => For, 유지보수를 위해서. */
    public void setInfo1(String info1) {
//        this.name = info1;
        this.kinds = info1;
    }
    public void setInfo2(int info2) {
//        this.hp = info2;
        this.mp = info2;
    }
}
