import static org.junit.jupiter.api.Assertions.*;

class HandTest {
    Hand h1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        h1 = new Hand();
        h1.getHit(new Card(1, "Hearts"));
        h1.getHit(new Card(11, "Diamonds"));
        h1.getHit(new Card(5, "Spades"));
    }

    @org.junit.jupiter.api.Test
    void getHit() {
        int originalSize = h1.getCards().size();
        h1.getHit(new Card(2, "Clubs"));
        assertEquals(originalSize + 1, h1.getCards().size());
        assertEquals("Clubs", h1.getCards().get(originalSize).getSuit());
    }

    @org.junit.jupiter.api.Test
    void getCards() {
        assertEquals(3, h1.getCards().size());
        assertEquals("Hearts", h1.getCards().get(0).getSuit());
    }

    @org.junit.jupiter.api.Test
    void reset() {
        h1.reset();
        assertEquals(0, h1.getCards().size());
    }

    @org.junit.jupiter.api.Test
    void calculateScoreAce() {
        assertEquals(16, h1.calculateScore());
    }

    @org.junit.jupiter.api.Test
    void hasBlackJack() {
        assertFalse(h1.hasBlackJack()); // score: Ace (11) + 10 + 5 = 26, then reduce Ace to 1, so total = 16
                                        // 16 not blackJack score
        Hand blackjackHand = new Hand();
        blackjackHand.getHit(new Card(1, "Hearts"));
        blackjackHand.getHit(new Card(10, "Spades"));
        assertTrue(blackjackHand.hasBlackJack());   // valid blackJack score: Ace (11) + 10 = 21

    }
}