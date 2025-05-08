import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {
    Hand h1;
    Deck d1;
    Random r;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        r = new Random(1);
        d1 = new Deck(r);
        h1 = new Hand(d1);
    }

    @org.junit.jupiter.api.Test
    void getHit() {
        Card c1 = h1.getHit();
        assertEquals(new Card(9, "Spades"), c1);
    }

    @org.junit.jupiter.api.Test
    void getCards() {
    }

    @org.junit.jupiter.api.Test
    void reset() {
    }

    @org.junit.jupiter.api.Test
    void calculateScoreAce() {
        assertEquals(16, h1.calculateScore());
    }

    @org.junit.jupiter.api.Test
    void hasBlackJack() {
    }
}