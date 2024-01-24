package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) {

        /* 수업목표. File 클래스의 사용 용법을 이해할 수 있다. */
        File file = new File("src/main/java/com/ohgiraffers/section01/file/testdir/test.txt");
//        file.mkdir();
        try {
            boolean bf = file.createNewFile();
            System.out.println(bf);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
