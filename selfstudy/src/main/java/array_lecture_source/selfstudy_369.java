package array_lecture_source;

import java.util.Objects;
import java.util.Scanner;

public class selfstudy_369 {
    static int num = 1;
    static boolean isWin = false;
    static boolean isPlay = true;

    public static void main(String[] args) {
        /* 설명. 변수 초기화 */
        Scanner sc = new Scanner(System.in);
        String players_answer = null;
        int computers_condition = 0;
        String answer = null;
        String nowNum = null;
        boolean turn = false;       // turn = true 플레이어턴, turn = false 컴퓨터턴
        int stack = 0;
        System.out.println("369 게임에 오신것을 환영합니다.");

        /* 설명. 턴 정하기 */
        System.out.println("선공하시겠습니까, 후공하시겠습니까? (선공 true, 후공 false):");
        turn = sc.nextBoolean();

        if (turn) {
            System.out.println("플레이어가 선공입니다.");
        } else {
            System.out.println("플레이어가 후공입니다.");
        }

        /* 설명. 369게임 시작 */
        System.out.println("369 게임을 시작합니다...");
        sc.nextLine();                  // 개행 문자 제거

        do {
            stack = 0;                  // stack 초기화
            nowNum = Integer.toString(num);     // num을 문자열로 변환
            stack = getStack(nowNum, stack);    // 현재 "짝"이 있는지 검사.

            /* 설명. 현재 stack(짝의 개수)가 0 이라면 현재 i의 값을 반환*/
            if (stack == 0) answer = nowNum;
            else answer = return_answer(stack);

            if (turn) {                 // 플레이어 차례
                System.out.print("\n 당신의 차례...\n당신의 답은?: ");
                players_answer = sc.nextLine();
                compare_answer(players_answer, answer);

                turn = false;
            } else {                    // 컴퓨터 차례
                System.out.print("\n컴퓨터의 차례...\n 컴퓨터의 답은?: ");
                /* 설명. 컴퓨터의 상태. 약 5%의 확률로 컴퓨터가 오답을 반환 */
                computers_condition = num + (int) Math.round(Math.random() * 0.1 + 0.405);

                /* 설명. 컴퓨터의 condition이 정상적이라면 정답을 반환. 비정상적이라면 오답을 반환 */
                if (computers_condition == num) {
                    if (stack == 0) System.out.println(computers_condition);
                    else System.out.println(answer);
                    compare_answer(answer, answer);
                }
                else {
                    System.out.println(computers_condition);
                    compare_answer(Integer.toString(computers_condition), answer);
                }
                turn = true;
            }
            num++;                    // num 증가
            if (num > 100) isPlay = false;
        } while (isPlay);

        if (turn) System.out.println("플레이어 승리!!!");
        else System.out.println("플레이어 패배...!!");
    }

    private static int getStack(String nowI, int stack) {
        /* 설명. 3, 6, 9가 있는 지 문자별로 검사 후, 그만큼 stack으로 "짝"의 개수를 반환*/
        for (int j = 0; j < nowI.length(); j++) {
            if (nowI.charAt(j) == '3' || nowI.charAt(j) == '6' || nowI.charAt(j) == '9') {
                stack++;
            }
        }
        return stack;
    }

    private static void compare_answer(String users_answer, String answer) {
        if (Objects.equals(users_answer, answer)) {
            System.out.println("정답!!! " + answer);

        } else {
            System.out.println("땡!!! 정답은 (" + num + ") " + answer);
            isWin = true;
            isPlay = false;
        }
    }

    private static String return_answer(int stack) {
        String answer = "";
        for (int j = 0; j < stack; j++) {
            answer += "짝";
        }
        return answer;
    }


}
