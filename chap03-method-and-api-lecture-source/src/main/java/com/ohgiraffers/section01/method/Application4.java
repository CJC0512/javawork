package com.ohgiraffers.section01.method;

public class Application4 {

    /* 필기. <IntelliJ>
     *  Ctrl + (Shift)(=영역 선택) + Alt + L: 자동정렬 */

    public static void main(String[] args) {

        /* 수업목표. 여러 개의 전달 인자를 이용한 메소드 호출을 할 수 있다. */

        /* 목차. 1. 여러 개의 매개변수를 가진 메소드 호출 */
        Application4 app4 = new Application4();         // class의 내용물이 메모리에 올라간다.
        app4.testMethod("홍길동", 20, '남');
        /* 필기. <IntelliJ>
         *   F2, alt + Enter, Enter 한다면 밑줄쳐진 오류를 찾은 후, 적절한 해결방안을 작성한다.
         * */


        /* 목차. 2. 변수에 저장된 값을 전달하여 호출할 수 있다. */
        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name, age, gender);


    }

    private void testMethod(String name, int age, final char gender) {
//        gender = '중';     // final이 붙여져 있기에 값변환이 안된다.
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 "
                + gender + "입니다.");
    }


}
