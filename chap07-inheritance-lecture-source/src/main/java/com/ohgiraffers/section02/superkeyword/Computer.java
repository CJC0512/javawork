package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;         // 연산장치
    private int hdd;            // 하드
    private int ram;            // 램
    private String operationSystem; // 운영체제

    public Computer() {
        super();      // 안 적으면 JVM이 자동으로 작성해준다.
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드까지 모두 초기화하는 생성자 호출함...");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                "} " + super.toString();
        /* 필기.
        *   부모 측의 특정 값만 가져오려면 private으로 보호되어 있기에,
        *   - super.getCode()(=부모 클래스에서 접근)
        *   - this.getCode()(=자식 클래스에서 상속받은 메소드로 접근)
        *   두 가지 방법과 같이 getter를 활용하여 가져와야 한다.
        * */

    }
}
