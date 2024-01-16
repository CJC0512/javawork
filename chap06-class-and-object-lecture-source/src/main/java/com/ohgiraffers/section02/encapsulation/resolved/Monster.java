package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {
    private String name;        // private: class내에서만 사용할 수 있도록 하는 접근 제어자 (=캡슐화)
    private int hp;

    void setInfo1(String info1){
        this.name = info1;
    }

    void setInfo2(int info2){
        this.hp = info2;
    }
}
