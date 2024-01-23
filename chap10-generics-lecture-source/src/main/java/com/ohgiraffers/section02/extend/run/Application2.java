package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해할 수 있다. */
        WildCardFarm wildCardFarm = new WildCardFarm();

        /* 필기. 방법-1 */
//        RabbitFarm<Rabbit> rabbitFarm = new RabbitFarm<>();
//        rabbitFarm.setAnimal(new Rabbit());
//
//        RabbitFarm<Bunny> bunnyRabbitFarm = new RabbitFarm<>(new Bunny());
//        RabbitFarm<DrunkenBunny> drunkenBunnyRabbitFarm = new RabbitFarm<>(new DrunkenBunny());
//
//        wildCardFarm.anyType(rabbitFarm);
//        wildCardFarm.anyType(bunnyRabbitFarm);
//        wildCardFarm.anyType(drunkenBunnyRabbitFarm);
//
////        wildCardFarm.extendsType(rabbitFarm);
//        wildCardFarm.extendsType(bunnyRabbitFarm);
////        wildCardFarm.extendsType(drunkenBunnyRabbitFarm);
//
//        wildCardFarm.superType(rabbitFarm);
//        wildCardFarm.superType(bunnyRabbitFarm);
////        wildCardFarm.superType(drunkenBunnyRabbitFarm);


        /* 필기. 방법-2 */
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
