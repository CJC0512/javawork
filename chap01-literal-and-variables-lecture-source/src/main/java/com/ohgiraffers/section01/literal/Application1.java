package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        /* 필기. 주석 및 그 단축키 */
        // 한 줄 주석 Ctrl + /
        /* 범위 주석 Ctrl + Shift + / */
        /*
            여러줄
            주석
            가능하네?
         */

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

        /* 목차. 1-2. 실수 형태의 값 출력 */
        /* 필기. sout + Enter 하면 System.out.println(); 이 생성 */
        /* 필기. Ctrl을 누르고 println과 같은 함수 위에 마우스 커서를 올려놓으면
        *       인식하고 있는 데이터 형을 확인할 수 있다.
        * */
        System.out.println(1.234);

        /* 목차. 2. 문자 형태의 값 출력 */
        /* 필기. 2-(1). Java에서 문자는 single quatation(')으로 감싸줘야 함. */
        System.out.println('a');
        System.out.println('1');

        /* 필기. 2-(2). 문법 오류로 인한 컴파일 에러 발생 */
        // System.out.println('ab');        // 2 글자 이상
        // System.out.println('');          // 아무 글자도 없음

        /* 필기. 3-(3). 빈 글자 출력 */
        System.out.println('\u0000');       // 빈 글자 출력

        /* 목차. 3. 문자열 형태의 값 출력 */
        /* 필기. 3-(1). Java에서 문자열은 double quatation(")으로 감싸줘야 함.
        *              자바는 기본적으로 데이터 Type에 예민하다.(= 정적 타입 언어: Java, C++)
        *              (동적 타입 언어: Java Script(Type Script라는 것도 있더라), python)
        * */
        System.out.println("안녕하세요");

        /* 필기. 3-(2). 문자열은 한 글자, 빈 글자도 취급 가능하다. */
        System.out.println("a");
        System.out.println("");

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println("true");         // double quatation(")이 붙으면 문자열이 된다.
        System.out.println(false);          // true 또는 false 두 값만 논리 값이다.

    }
}
