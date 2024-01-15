package array_lecture_source;

public class selfstudy_369ForPC {
    public static void main(String[] args) {
        int num = 1;
        String nowNum = null;
        int stack = 0;

        while (num < 100000) {
            stack = 0;
            nowNum = Integer.toString(num); // i를 문자열로 변환
            /* 설명. nowI의 길이만큼 각 자릿수의 숫자(문자)를 가져와 3, 6, 9와 일치하는지 확인.*/
            for (int i = 0; i < nowNum.length(); i++) {
                if (nowNum.charAt(i) == '3' || nowNum.charAt(i) == '6' || nowNum.charAt(i) == '9') {  // 일치한다면 짝의 개수(stack)을 증가
                    stack++;
                }
            }
            /* 설명. 현재 num의 값과 조건에 맞는 "짝" 출력 */
            System.out.println("(" + nowNum + ")" + return_answer(stack));
            num++;
        }
    }
    
    /* 설명. 짝의 개수(stack)만큼 짝을 붙여서 문자열을 반환*/
    private static String return_answer(int stack) {
        String answer = "";
        for (int i = 0; i < stack; i++) {
            answer += "짝";
        }
        return answer;
    }
}
