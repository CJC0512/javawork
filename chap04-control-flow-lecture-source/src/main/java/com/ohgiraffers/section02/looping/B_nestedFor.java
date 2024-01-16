package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwotoNine() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */

        /* 설명.
         *   2단
         *    2 * 1 = 2
         *    2 * 2 = 4
         *    2 * 3 = 6
         *    ...
         *    9 * 7 = 63
         *    9 * 8 = 72
         *    9 * 9 = 81
         * */

        for (int i = 2; i < 10; i++) {          // 단수: 2 ~ 9
            System.out.println("\n" + i + "단 시작!!");
            for (int j = 1; j < 10; j++) {      // 곱해지는 수: 1 ~ 9
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. inner for문을 메소드로 따로 모듈화 해보자.(하나의 기능 단위로 보고) */
        for (int dan = 2; dan < 10; dan++) {
            System.out.println(dan + "수 출력");
            printGugudanOf(dan);
            System.out.println();
        }
    }

    /* 설명. 단수를 넘기면 1~9까지 곱해서 숫자를 출력해주는 기능 */
    private void printGugudanOf(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + "*" + su + " = " + (dan * su));
        }
    }

    /* 설명.
     *   아래와 같은 별모양이 나오도록 작성해보자.
     *   정수를 입력하시오: 5
     *       *
     *      **
     *     ***
     *    ****
     *   *****
     * */
    public void printStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            /* 설명. 공백 출력용 for문 */
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            /* 설명. 별 출력용 for문 */
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 설명. 멋진 다이아몬드 만들기 */
    private void printstar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    private void printspace(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }
    public void printdiamond() {
        Scanner sc = new Scanner(System.in);
        int num = -2;

        /* 설명. 멋진 다이아몬드를 완성하기 위한 정수 입력 받기 */
        System.out.print("정수를 입력하시오: ");
        num = sc.nextInt();
        int divNum = (num % 2 == 0) ? 1 : 0;

        /* 설명. 상단 및 중앙 별 출력 */
        for (int i = 0; i <= num; i++) {
            if (i % 2 == divNum)
                continue;
            printspace((num - i) / 2);
            printstar(i);
            printspace((num - i) / 2);
            System.out.println();
        }
        /* 설명. 하단 별 출력 */
        for (int i = num - 2; i >= 0; i--){     // 중앙 바로 밑행부터 실행하기 위해 num - 2부터 시작
            if (i % 2 == divNum)
                continue;
            printspace((num - i) / 2);
            printstar(i);
            printspace((num - i) / 2);
            System.out.println();
        }
    }

}
