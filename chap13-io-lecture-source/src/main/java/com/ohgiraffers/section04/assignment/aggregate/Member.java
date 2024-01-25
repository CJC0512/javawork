package com.ohgiraffers.section04.assignment.aggregate;         // 애그리것.

/* 설명. 객체 입출력의 대상이 되는 클래스이자 엔티티 개념의 클래스(DB에 저장된 데이터를 담거나 넣을 데이터를 담을 객체) */

import java.io.Serializable;
import java.util.Arrays;

public class Member implements Serializable {           // 객체 입출력을 위해 Serializable implements
    private int memNo;
    private String id;
    private String pwd;
    private int age;
    private String[] hobbies;       // 회원 취미들
    private BloodType BloodType;     // 혈액형


    /* 설명. 엔티티 클래스는 Setter는 꼭 필요한 것만 만든다. */

    public Member() {
    }

    public Member(int memNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        BloodType = bloodType;
    }

    public int getMemNo() {
        return memNo;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public BloodType getBloodType() {
        return BloodType;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memNo=" + memNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", BloodType=" + BloodType +
                '}';
    }
}
