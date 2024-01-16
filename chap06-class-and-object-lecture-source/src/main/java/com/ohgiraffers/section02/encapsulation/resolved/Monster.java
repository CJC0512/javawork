package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {          // class의 접근 제어자는 public 또는 default(안 적힘) 두 가지 밖에 없다.

    /* 필기. 접근 제어자 private를 활용하여 캡술화를 적용한다.(같은 클래스를 제외한 곳에서는 접근 불가) */
    private String name;        // private: class내에서만 사용할 수 있도록 하는 접근 제어자 (=캡슐화)
    private int hp;

    void setInfo1(String info1){
        this.name = info1;
    }

    void setInfo2(int info2){
        this.hp = info2;
    }
}
