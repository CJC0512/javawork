package com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Application3 {

    int global = 10;     // 전역변수
    static int s_global = 20;       // 전역변수이자 클래스 변수

    public static void main(String[] args) {
        int global = 20;     // 지역변수
        System.out.println("global = " + global);
        System.out.println("s_global = " + s_global);
        System.out.println("Application3.s_global = " + Application3.s_global);

        Application3 app3 = new Application3();
        System.out.println("app3 = " + app3.global);    // 전역변수도 접근 가능하다.

        
        /* 수업목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 활용할 수 있다. */
        /* 필기.
        *   전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        *   지금까지 우리가 배운 변수는 지역변수에 해당한다.
        * */

        /* 필기.
        *   변수의 종류 (자료형과는 다른 구분방식)
        *    1. 지역변수
        *    2. 매개변수
        *    3. 전역변수(필드)
        *    4. 클래스(static) 변수
        * */

        app3.testMethod(24);            // 24는 전달인자이다.
        app3.testMethod(19);

        app3.testMethod('a');           // 자동 형변환되어 97로 전달된다.
        app3.testMethod((int)12.34);
        app3.testMethod(3 * 2);
    }

    /* 설명. 정수를 주면 나이를 출력해주는 기능을 가진 메소드(non-static) */
    public void testMethod(int age){        // int age는 전달인자를 받는 지역변수인 매개변수이다.(=parameter)
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}