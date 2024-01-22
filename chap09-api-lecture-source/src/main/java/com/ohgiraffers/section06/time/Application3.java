package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지 클래스를 활용한 덧셈, 뺄셈 및 **불변 특성**을 이해할 수 있다. */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("현재 시간: " + localDateTime);
        System.out.println("주소 값: " + System.identityHashCode(localDateTime));

        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        System.out.println("30분 후: " + localDateTime1);
        System.out.println("주소 값: " + System.identityHashCode(localDateTime1));

        LocalDateTime localDateTime2 = localDateTime.minusHours(3);
        System.out.println("3시간 전: " + localDateTime2);
        System.out.println("주소값: " + System.identityHashCode(localDateTime2));


    }
}
