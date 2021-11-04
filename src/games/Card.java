package games;

public class Card {
    String suit;
    String value;
    int numValue;

    public Card(Card card){
        this.suit = card.suit;
        this.value = card.value;
        this.numValue = card.numValue;
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
