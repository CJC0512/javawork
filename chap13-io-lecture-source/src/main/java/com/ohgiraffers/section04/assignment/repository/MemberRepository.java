package com.ohgiraffers.section04.assignment.repository;

import com.ohgiraffers.section04.assignment.aggregate.BloodType;
import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.stream.MyObjectOutput;

import java.io.*;
import java.util.ArrayList;

/* 설명. 데이터와 입출력을 위해 만들어지며, 성공 실패 결과를 반환하는 클래스 */
public class MemberRepository {
    private final String filePath = "src/main/java/com/ohgiraffers/section04/assignment/db/memberDB.dat";
    private ArrayList<Member> memberList = new ArrayList<>();

    /* 설명. 프로그램이 켜지자 마자(MemberRepository()가 실행되자마자) 파일에 Dummy 데이터 추가 및 입력받기 */
    public MemberRepository() {
        ArrayList<Member> members = new ArrayList<>();

        /* 설명. 회원가입 기능 추가 후 이제는 파일이 기존에 존재하면(처음이 아니므로) 회원 3명으로 초기화 하기를 하지 않는다. */
        File file = new File(filePath);
        if (!file.exists()) {
            members.add(new Member(1, "user01", "pass01", 20,
                    new String[]{"발레", "수영"}, BloodType.A));
            members.add(new Member(2, "user02", "pass02", 10,
                    new String[]{"게임", "영화 시청"}, BloodType.B));
            members.add(new Member(3, "user03", "pass03", 15,
                    new String[]{"음악감상", "독서", "망상"}, BloodType.O));

            saveMembers(members);
        }
        loadMembers();

//        System.out.println("===== repository에서 회원정보 다 읽어왔는지 확인 ");
//        for (Member m : memberlist){
//            System.out.println(m);
//        }
    }

    /* 설명. 회원이 담긴 ArrayList를 던지면 파일에 출력하는 기능 */
    private void saveMembers(ArrayList<Member> members) {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));

            /* 설명. 넘어온 회원 수만큼 객체 출력하기 */
            for (Member m : members) {
                oos.writeObject(m);
            }

            oos.flush();                // write 시, 습관적으로 flush 해줄 것!!!!!
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {                      // catch에서 return이 발생해도, finally는 실행된다. 즉, 무조건 실행되는 부분.
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* 설명. 파일로부터 회원 객체들을 입력받아 memberList에 쌓기 */
    private void loadMembers() {

        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(filePath)))) {

            /* 설명. 파일로부터 모든 회원 정보를 읽어 memeberList에 추가(add) */
            while (true) {
                memberList.add((Member) (ois.readObject()));
            }
        } catch (EOFException e) {
            System.out.println("회원 정보 모두 로딩됨...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* 설명. */
    public ArrayList<Member> selectAllMembers() {
        return memberList;
    }

    public Member selectMember(int memNo) {
        for (Member m : memberList) {
            if (m.getMemNo() == memNo) return m;
        }
        return null;
    }

    public int selectLastMemberNo() {
//        Member latestMember = memberList.get(memberList.size() -1);     // 가장 최근에 가입한 회원
//        return latestMember.getMemNo();                                 // 그 회원의 번호
        return memberList.get(memberList.size() - 1)             // 한 줄 코딩도
                .getMemNo();                                    // 이렇게 주석을 달 수 있다.
    }

    /* 설명. 기존 회원(객체)에 이어서 파일 출력을 하고 추가한 객체의 수를 반환 (feat.DML 작업의 결과는 int) */
    public int registMember(Member member){
        return saveMember(member);
    }
    /* 설명. 객체 출력을 할 예정인데 기존 ObjectOutputStream 대신 새로 정의한 스트림으로 회원 한명 출력해서 int 반환하기 (feat.이어쓰기) */
    private int saveMember(Member member) {
        try (MyObjectOutput moo = new MyObjectOutput(new BufferedOutputStream(new FileOutputStream(filePath, true)))) {

            /* 설명. 파일로 객체 하나 출력하기 */
            moo.writeObject(member);

            /* 설명. repository의 memberList에도 추가 */
            memberList.add(member);

            moo.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 1;
    }

    public int deleteMember(int memNo) {
        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getMemNo() == memNo){          // 지울려는 회원과 같은 회원 번호인 index 찾기

                /* 설명. 프로그램 상에서 회원을 관리하는 memberList 뿐 아니라 DB(회원 파일)도 같이 적용되게 함 */
                memberList.remove(i);
                saveMembers(memberList);
                return 1;
            }
        }
        return 0;
    }
}
