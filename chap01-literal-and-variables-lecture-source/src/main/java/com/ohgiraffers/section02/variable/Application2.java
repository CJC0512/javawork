package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다.(feat. 자료형(type)) */
        /* 필기.
        *   변수를 사용하는 방법
        *    1. 변수를 준비한다.(선언)
        *    2. 변수에 값을 대입한다.(값 대입 및 초기화)
        *    3. 변수를 사용한다.
        * */

        /* 설명. 자료형이란
        *   다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
        *   이러한 자료형은 기본자료형(Primitive Type)과 참조자료형(Reference Type)으로 나누어진다.
        *   먼저, 기본자료형 8가지부터 살펴보자.
        * */

        /* 설명. 정수를 취급하는 자료형 */
        byte bnum;          // 1 byte
        short snum;         // 2 byte
        int inum;           // 4 byte
        long lnum;          // 8 byte

        /* 설명. 실수를 취급하는 자료형 */
        float fnum;         // 4 byte
        double dnum;        // 8 byte

        /* 설명. 문자를 취급하는 자료형 */
        char ch;            // 2 byte

        /* 설명. 논리값 취급하는 자료형 */
        boolean isTrue;    // 1 byte

        /* 설명. 문자열은 참조 자료형이다.(feat. 대문자로 시작) */
        String str;        // 4 byte
    }
}
