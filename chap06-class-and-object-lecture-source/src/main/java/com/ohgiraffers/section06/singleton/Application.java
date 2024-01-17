package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다. */
        /* 필기.
         *   singleton pattern이란
         *    애플리케이션이 시작될 때, 어떤 클래스가 최초 한번만 메모리에 할당되고 그 메모리에
         *    인스턴스가 하나만 생성되어 공유되게하는 것을 싱글톤 패턴이라고 한다.
         *    (메모리 낭비 방지 목적)
         * 필기.
         *  장점
         *   1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
         *      두 번째 이용 시에는 인스턴스 생성 시간 없이 바로 사용할 수 있다.(재사용)
         *   2. 인스턴스가 절대적으로 한 개만 추구하는 것을 보충할 수 있다.
         *  단점
         *   1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
         *   2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 높다.
         *
         * 필기.
         *  싱글톤 구현 방법
         *   1. 이론 초기화(Eager Initialization): 프로그램 실행 시 생성
         *   2. 늦은 초기화(Lazy Initialization): 클래스 선언 시 생성
         * */

        EagerSingleton eager1 = EagerSingleton.getInstance();
//        eager1 = new EagerSingleton();
    }
}
