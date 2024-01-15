package com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다. */
        /* 필기. 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수(double)로 구하는 프로그램을 만들어보자.*/
        int num = 5;
        int[] score = new int[num];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + "번째 학생의 자바 점수를 입력해 주세요: ");
            score[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(score));

        /* 필기. 합계(sum)와 평균(avg) 구하기 */
        int sum = 0;
        for (int perscore : score) sum += perscore;
        System.out.println("sum = " + sum);
        System.out.println("avg = " +  (sum / (double)num));
    }
}
