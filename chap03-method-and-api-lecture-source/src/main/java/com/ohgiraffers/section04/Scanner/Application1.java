package com.ohgiraffers.section04.Scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기 */
//        java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        /* 필기. 사용자가 입력을 하면 그 내용은 Buffer에 남는다. 이 Buffer에서 next가 문자를 반환하는 것이다.*/
        /* 목차. 1. 문자열 입력 받기 */
        System.out.print("이름을 입력하세요: ");
        String name1 = sc.next();        // ' '(공백) \n(개행) 전까지 문자열 반환
        String name2 = sc.nextLine();    // ' '(공백) \n(개행)을 포함한 문자열 모두 반환
        System.out.println("입력하신 이름은: " + name1);
        System.out.println("입력하신 이름은: " + name2);

        /* 목차. 2. 정수형 입력 받기 */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는: " + age);

        /* 목차. 3. 실수형 입력 받기 */
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는: " + height);

        /* 목차. 4. 논리형 입력 받기 */
        System.out.print("참과 거짓 중에 한 가지를 입력하세요(true or false): ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은: " + isTrue);

        /* 목차. 5. 문자형 입력 받기 */
        System.out.print("성별을 입력하세요(예. 남 여): ");
        char gender = sc.next().charAt(0);          // String의 0번째 있는 것을 char형으로 바꾼다.
        // nextLine()을 쓴다면 중간에 쌓인 공백 및 개행을 제거하기 위해 nextLine()을 따로 추가해줘야 한다.
//        char gender = sc.nextLine().charAt(0);    // 메소드 체이닝 방식으로 상용자의 입력 값에서 인덱스 번째의 문자를 char형으로 반환
        System.out.println("입력하신 성별은: " + gender);

    }
}
