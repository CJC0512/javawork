package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. 트랜잭션 성공실패 여부 확인 및 회원 관련 비즈니스 로직 처리하는 클래스 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public void selectAllMembers() {
        ArrayList<Member> selectedMembers = mr.selectAllMembers();
//        System.out.println("===== service 까지 잘 반환되어 오나 확인 =====");
        for(Member m : selectedMembers){
            System.out.println(m);
        }
    }
}
