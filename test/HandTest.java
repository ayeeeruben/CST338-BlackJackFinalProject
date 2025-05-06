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