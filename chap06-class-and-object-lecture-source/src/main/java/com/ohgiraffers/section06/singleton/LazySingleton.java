package com.ohgiraffers.section06.singleton;

public class LazySingleton {
    private static LazySingleton lazy;          // 선언

    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if(lazy == null){               // static 변수인 lazy에 한번도 객체가 생성 및 할당된 적이 없다면
            lazy = new LazySingleton();         // 초기화
        }

        return lazy;
    }
}
