public class Main {

    public static void main(String[] args) {
        // Testing Card
        Card card1 = new Card(2, Card.SPADES);
        Card card2 = new Card(2, Card.CLUBS);
        Card card3 = new Card(14, Card.CLUBS);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        System.out.println(card1.compareTo(card2));
        System.out.println(card1.compareTo(card3));

        // Testing Hand
        Hand hand1 = new Hand();

        hand1.add(new Card(2, Card.SPADES));
        hand1.add(new Card(14, Card.CLUBS));
        hand1.add(new Card(12, Card.HEARTS));
        hand1.add(new Card(2, Card.CLUBS));

        hand1.sort();
        hand1.print();

        Hand hand2 = new Hand();

        hand2.add( new Card(11, Card.DIAMONDS) );
        hand2.add( new Card(11, Card.CLUBS) );
        hand2.add( new Card(11, Card.HEARTS) );

        int comparison = hand1.compareTo(hand2);

        if ( comparison < 0 ) {
            System.out.println("the most valuable hand contains the cards");
            hand2.print();
        } else if ( comparison > 0 ){
            System.out.println("the most valuable hand contains the cards");
            hand1.print();
        } else {
            System.out.println("the hands are equally valuable");
        }

        // Testing SortAgainstSuitAndValue
        Hand hand = new Hand();

        hand.add(new Card(12, Card.HEARTS));
        hand.add(new Card(4, Card.CLUBS));
        hand.add(new Card(2, Card.DIAMONDS));
        hand.add(new Card(14, Card.CLUBS));
        hand.add(new Card(7, Card.HEARTS));
        hand.add(new Card(2, Card.CLUBS));

        hand.sortAgainstSuit();
        hand.print();
    }
}
