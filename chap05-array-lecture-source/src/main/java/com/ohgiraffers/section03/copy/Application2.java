package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
        /* 필기.
         *   깊은 복사를 하는 방법은 4가지가 있다.
         *   1. for문을 이용한 동일한 인덱스 값을 일일이 복사
         *   2. Object의 clone()을 이용한 복사 (사용 빈도 높음!!!)
         *   3. System의 arraycopy()를 이용한 복사
         *   4. Arrays의 copyOf()를 이용한 복사
         * */

        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");

        /* 목차. 1. for문 활용 */
        int[] copyArr1 = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1, "for문을 사용한 사본");

        /* 목차. 2. clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 사용한 사본");

        /* 목차. 3. arraycopy()를 이용한 복사 */
        /* 설명. originArr을 0부터 originArr.length까지를 copyArr3의 3번 index부터 복사해 넣는다. */
        int[] copyArr3 = new int[originArr.length + 3];
        System.arraycopy(originArr,0, copyArr3, 3, originArr.length);
        print(copyArr3, "arraycopy()를 사용한 사본");

        /* 목차. 4. copyOf()를 이용한 복사 */
        /* 설명. originArr의 처음부터 2번째(2개)까지 복사해 넣는다. */
        int[] copyArr4 = Arrays.copyOf(originArr, 2);
        print(copyArr4, "copyOf()를 사용한 사본");

    }

    private static void print(int[] arr, String str) {      // originArr -> arr로 얕은 복사가 발생
        System.out.println("===============" + str + "===============");

        /* 설명. 전달받은 배열의 주소 값 출력 */
        System.out.println("넘어온 배열의 hashCode: " + arr.hashCode());

        /* 설명. 전달받은 배열의 값 출력 */
        System.out.println(Arrays.toString(arr));
    }
}
