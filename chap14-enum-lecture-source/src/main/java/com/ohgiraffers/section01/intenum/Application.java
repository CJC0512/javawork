package com.ohgiraffers.section01.intenum;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 정수 열거 패턴과 이의 단점을 이해할 수 있다. (열거형(enum) 아닐 때) */
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        /* 설명. 1. 둘 다 상수이자 숫자일 뿐인데 같은 숫자일 경우 구분할 수 없다. */
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다.");
        }

        /* 설명. 2. 이름 충돌 방지를 위해서는 접두어를 써서 구분해야만 한다. (이름과 번호가 같을 때) */
        /* 설명. 3. 이름 또는 문자열을 출력하기 어렵다. (feat.switch) */



        
    }
}
