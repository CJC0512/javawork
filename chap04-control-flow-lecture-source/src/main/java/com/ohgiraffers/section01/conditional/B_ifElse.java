package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {


    public void testSimpleIfElseStatement() {

        /* 수업목표. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요: ");
        int input_num = sc.nextInt();

        if (input_num % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }
    }

    public void testNestedIfElseStatemnet() {

        /* 수업목표. 중첩된 if-else 문의 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요: ");
        int input_num = sc.nextInt();

        /* 설명. 정수를 하나 입력받아 양수와 음수를 구분하고,
         *      암수일 때만 짝수인지 아닌지 판별하다(각 상태 모두 출력)
         * */
        if (input_num > 0) {
            System.out.println("양수입니다.");

            if (input_num % 2 == 0) {
                System.out.println("양수이면서 짝수 입니다.");
            } else {
                System.out.println("양수이면서 음수 입니다.");
            }
        } else {
            System.out.println("0 또는 음수입니다.");
        }
    }
}
