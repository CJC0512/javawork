package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자를 이용한 객체 초기화와 설정자를 이용한 초기화의 장단점을 이해할 수 있다. */
        UserDTO user1 = new UserDTO();
        System.out.println(user1.toString());
        user1.setId("user01");              // Setter
        System.out.println(user1.getId());  // Getter

        /* 필기. .toString으로 선언하면 user1만 입력해도 toString() 메소드가 호출된다. */
        System.out.println(user1.toString());
        System.out.println(user1);


    }
}
