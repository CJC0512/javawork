package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Application2 {
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);

        /* 필기. delim(delimiter)는 명시 안 해도 공백(스페이스바)을 기준으로 분할한다.*/
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.valueOf(st.nextToken());        // 동전의 종류(수)
        int K = Integer.valueOf(st.nextToken());        // 계산할 금액(가치의 합)

        int[] coin = new int[N];                        /// 동전의 종류에 대한 배열

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.valueOf(br.readLine());
        }

        int count = 0;

        /* 설명. 수업 함수 */
        System.out.println("수업 함수 실행");
        for (int i = N - 1; i >= 0; i--) {          // 큰 금액의 동전부터 처리될 수 있도록 반복문 작성
            if (coin[i] <= K) {
                count += (K / coin[i]);

                /* 설명. K에서 coin[i]번째를 처리하고 (갯수 세고) 남는 나머지 금액을 의미 */
                K = K % coin[i];
            }
        }

        /* 설명. 나의 함수. 결론적으론 조건문과 연산자 정도만 다르다. */
//        System.out.println("나의 함수 실행");
//        for (int i = N - 1; i >= 0; i--) {            // 큰 금액의 동전부터 처리될 수 있도록 반복문 작성
//            if (K / coin[i] >= 1) {
//                count += (K / coin[i]);
//                K %= coin[i];
//            }
//        }



        return count;
    }


}
