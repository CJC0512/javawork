package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHP(int hp) {
        /* 필기. this는 메소드 호출 당시의 Monster 객체를 뜻하고, this.hp는 해당 객체의 hp 공간을 뜻한다. */
        if (hp > 0) this.hp = hp;
        else System.out.println("올바르지 않은 값. " +
                              "\n체력이 0 이하의 값 입니다. ");
    }
}
