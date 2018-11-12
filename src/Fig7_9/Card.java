package Fig7_9;

public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuite) {
        this.face = cardFace;
        this.suit = cardSuite;
    }

    public String toString() {
        return face + " of " + suit;
    }

}
