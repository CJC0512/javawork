package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.*;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
//            throws Exception {          // 다형성도 적용 가능하나, 처리하는 쪽에서 종류별로 처리하지 못한다.

        /* 설명. throw를 통한 예외 발생 시 바로 메소드를 호출한 곳으로 예외 인스턴스와 함께 반환된다. */
        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
        }

        /* 필기. 아무런 예외가 발생하지 않으면 아래 구문 실행 */
        System.out.println("가진 돈이 충분하시군요 고객님! 즐거운 쇼핑 되세요!");
    }

}
