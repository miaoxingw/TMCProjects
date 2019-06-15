import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Hand implements Comparable<Hand> {

    private List<Card> cards = new ArrayList<Card>();

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card: cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }

    private int sumOfTheValues() {
        int value = 0;

        for (Card card: cards) {
            value += card.getValue();
        }

        return value;
    }

    @Override
    public int compareTo(Hand hand) {
        return sumOfTheValues() - hand.sumOfTheValues();
    }
}
