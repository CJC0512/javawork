package com.ohgiraffers.section02.assignment;

public class Application1 {

    /* 수업목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다. */
    /* 필기.
    *   대입연산자와 산술 복합 대입 연산자
    *   '=': 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
    *   '+=': 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
    *   '-=': 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
    *   '*=': 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
    *   '/=': 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
    *   '%=': 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
    * */

    public static void main(String[] args) {

        int num = 12;

        System.out.println("num = " + num);

        num = num + 3;          // 변수를 두 번 불러온다. (=느리다)
        System.out.println("num = " + num);

        num += 3;               // 변수를 한 번 불러온다. (=빠르다)
        System.out.println("num = " + num);
        /* 필기.
        *   num +=1; 과 num++; 의 차이?
        *    사실 큰 차이는 없지만, 후자의 경우 전자와 달리 간격을 조절할 수 없다. */

        num -= 5;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
//        /* 궁금. 여기에 실수 속성을 부여하면??*/
//        num /= 3;       // 결과 8 (소수 X)
//        num /= (double)3;   // 결과 8 (소수 X)
//        num /= 3.0;         // 결과 8 (소수 x)
        /* 해석. 실수 속성을 부여해도 복합 대입 연산자에서는 반영 안된다.*/
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);
        
        /* 주의사항 */
        num =- 5;       // equal(=) 기호가 오른쪽에 와야 복합 대입 연산자가 된다.
        System.out.println("num = " + num);
    }
}
