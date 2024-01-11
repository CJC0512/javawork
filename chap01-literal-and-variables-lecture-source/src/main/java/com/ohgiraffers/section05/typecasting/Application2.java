package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 필기.
        *   강제형변환
        *   바꾸려는 자료형을 ㅗ캐스트 연산자((자료형))을 이용하여 형변환한다.
        * */

        long lnum = 8L;
        int inum = (int)lnum;       // 다운캐스팅 시에는 의도치 않은 값의 변화가 일어날 수 있기에
                                    // 신중하게 사용해야 한다.
        System.out.println("inum = " + inum);
        
        float avg = 31.235f;        // 실수 변수에서
        int floorNum = (int)avg;    // 정수로 다운캐스팅 시에는 소수점 이하가 제거(버림)된다.
        System.out.println("floorNum = " + floorNum);

    }
}
