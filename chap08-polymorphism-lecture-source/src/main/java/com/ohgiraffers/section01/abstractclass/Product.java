package com.ohgiraffers.section01.abstractclass;

public abstract class Product {
    /* 필기.
    *   abstract method를 하나라도 가지고 있으면 그 class는 abstract가 붙어야 한다.
    *   이러한 abstract class는 객체를 생성하지 못한다.
    * */
    private int nonStaticField;
    private static int staticField;

    public Product() {}

    public void setNonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 호출함...");
    }

    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 호출함...");
    }

    public abstract void abstractMethod();       // 이렇든 메소드 body가 없거나 abstract(불완전한)가 있는 메소드를 abstract Method라고 부른다.
}
