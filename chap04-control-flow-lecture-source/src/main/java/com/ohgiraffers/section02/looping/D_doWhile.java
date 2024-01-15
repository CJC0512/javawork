package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void testSimpleDoWhileStatement() {

        /* 수업목표. do-while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        do {
            System.out.println("실행중~~~~~~~~~~");
        } while (false);

        System.out.println("반복 종료 이후");
    }

    public void testDoWhileExample() {

        /* 수업목표. do-while문의 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            if (!str.equals("finish") && !str.equals("")) {
                System.out.println("넌 내 말을 세겨듣지 않았군...");
                System.out.println("(ฅ`・ω・´)っ ==>> \n");
            }
            System.out.println("멈추고 싶다면 정확히 finish 라 입력혀");
            str = sc.nextLine();
            System.out.println(str + "을 입력했구만 \n");
        } while (!str.equals("finish"));     // equals메소드는 String 비교에 사용되며 '=='과 같은 의미이다.
        // str 문자열의 값이 'finish'와 일치하면 false가 되도록 작성
        System.out.println("잘 가셩");
    }
}
