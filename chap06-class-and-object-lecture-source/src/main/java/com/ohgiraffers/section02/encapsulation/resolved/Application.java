package com.ohgiraffers.section02.encapsulation.resolved;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 접근 제어자와 캡슐화에 대해 이해하고 직접 필드 접근을 막는 이유를 이해할 수 있다. */
        Monster monster = new Monster();
//        monster.name = "드라큘라";
//        monster.hp = 1000;

        /* 설명. 필드에 직접 접근 대신 메소드를 통해 우회하여 접근한다. */
        monster.setInfo1("드라큘라");
        monster.setInfo2(1000);
    }
}
