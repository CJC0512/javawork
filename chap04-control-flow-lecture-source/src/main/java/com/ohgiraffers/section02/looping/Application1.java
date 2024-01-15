package com.ohgiraffers.section02.looping;

public class Application1 {
    public static void main(String[] args) {
        A_for aClass = new A_for();

        /* 필기. 단독 for문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleForStatement();

        /* 필기. 반복문을 사용하는 예제(반복문 필요성) */
//        aClass.testForExample1();
//        aClass.testForExample2();

        B_nestedFor bClass = new B_nestedFor();

        /* 필기. 중첩 반복문을 사용하는 예제 */
//        bClass.printGugudanFromTwotoNine();
//        bClass.printUpgradeGugudanFromTwoToNine();

        /* 필기. 중첩 반복문을 활용한 별찍기 관련 예제 */
//        bClass.printStars();
        bClass.printdiamond();


    }
}
