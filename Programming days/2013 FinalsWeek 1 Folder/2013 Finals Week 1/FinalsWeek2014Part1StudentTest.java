import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class FinalsWeek2014Part1StudentTest extends junit.framework.TestCase
{
   public void testLongestPalindrome01()
   {
      LongestPalindrome pal = new LongestPalindrome("racecar");
      assertEquals("racecar", pal.getLongestPalindrome());

      pal = new LongestPalindrome("dsffsdg kjab %Bkj.  abcbabCdcbaqwerewq.");
      assertEquals("abCdcba", pal.getLongestPalindrome());

      pal = new LongestPalindrome("Madam, I'm Adam");
      assertEquals("MadamImAdam", pal.getLongestPalindrome());
   }
   public void testAutomorphicNumber01()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      assertEquals(false, h.isAutomorphicNumber(7));
      assertEquals(true, h.isAutomorphicNumber(5));
      assertEquals(true, h.isAutomorphicNumber(76));
      assertEquals(false, h.isAutomorphicNumber(11));

      int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 25, 26, 75, 76};
      ArrayList<Integer> sol = new ArrayList<Integer>();
      sol.add(new Integer(1));
      sol.add(new Integer(5));
      sol.add(new Integer(6));
      sol.add(new Integer(25));
      sol.add(new Integer(76));
      assertEquals(sol, h.getAutomorphicNumberFromArray(numbers));
   }

   public void testClimbThis01()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("BOY");
      words.add("TOY");
      words.add("TOE");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("HEAD");
      words.add("HEAL");
      words.add("VEAL");
      words.add("VEIL");
      words.add("VAIL");
      words.add("TAIL");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("CAME");
      words.add("CARE");
      words.add("CANT");
      words.add("WENT");
      assertEquals(false, ladder.isLadder(words));
   }

}