package Fig7_9;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckofCards myDeckOdCards = new DeckofCards();
        myDeckOdCards.shuffle();

        for (int i = 1; i < 52; i++) {
            System.out.printf("%-19s", myDeckOdCards.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
