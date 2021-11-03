package games;

import java.util.Arrays;
import java.util.Random;

public class Card {
    String suit;
    String value;
    Card[] cards = CardsArray.findAll();

    public Card(String cardSuit, String cardValue){
        this.suit = cardSuit;
        this.value = cardValue;
    }

    public Card getRandomCard(){
        Random random = new Random();
        int number = random.nextInt(52) + 1;
        return cards[number];
    }
}
