package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{
    public SmartPhone() {
        super();
    }


    /* 필기. (MY)
     *   부모 class가 abstract class 이면, 자식 class도 abstract를 걸어줘야 한다.
     *   단, 부모 class에서 abstract의 원인이 되는 method에 대한 override로 method body를 만들어 이를 해결해준다면
     *   자식 class는 abstract class가 아니어도 된다.
     * */

    /* 설명. 추상 메소드를 물려받은 자식 클래스(온전한)는 반드시 오버라이딩 해야 한다. (강제성 부여) */
    @Override
    public void abstractMethod(){
        System.out.println("Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메소드 호출함...");
    }

    /* 설명. 추가적인 메소드도 작성할 수 있다. */
    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}
