package com.ohgiraffers.chap04.section01.greedy;

/* 수업목표. 그리디(Greedy) 알고리즘에 대해 이해할 수 있다. */
/* 필기.
*   현재 상태에서 최적의 해답(최대 이익을 주는 해답)을 찾기 위해 적용하는 알고리즘으로 앞의 선택이
*   이후에 영향을 주지 않을 때 적용 가능하다.
* */
public class Application1 {
    public static int solution(int n) {
        int count = 0;      // 들고 갈 최소 봉지 갯수

        while (true) {

            /* 설명. 5키로로 바로 나눌 수 있으면 n/5를 반환한다. */
            if (n % 5 == 0) {
                return n / 5 + count;       // + count 의 개념은 이전 반복에서 가져간 3킬로그램 봉지의 수이다.
            } else if (n < 0) {
                return -1;
            }

            /* 설명. 3킬로그램 봉지로 한 봉지 들고 간다. */
            n = n - 3;
            count++;
        }
//        return count;
    }

    /* 설명. 나의 soluntion. 5와 3을 굳이 명시해주어, 나중에 변수(5,3)가 변하더라도 반영하여 사용할 수 있도록 하였다. */
    public static int mySolution(int n) {
        int count = -1;      // 들고 갈 최소 봉지 갯수. 기본값은 오류로 처리한다.
        int num1 = 5;
        int num2 = 3;
        int divN = n % (num1 * num2);       // 5와 3의 공배수로 나눠지고 난 후 나머지
        int num1Count = (n / (num1 * num2)) * num2;           // 사용되는 5의 개수. 이해하기 쉽도록 굳이 풀어서 작성하였다.

        /*  설명. 나머지 수가 3으로 나눠질 수 있는지 확인*/
        if (divN % num2 == 0) {

            /* 설명. 3으로 나눠진다면, 5의 갯수와 3의 개수를 count에 대입 */
            count = num1Count + (divN / num2);
        }

        if (n % num1 == 0){
            count = n / num1;
        }

        /* 설명. 반환되는 값은 조건문 성립 여부에 따라 갈린다. */
        return count;
    }


}
