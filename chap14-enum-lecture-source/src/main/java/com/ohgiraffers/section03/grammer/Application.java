package com.ohgiraffers.section03.grammer;

public class Application {
    public static void main(String[] args) {
        UserRole admin = UserRole.ADMIN;
        System.out.println(admin.toString());
        System.out.println(admin.getNameToLowerCase());
    }
}
