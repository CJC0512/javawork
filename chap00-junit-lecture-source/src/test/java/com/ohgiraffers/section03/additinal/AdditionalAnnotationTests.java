package com.ohgiraffers.section03.additinal;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/* 설명. order 어노테이션으로 테스트 메소드 실행 순서 정하기 위해서는 클래스 상단에 추가할 것 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {

    /* 수업목표. junit에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다. */

    /* 필기. 해당 테스트를 무시할 때 사용하는 어노테이션이다. */
    @Disabled       // 클래스 위에는 이노테이션을 사용하면 모든 테스트 케이스 메소드가 무시된다.
    @Test
    public void testIgnore(){}

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(900);
//        Thread.sleep(1001);     // 예외 발생
    }

    @Test
    @Order(1)
    public void testFirst(){}

    @Test
    @Order(3)
    public void testThird(){}

    @Test
    @Order(2)
    public void testSecond(){}

    @RepeatedTest(10)
    public void testRepeat(){}
}
