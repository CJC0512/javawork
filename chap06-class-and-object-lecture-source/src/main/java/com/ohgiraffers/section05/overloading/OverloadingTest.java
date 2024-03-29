package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /* 수업목표. 오버로딩(Overloading)에 대해 이해할 수 있다. */

    /* 필기.
    *   메소드의 시그니처?
    *    publice void method(int num) {} 이라는 메소드의 메소드명과 파라미터 선언부 부분을
    *    메소드의 시그니처(signature)라고 한다. (즉, method(int num))
    * 
    *  필기.
    *   동일한 메소드 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 경우, 이를 적용하는 기술을 오버로딩이라고 한다.
    * 
    *  필기.
    *   오버로딩의 조건?
    *    매개변수의 **타입, 갯수, 순서**를 다르게 작성하여 하나의 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있다.
    *    메소드의 헤드부(반환 타입 혹은 범위 연산자 등)에 있어, 시그니처를 제외한 부분이 다르게 작성되는 것은 인정되지 않는다.
    * */
    public void test() {}

    private String test(String ax, char ch){        // 메소드 오버로딩에서는 시그니처를 제외한 나머지 부분은 상관이 없다.
        return "";
    }

    /* 설명. 매개변수의 갯수가 달라졌기 때문 */
    public void test(int num) {       // 메소드의 시그니처를 다르게 한다면 Overloading 가능
        System.out.println("num = " + num);
    }

    public void test(int num1, int num2) {}
//    public void test(int num2, int num1) {}     // 변수명이 다른 것은 무의미하다.

    /* 설명. 매개변수의 타입이 달라졌기 때문 */
    public void test(int num, String str) {}        // 자료형의 Type이 다르면 가능하다.

    /* 설명. 매개변수의 순서가 달라졌기 때문 */
    public void test(String str, int num) {}        // 자료형의 순서만 달라도 가능하다.
}
