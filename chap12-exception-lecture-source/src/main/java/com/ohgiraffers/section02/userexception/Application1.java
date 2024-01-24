package com.ohgiraffers.section02.userexception;


import com.ohgiraffers.section02.userexception.exception.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();

        /* 필기. 예외처리는 적힌 순서대로 예외를 확인한다. 따라서 자식 -> 부모 순서로 catch를 작성해 주어야 한다.
        *        예외가 발생하면 그 뒤에 적힌 구문은 작동을 안하기에, 하나하나씩 try하는 것이 좋다. */
        try {
//            et.checkEnoughMoney(-30000, 50000);
//            et.checkEnoughMoney(30000, -50000);
            et.checkEnoughMoney(80000, 50000);
        } catch (PriceNegativeException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {             // 다형성을 활용한 catch 처리 방식
            System.out.println("예외 메시지: " + e.getMessage());
        }

    }
}
