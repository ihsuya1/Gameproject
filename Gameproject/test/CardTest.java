import gameproject.Card;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test class for Card
 * 
 * This class tests the getNumericValue() method of the Card class.
 * 
 * Design Principles:
 * - Single Responsibility: Each test method focuses on a single card value.
 * - Encapsulation: The card value is tested through public methods.
 */
public class CardTest {

    /**
     * Test case: Validate that Ace returns numeric value 14.
     */
    @Test
    public void test_Numeric_Value_For_Ace() {
        Card card = new Card("Hearts", "A");
        assertEquals(14, card.getNumericValue());
    }

    /**
     * Test case: Validate that King returns numeric value 13.
     */
    @Test
    public void test_Numeric_Value_For_King() {
        Card card = new Card("Spades", "K");
        assertEquals(13, card.getNumericValue());
    }

    /**
     * Test case: Validate that Queen returns numeric value 12.
     */
    @Test
    public void test_Numeric_Value_For_Queen() {
        Card card = new Card("Diamonds", "Q");
        assertEquals(12, card.getNumericValue());
    }

    /**
     * Test case: Validate that number card (7) returns numeric value 7.
     */
    @Test
    public void test_Numeric_Value_For_Seven() {
        Card card = new Card("Clubs", "7");
        assertEquals(7, card.getNumericValue());
    }
}
