package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElseIfStatement() {

        /* 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말싸다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼 2. 은도끼 3. 쇠도끼) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (!(answer == 1 || answer == 2 || answer == 3)) {
            System.out.println("넌 내 말을 못 알아들었구나..");
        } else {
            if (answer == 1) {
                System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이야!!");
            } else if (answer == 2) {
                System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 꺼지거라!!");
            } else {
                System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");
            }
        }
        System.out.println("그렇게 산신령은 다시 연못 속으로 홀연히 사라지고 말았다....");
    }

    public void testNestedIfElseIfStatement() {

        /* 수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *   ohgiraffers 대학의 김XX 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있다.
         *   90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 마지막으로 60점 미만인 경우에는
         *   'F'를 학점으로 주게 된다.
         *   그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         *   (추가로, 각 등급의 중간점수(95, 85, 75..) 이상인 경우 '+'를 붙여서 등급을 세분화 해보자.)
         *
         *  필기.
         *   출력 예시 : XXX 학생의 점수는 86점이고, 등급은 B+입니다.
         *             프로그램을 종료합니다.
         * */

        /* 필기. <수업 풀이> */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("점수를 입력하세요: ");
        int point = sc.nextInt();

        /* 필기. <나의 풀이> */
//        my_code(name, point);

        /* 필기. <첫 번째 케이스>
         *   if를 모두 실행하게 됨. 안좋음!!*/
//        if(point <= 100 && point >= 90){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 A입니다.");
//        }
//        if(point < 90 && point >= 80){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 B입니다.");
//        }
//        if(point < 80 && point >= 70){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 C입니다.");
//        }
//        if(point < 70 && point >= 60){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 D입니다.");
//        }
//        if(point < 60){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 F입니다.");
//        }

        /* 필기. <두 번째 케이스>
         *   else if를 해서 if 작동 빈도를 낮춘다! */
//        if(point <= 100 && point >= 90){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 A입니다.");
//        }
//        else if(point < 90 && point >= 80){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 B입니다.");
//        }
//        else if(point < 80 && point >= 70){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 C입니다.");
//        }
//        else if(point < 70 && point >= 60){
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 D입니다.");
//        }
//        else {
//            System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 F입니다.");
//        }


        /* 필기. <세 번째 케이스> */
//        if (point <= 100 && point >= 0) {
//            if (point >= 90) {
//                System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 A입니다.");
//            } else if (point >= 80) {
//                System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 B입니다.");
//            } else if (point >= 70) {
//                System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 C입니다.");
//            } else if (point >= 60) {
//                System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 D입니다.");
//            } else {
//                System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 F입니다.");
//            }
//        } else {
//            System.out.println("값 똑바로 입력 안하냐?");
//        }

        /* 필기. <수업 답안>*/
//        class_code(name,point);
    }

    public void my_code(String name, int score) {
        /* 필기. <나의 풀이> */
        String grade = "Error!";

        if (score >= 0 && score <= 100) {
            if (score >= 90){
                grade = "A";
            }
            else if (score >= 80){
                grade = "B";
            }
            else if (score >= 70){
                grade = "C";
            }
            else if (score >= 60){
                grade = "D";
            }
            else {
                grade = "F";
            }

            if ((score >= 65) && (score % 10 >= 5)){
                grade += "+";
            }
            System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 " + grade + "입니다." +
                    "\n프로그램을 종료합니다.");
        } else {
            System.out.println(grade);
        }
    }

    /* 필기. 수업 답안*/
    public void class_code(String name, int point) {
        /* 학생의 등급을 저장하기 위한 변수 초기화 */
        String grade = "";

        /* 학점등급을 매기기 위해 점수를 확인 하기 위한 조건문 */
        if(point >= 90) {

            /* 점수가 90점 이상인 경우 */
            grade = "A";

        } else if(point >= 80) {

            /* 점수가 90점 미만, 80점 이상인 경우 */
            grade = "B";

        } else if(point >= 70) {

            /* 점수가 80점 미만, 70점 이상인 경우 */
            grade = "C";

        } else if(point >= 60) {

            /* 점수가 70점 미만, 60점 이상인 경우 */
            grade = "D";

        } else {

            /* 위 조건을 다 만족하지 못하는 점수가 60점 미만인 경우 */
            grade = "F";
        }

        /* 각 등급의 중간 점수 이상이면서 60점 이상인 경우인지 확인(즉, +를 붙이는 조건에 맞는지 확인) */
        if(point % 10 >= 5 && point >= 60 || point == 100) {

            /* 60점 이상이면서 10으로 나눈 나머지가 5보다 큰 경우 */
            grade += "+";
        }

        /* 위에서 결정된 등급을 점수와 함께 출력한다. */
        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
        System.out.println("프로그램을 종료합니다.");
    }
}
