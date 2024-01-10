package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args){

        // 필기. 유용한 단축키
        //  Ctrl + D: 복제
        //  Ctrl(Alt) + Shift + 화살표: 해당 행 선택 후, 이동

        // 수업목표. 값을 직접 연산하여 출력할 수 있다.

        // 목차. 1. 숫자와 숫자의 연산
        // 필기. 1-(1). % modulus 연산자(mod 연산자): 제수로 나눈 나머지. 즉, 나머지 연산
        System.out.println("========= 정수와 정수의 연산 =========");
        System.out.println(123 + 456);          // 579
        System.out.println(123 - 23);           // 100
        System.out.println(123 * 10);           // 1230
        System.out.println(123 / 10);           // 12
        System.out.println(123 % 10);           // 3

        // 필기. 1-(2). 실수는 정확하지 않은 근사값으로 저장되기에, 실수 연산에 대한 기대값과 실제 결과값이 다를 수 있다.
        System.out.println("========= 실수와 실수의 연산 =========");
        System.out.println(1.23 + 1.23);        // 2.46
        System.out.println(1.23 - 0.23);        // 1.0
        System.out.println(1.23 * 10.0);        // 12.3
        System.out.println(1.23 / 10.0);        // 0.123
        System.out.println(1.23 % 1.0);         // 0.22999999999999998

        // 필기. 1-(3). 정수와 실수 연산 시, 정수가 실수값으로 변환 된 후에 연산된다. 따라서, 결과값은 실수로 나온다.
        System.out.println("========= 정수와 실수의 연산 =========");
        System.out.println(123 + 0.5);          // 123.5
        System.out.println(123 - 0.5);          // 122.5
        System.out.println(123 * 0.5);          // 61.5
        System.out.println(123 / 0.5);          // 246.0
        System.out.println(123 % 0.5);          // 0.0

        // 목차. 2. 문자의 연산
        // 필기. 2-(1). 문자와 정수의 연산은 정수와 정수의 연산과 같다.(유니코드 기반의 숫자로 변환)
        //  해석. 'a'는 아스키 코드로 97이기에, 정수 97 + 1 에 대한 연산이 되어 결과값 98이 나온다.
        System.out.println("========= 문자와 정수의 연산 =========");
        System.out.println('a' + 1);            // 98
        System.out.println('a' - 1);            // 96
        System.out.println('a' * 2);            // 194
        System.out.println('a' / 2);            // 48
        System.out.println('a' % 2);            // 1

        // 필기. 2-(2). 문자와 실수의 연산은 정수와 실수의 연산과 같다.
        System.out.println("========= 문자와 실수의 연산 =========");
        System.out.println('a' + 1.8);          // 98.8

        // 목차. 3. 문자열 연산
        // 필기. 3-(1). 문자열간의 연산은 덧셈(이어붙이기)만 가능하다.
        System.out.println("========= 문자열과 문자열의 연산 =========");
        System.out.println("hello" + "world");  // helloworld
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        // 필기. 3-(2). 문자열과 다른 형태의 값을 연산하면, 다른 형태의 값을 문자열로 변환해
        //  문자열과 문자열의 연산으로 처리한다.
        System.out.println("========= 문자열과 다른 형태의 값 연산 =========");
        // 설명. 문자열과 정수의 연산
        System.out.println("hellowworld" + 123);            // hellowworld123

        // 설명. 문자열과 실수의 연산
        System.out.println("hellowworld" + 123.456);        // hellowworld123.456

        // 설명. 문자열과 문자의 연산
        System.out.println("hellowworld" + 'a');            // hellowworlda

        // 설명. 문자열과 논리값의 연산
        System.out.println("hellowworld" + true);           // hellowworldtrue

        // 설명. 이항연산자들의 묶음에서 좌측에서부터 이항씩 연산하면 아래 코드의 결과를 이해할 수 있다.
        // 필기. 3-(3). 순차적 연산.
        //  아래 코드와 같이 연산자의 우선순위가 동등한 경우, 좌측부터 순차적으로 연산한다.
        System.out.println(123 + 3 + "hellowworld" + 123 + 3);  // 126hellowworld1233

        // 설명. 문자열 뒤에 숫자를 활용한 연산을 쓰게 되면 소괄호(())를 써서 우선순위를 높이고 연산해 주어야 한다.
        System.out.println("합계: " + (123 + 345));             // 합계: 468


        // 목차. 4. 논리값의 연산
        // 설명. 대부분의 연산이 적용되지 않고, 논리와 문자열의 연산만 가능하다.
//        System.out.println(true + 1);     // 컴파일 에러
//        System.out.println(true * 1);

        System.out.println("========= 논리값과 문자열 형태의 값 연산 =========");
        System.out.println(true + "문자열");       // true문자열
    }
}
