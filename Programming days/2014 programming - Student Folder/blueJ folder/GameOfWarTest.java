import java.util.*;

/**
 * The test class GameOfWarTest.
 *
 * @author  
 * @version 
 */
public class GameOfWarTest extends junit.framework.TestCase
{
	public void testGameOfWar01()
	{
	    for (int kjasdkljdf = 0; kjasdkljdf < 4; kjasdkljdf++)
	    {
    	    Card card1 = new Card("2", "spade");
    		Card card2 = new Card("4", "club");
    		Card card3 = new Card("jack", "diamond");
    		Card card4 = new Card("5", "heart");
    		Card card5 = new Card("2", "spade");
    		Card[] handA = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand1 = new ArrayList<Card>();
    		for (Card c : handA)
    		   hand1.add(c);
    		Player p1 = new Player("you", hand1);
    
    		card1 = new Card("5", "club");
    		card2 = new Card("7", "diamond");
    		card3 = new Card("queen", "diamond");
    		card4 = new Card("9", "heart");
    		card5 = new Card("10", "spade");
    		Card[] handB = {card1, card2, card3, card4, card5};
    		ArrayList<Card> hand2 = new ArrayList<Card>();
    		for (Card c : handB)
    		   hand2.add(c);
    		Player p2 = new Player("me", hand2);
    		Player[] ps = {p1, p2};
    		GameOfWar game = new GameOfWar(ps);
            assertEquals("me", game.findGameWinner());
        }
	}
}