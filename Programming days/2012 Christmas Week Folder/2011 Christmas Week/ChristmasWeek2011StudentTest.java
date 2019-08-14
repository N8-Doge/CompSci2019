import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class ChristmasWeek2011StudentTest extends junit.framework.TestCase
{
   public void testFunctionsGoneWild01()
   {
      assertEquals(91, FunctionsGoneWild.function_one(10));
      assertEquals(true, Math.abs(Math.abs(-26.0 - FunctionsGoneWild.function_two(-5))) < 0.05);
      assertEquals(true, Math.abs(2.0439481 - FunctionsGoneWild.function_three(1, 1, 1))<0.5);
      assertEquals(true, Math.abs(0.0 - FunctionsGoneWild.function_four(2, 1)) < 0.5);
      assertEquals(true, Math.abs(1941.227076 - FunctionsGoneWild.function_five(54321, 123.7)) < 0.5);
      assertEquals(true, Math.abs(10.75125008 - FunctionsGoneWild.function_six(2.3, 1, 3.0)) < 0.5);
   }

   public void testLongestPalindrome01()
   {
      LongestPalindrome pal = new LongestPalindrome("racecar");
      assertEquals("racecar", pal.getLongestPalindrome());

      pal = new LongestPalindrome("dsffsdg kjab %Bkj.  abcbabCdcbaqwerewq.");
      assertEquals("abCdcba", pal.getLongestPalindrome());

      pal = new LongestPalindrome("Madam, I'm Adam");
      assertEquals("MadamImAdam", pal.getLongestPalindrome());
   }
   
   public void testZerosAndOnes01()
   {
      ArrayList<Integer> sol = ZerosAndOnes.getNumbers(6, 3);
      int[] ans1 = { 42 };
      assertEquals(1, sol.size());
      for (int i = 0; i < ans1.length; i++)
         assertEquals(true, sol.contains(ans1[i]));

      sol = ZerosAndOnes.getNumbers(6, 4);
      int[] ans2 = { 32+16+8, 32+16+4, 32+8+4 };
      assertEquals(ans2.length, sol.size());
      for (int i = 0; i < ans2.length; i++)
         assertEquals(true, sol.contains(ans2[i]));

      sol = ZerosAndOnes.getNumbers(6, 2);
      int[] ans3 = { 32+16+8, 32+16+4, 32+8+4, 32+16+2, 32+8+2, 32+4+2 };
      assertEquals(ans3.length, sol.size());
      for (int i = 0; i < ans3.length; i++)
         assertEquals(true, sol.contains(ans3[i]));

      sol = ZerosAndOnes.getNumbers(8, 8);
      int[] ans4 = { 240, 232, 216, 184 };
      assertEquals(ans4.length, sol.size());
      for (int i = 0; i < ans4.length; i++)
         assertEquals(true, sol.contains(ans4[i]));
   }

   public void testGameSet01()
   {
      Card c1 = new Card (1, "square" , "red", "clear");
      Card c2 = new Card (2, "square" , "red", "clear");
      Card c3 = new Card (3, "square" , "red", "clear");
      Card c4 = new Card (1, "square" , "blue", "clear");

      assertEquals(true, GameSet.isSet(c1, c2, c3));
      assertEquals(false, GameSet.isSet(c1, c2, c4));

      assertEquals(c3, GameSet.makeSet(c1, c2));

      Card[] temp = {  new Card(2, "square", "red", "dashed"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
                        new Card(3, "circle", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(false, GameSet.containsSet(temp));

      Card[] temp1 = {  new Card(2, "square", "red", "dashed"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
                        new Card(3, "square", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(true, GameSet.containsSet(temp1));
   }

   public void testTrainTracks01()
   {
      int k = 0;
      int [][] tracks= { {3, 1, 3, 2, 3}, {3, 1, 1, 1, 2}, {1, 1, 3, 2, 1} };
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(15, sol.size());
      String[] blocks = {"A1", "A2", "A3", "B3", "C3", "C4", "B4", "A4", "A5", "B5", "B4", "B3", "B2", "B1", "A1"};
      for(String b : blocks)
      {
         assertEquals(b, sol.get(k));
         k++;
      }
   }

}