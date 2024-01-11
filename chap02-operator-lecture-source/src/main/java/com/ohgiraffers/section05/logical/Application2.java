package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {


        /* 목차. 1. 1부터 100 사이 값 확인 */
        int num1 = 55;
        int num2 = 101;
        System.out.println("========== 1부터 100 사이 값 확인 ==========");
        System.out.println((num1 >= 1) && (num1 <= 100));
        System.out.println((num2 >= 1) && (num2 <= 100));

        /* 목차. 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        char ch2 = 'g';
        System.out.println("========== 영어 대문자 확인 ==========");
        System.out.println((ch1 >= 65) && (ch1 <= 65 + 25));
        System.out.println((ch1 >= 'A') && (ch1 <= 'Z'));
        System.out.println((ch2 >= 65) && (ch2 <= 65 + 25));

        /* 목차. 3. 대소문자 상관 없이 영문자 'y'인지 확인 */
        char ch3 = 'Y';
        char ch4 = 'y';
        System.out.println("========== 대소문자 상관 없이 영문자 'y'인지 확인 ==========");
        System.out.println((ch3 == 'y') || (ch3 == 'Y'));
        System.out.println((ch4 == 'y') || (ch4 == 'Y'));

        /* 목차. 4. 영문자인지 확인하는 조건식 */
        char ch5 = 'o';
        char ch6 = '`';
        System.out.println("========== 영문자인지 확인 ==========");
        System.out.println(((ch5 >= 'A') && (ch5 <= 'Z')) || ((ch5 >= 'a') && (ch5 <= 'z')));
        System.out.println(((ch6 >= 'A') && (ch6 <= 'Z')) || ((ch6 >= 'a') && (ch6 <= 'z')));
        System.out.println((ch6>= 'A') && (ch6 <= 'z'));        // 중간에 특수 기호가 있으니 잘못된 조건식

    }
}
