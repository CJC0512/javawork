package array_lecture_source;

import java.util.Objects;
import java.util.Scanner;

public class selfstudy_369ForPC {
    static int i = 1;
    public static void main(String[] args) {
        String nowI = null;
        boolean turn = false;       // turn = true 플레이어턴, turn = false 컴퓨터턴
        int stack = 0;

        while (i < 100000) {
            stack = 0;
            nowI = Integer.toString(i); // i를 문자열로 변환

            for (int j = 0; j < nowI.length(); j++) {
                if (nowI.charAt(j) == '3' || nowI.charAt(j) == '6' || nowI.charAt(j) == '9') {
                    stack++;
                }
            }
            /* 설명. 현재 stack(짝의 개수)가 0 이라면 현재 i의 값을 반환*/
            System.out.println("(" + nowI + ")" + return_answer(stack));
            i++;
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
