package com.ohgiraffers.section01.method;

public class Application2 {

    /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다.
     *   (main 메소드에서 한번에 순차적으로 여러 메소드 호출하기) */
    /* 설명. 
    *   static이 붙어 있지 않은 메소드는 <클래스명 변수명 = new 클래스명();>을 활용해 메소드를 호출해야 한다.
    *   (접근 연산자(.)도 활용*/
    public void methodD(){
        System.out.println("methodD 호출됨...");
        System.out.println("methodD 종료됨...");
    }

    public static void main(String[] args) {
        System.out.println("main 호출됨...");
        Application2 app2 = new Application2(); // Applicaiton을 app2로 다시 읽기
        app2.methodA();
//        methodD()     // 아무리 methodD가 main 위에 작성되었다 하더라도, app2.를 통해 접근하지 않는다면 실행을 못한다.
        methodB();
        methodC();
        System.out.println("main 종료됨...");
    }
    public void methodA(){
        System.out.println("methodA 호출됨...");
        System.out.println("methodA 종료됨...");
    }
    public static void methodB(){
        System.out.println("methodB 호출됨...");
        System.out.println("methodB 종료됨...");
    }
    public static void methodC(){
        System.out.println("methodC 호출됨...");
        System.out.println("methodC 종료됨...");
    }
}
