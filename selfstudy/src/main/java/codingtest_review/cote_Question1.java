package codingtest_review;

import java.util.Arrays;

public class cote_Question1 {
    public static void main(String[] args) {
        boolean flag = false;
        int studentsNum = 10;
        int[] nums = new int[studentsNum-1];
        int absent_stuNum = (int) (Math.random() * studentsNum);
        for (int i = 0; i < studentsNum; i++) {
            if (i == absent_stuNum) {
                flag = true;
                nums[i] = i+2;
                continue;
            }
            if (flag){
                nums[i-1] = i+1;
            }
            else{
                nums[i] = i+1;
            }
        }
        System.out.println(Arrays.toString(nums));
        int user_answer = absent_student(nums);
        System.out.println("user_answer = " + user_answer);
        System.out.println(isTrue(absent_stuNum + 1, user_answer));

    }

    private static boolean isTrue(int answer, int user_answer) {
        return (answer == user_answer);
    }

    private static int absent_student(int[] nums) {
        int answer = 0;
        return answer;
    }
}
