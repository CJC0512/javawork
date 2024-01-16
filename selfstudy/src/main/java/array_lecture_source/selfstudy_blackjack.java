package array_lecture_source;

import java.util.Random;

public class selfstudy_blackjack {
    static String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
    static String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

    public static void main(String[] args) {
        /* 수업목표. 블랙잭을 구현해보자. */
        /* 필기. card는 최대 3장까지만 허용한다. */
        String[] card = new String[11];
        String card1 = roll();
    }

    private static String roll() {
        int randomNum = new Random().nextInt(13);
        int randomShape = new Random().nextInt(4);

        return (shape[randomShape] + " " + cardNumbers[randomNum]);
    }


}
