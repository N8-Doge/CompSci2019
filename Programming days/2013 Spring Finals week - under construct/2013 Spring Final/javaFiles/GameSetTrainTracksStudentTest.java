import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class GameSetTrainTracksStudentTest extends junit.framework.TestCase
{
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