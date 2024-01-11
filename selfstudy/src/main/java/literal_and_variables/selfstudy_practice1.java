package literal_and_variables;

public class selfstudy_practice1 {
    public static void main(String[] args) {

        /* 궁금. 1. 공백을 의미하는 문자 '\u0000'을 정수 사이에 넣었을 때,
         *          이 정수들은 문자로 연산될지? 아니면 정수로 연산될지?
         * */
        System.out.println("\n======== 궁금 1 ========");
        System.out.println(33 + '\u0000' + 65);
        System.out.println('\u0000');
        
        char ch = '한';

        System.out.println("ch = " + ch);
        System.out.println(ch);


        /* 해석. 1. '\u0000'은 없는 문자로 처리되어 33 + 65와 동일한 결과를 가진다.
        *           '\u0000' == NULL
        *       출력.
                        98
        * */


        /* 궁금. 2. 공백을 의미하는 문자열 "\u0000"을 정수 사이에 넣었을 때,
         *          이 정수들은 문자열로 연산될지? 아니면 정수로 연산될지?
        * */
        System.out.println("\n======== 궁금 2 ========");
        System.out.println(33 + "\u0000" + 65);

        /* 해석. 2. "\u0000"은 없는 문자로 입력되어 33 65와 동일한 결과를 가진다.
        *       출력.
                        33 65
        * */

        /* 궁금. 3. 공백을 의미하는 문자열 "\u0000"와 " "은 동일한 것인가?
         * */
        System.out.println("\n======== 궁금 3 ========");
        System.out.println("\u0000");
        System.out.println(" ");
        System.out.println(("" == "\u0000"));

        /* 해석. 3. 동일하지 않다.
        *       출력.


                        false
        * */

        /* 궁금. 4. Ctrl + Shift + 화살표 행 이동과
         *          Alt + Shift + 화살표 행 이동의 차이?
         * */
        System.out.println("\n======== 궁금 4 ========");

        System.out.println("구문이요. 넘버는 1!");
        // 안녕하세요 저는 한 줄 주석입니다.
        System.out.println("구문이요. 넘버는 2!");
        /* 안녕하세요 저는 범위 주석입니다.
         *   하 하 하
         *   크 크 크
         * */
        System.out.println("구문이요. " +
                "넘버는 3!");
        System.out.println("구문이요. 넘버는 4!");

        /* 해석. 4. Ctrl + Shift + 화살표 행 이동은 구문 단위로 고려한 행 이동!! (단, 이동할 행에 구문이 없을 경우, 한 행만 이동)
         *          Alt + Shift + 화살표 행 이동은 절대적 행을 고려한 행 이동!!
         * */
    }
}
