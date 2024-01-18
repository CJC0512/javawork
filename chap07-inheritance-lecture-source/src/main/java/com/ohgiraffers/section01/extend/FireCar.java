package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    public FireCar() {

        /* 필기.
         *   기본적으로 자식 클래스의 생성자에는 super()가 숨겨져 있다.
         *   부모 객체가 먼저 생성된 후, 자식 객체가 생성되는 것이다.
         *   즉, super는 부모의 기본 생성자*/
        super();
        System.out.println("FireCar의 기본 생성자 호출...");
    }

    @Override
    /* 필기.
     *   @Override 어노테이션을 추가하는 이유?
     *    1. 메소드 중에 부모로부터 물려받은 메소드인 것을 한 눈에 알아보기 쉽게 하기 위해서 (가독성 측면)
     *    부모의 메소드를 오버라이딩할 때 발생할 수 있는 신수를 방지하기 위해서 (실수 방지 측면)
     * */
    public void soundHorn() {
        System.out.println("삐-용! 삐-용! 빠아아아앙아아아아아아앙앙앙앙앙~!!");
    }

    public void sprayWater() {
        System.out.println("불이 난 곳을 발견했습니다. 물을 뿌립니다... ===========3");
    }
}
