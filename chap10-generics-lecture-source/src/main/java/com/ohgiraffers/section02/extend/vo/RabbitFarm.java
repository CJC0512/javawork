package com.ohgiraffers.section02.extend.vo;

public class RabbitFarm <T extends Rabbit> {        // Rabbit 이거나 Rabbit의 자손들만 입장 가능하다는 의미
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
