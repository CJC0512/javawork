package com.ohgiraffers.section03.filterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  내부적으로 버퍼를 활용해서 입출력 성능을 향상 시킨다.
         *  추가적인 메소드가 제공된다.
        * */

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            bw.write("드디어 세종대왕님이 만족하시겠네!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
