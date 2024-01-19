package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 추상클래스와 추상메소드에 대해 이해할 수 있다. */
        /* 필기.
        *   추상 클래스와 추상 메소드
        *    추상 메소드를 0개 이상 포함하는 클래스를 추상 클래스라고 한다.
        *    쉽게 불안전한 클래스라고 생각할 수 있다.
        *    불완전한 클래스는 생성자를 통해 객체를 생성하지 못한다.
        *    (단, 자식 클래스 객체가 생성 될 때는 내부적으로 생성될 수 있다.)
        *
        *  필기.
        *    메소드의 헤드부만 있고 바디부가 없는 메소드를 추상 메소드라고 한다.
        *    쉽게 말해 불완전한 메소드라고 생각 할 수 있다.
        *    불완전한 메소드를 하나라도 가진 클래스는 반드시 추상 클래스가 되어야 한다.
        *    ex) public abstract void method();
        * */
        /* 필기. (MY)
        *   부모 class는 abstract이기에 오류가 나지만,
        *   자식 class는 Override를 통해 abstract 이슈를 해결하였기에 객체 생성이 가능하다.
        *   abstract를 활용하여 꼭 Override 해야하는 (=규약) Method를 확인할 수 있다.
        * */

        /* 설명. abstract 클래스는 객체를 생성할 수 없는 불완전한 클래스이다. */
//        Product product = new Product();

        /* 설명. abstract 메소드를 구현한 온전한 자식 클래스는 인스턴스(객체)를 생성할 수 있다. */
        SmartPhone smartPhone = new SmartPhone();

        /* 설명. Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메소드 호출 확인 */
        Product product = new SmartPhone();         // 다항성 적용
        product.abstractMethod();                   // 동적 바인딩에 의한 자식 클래스의 오버라이딩 메소드 실행
    }
}
