package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;     // import는 가져오겠다 라기보단 별칭 작성에 가깝다.

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. import에 대해 이해할 수 있다. */
        Calculator cal = new Calculator();   // import를 활용해 줄여쓴 Calculator
        int sub = cal.subTwoNumbers(80,21);
        System.out.println("80 - 21 = " + sub);
    }
}
