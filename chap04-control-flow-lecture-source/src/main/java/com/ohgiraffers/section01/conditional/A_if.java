package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {

        /* 수업목표. if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 한 개를 입력하세요: ");
        int input_num = sc.nextInt();

        if (input_num % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }

    }

    public void testNestedIfStatement() {

        Scanner sc = new Scanner(System.in);

        /* 수업목표. 중첩된 if문의 흐름을 이해하고 적용할 수 있다. */
        System.out.println("양수 한 개를 입력하세요: ");
        int input_num = sc.nextInt();

        if (input_num > 0) {
            if(input_num % 2 == 0) {
                System.out.println("입력 받은 값은 양수이면서 홀수입니다.");
            }
        }
        
        if (input_num > 0 && input_num % 2 == 0){
            System.out.println("위와 같은 조건");
        }
    }
}
