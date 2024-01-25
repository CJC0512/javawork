package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.DTO.MemberDTO;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 객체단위 입출력 보조스트림을 이해하고 활용할 수 있다. */
        MemberDTO[] memArr = new MemberDTO[3];
        memArr[0] = new MemberDTO("user01", "pwd01", "홍길동", "hong777@ohgiraffers.com", 25, '남');
        memArr[1] = new MemberDTO("user02", "pwd02", "유관순", "korea31@ohgiraffers.com", 16, '여');
        memArr[2] = new MemberDTO("user03", "pwd03", "이순신", "leesoonsin@ohgiraffers.com", 22, '남');

        ObjectOutputStream objOut = null;


        try {
            objOut = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));

            /* 필기.
             *   그냥 memArr[0] 할 경우, NotSerializabelException 오류가 발생. (데이터의 길이가 너무 김)
             *   따라서 해당 클래스(MemberDTO)에 Serializable interface를 implements 해줘야함.
             * */
            for (int i = 0; i < memArr.length; i++) {
                objOut.writeObject(memArr[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objOut != null) objOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* 설명. 출력이 된 객체를 입력받아 확인하기 위한 새로운 MemberDTO[] 생성 */
        MemberDTO[] inputMembers = new MemberDTO[memArr.length];        // memArr.length = 3
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));
            int i = 0;
            while (true) {
//                System.out.println((MemberDTO) (ois.readObject()));
                inputMembers[i] = (MemberDTO) (ois.readObject());       // 소괄호 주의할 것.
                i++;
            }
        } catch (EOFException e) {
            System.out.println("객체 단위 파일 입력 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* 설명. 입력받아 새로운 MemberDTO[]에 저장된 회원들 확인 */
        for (MemberDTO eachMem : inputMembers){
            System.out.println(eachMem);
        }
    }
}
