package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    /* 필기. 유효성 체크 메소드 */
    public void checkEnoutghMoney(int price, int wallet) throws Exception {
        System.out.println("지갑 속 잔액은 " + wallet + "원 입니다.");

        if (wallet >= price) {
            System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다.");
        } else {         // 예외 상황
            throw new Exception("잔액이 부족합니다.");
        }
    }
}
