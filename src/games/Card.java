package games;

import java.util.Random;

public class Card {
    String suit;
    String value;
    int numValue;

    public Card(){}

    public Card(Card randomCard){
        this.suit = randomCard.suit;
        this.value = randomCard.value;
        this.numValue = randomCard.numValue;
    }

    public Card(String cardSuit, String cardValue, int numValue){
        this.suit = cardSuit;
        this.value = cardValue;
        this.numValue = numValue;
    }

    public String getCardInfo(){
        return value + " " + suit;
    }


}
