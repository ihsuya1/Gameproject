/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import gameproject.Card;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author DC
 */
public class CardTest {
    
    public CardTest() {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test
    public void testNumericValueForAce() {
        Card card = new Card("Hearts", "A");
        assertEquals(14, card.getNumericValue(), "Ace should be 14");
    }

    @Test
    public void testNumericValueForKing() {
        Card card = new Card("Spades", "K");
        assertEquals(13, card.getNumericValue(), "King should be 13");
    }

    @Test
    public void testNumericValueForSeven() {
        Card card = new Card("Clubs", "7");
        assertEquals(7, card.getNumericValue(), "7 should be 7");
    }

    @Test
    public void testNumericValueForQueen() {
        Card card = new Card("Diamonds", "Q");
        assertEquals(12, card.getNumericValue(), "Queen should be 12");
    }
}
