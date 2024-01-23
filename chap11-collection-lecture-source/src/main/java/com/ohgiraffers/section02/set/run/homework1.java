package com.ohgiraffers.section02.set.run;

import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) {
        /* 설명. [과제] 중복되지 않는 번호를 발생시켜 로또 번호 발생기 만들기(Set 사용하지 않고) */
        System.out.println("과제 수행");

        int[] nums = new int[6];
        int indexNum = 0;
        int newNum;

        /* 설명. 중복 없는 숫자 뽑기*/
        while (nums[indexNum] == 0) {
            newNum = ((int) (Math.random() * 45) + 1);
            for (int j = 0; j < 6; j++) {
                if (newNum == nums[j]) {
                    break;
                }
                if (j == 5) {
                    nums[indexNum] = newNum;
                    indexNum++;
                    break;
                }
            }
            if (indexNum >= 6) {
                break;
            }
        }

        /* 설명. 오름차순 정렬 */
        int[] copyNums = nums.clone();
        int[] newLotto = new int[6];

        for (int i = newLotto.length - 1; i >= 0; i--) {
            for (int j = copyNums.length - 1; j >= 0; j--) {
                if (newLotto[i] < copyNums[j]){
                    newLotto[i] = copyNums[j];
                    indexNum = j;
                }
            }
            copyNums[indexNum] = 0;
        }

        /* 설명. 오름차순 정렬 후 출력 */
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("newLotto = " + Arrays.toString(newLotto));
    }
}
