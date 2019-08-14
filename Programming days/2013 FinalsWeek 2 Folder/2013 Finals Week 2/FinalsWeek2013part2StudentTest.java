import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class FinalsWeek2013part2StudentTest extends junit.framework.TestCase
{
   public void testMiningCenter01()
   {
      ArrayList<Site> mines = new ArrayList<Site>();
      mines.add(new Site(10, 0));
      mines.add(new Site(6,7));
      mines.add(new Site(-6,8));
      mines.add(new Site(-9,-8));
      MiningCenter mc = new MiningCenter(mines);
      assertEquals(new Site(-1,-1), mc.getCenter());

      ArrayList<Site> mines1 = new ArrayList<Site>();
      mines1.add(new Site(0, 0));
      mines1.add(new Site(0, 5));
      mines1.add(new Site(5, 0));
      MiningCenter mc1 = new MiningCenter(mines1);
      assertEquals(new Site(0,0), mc1.getCenter());

      ArrayList<Site> mines2 = new ArrayList<Site>();
      mines2.add(new Site(1, -5));
      mines2.add(new Site(-10, 5));
      mines2.add(new Site(-2, 5));
      mines2.add(new Site(10, 10));
      mines2.add(new Site(5, -5));
      MiningCenter mc2 = new MiningCenter(mines2);
      assertEquals(new Site(2,5), mc2.getCenter());
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

   public void testHPCipher01()
   {
      HPCipher hp = new HPCipher("P JVKL AOLYLMVYL P HT");
      assertEquals(4, hp.letterDifference("A", "E"));
      assertEquals(2, hp.letterDifference("Z", "B"));
      assertEquals("I CODE THEREFORE I AM", hp.decode("IA"));
      assertEquals("I CODE THEREFORE I AM", hp.decode("DETH"));

      hp = new HPCipher("HIGSHI QI");
      assertEquals("DECODE ME", hp.decode("EM"));
      assertEquals("DECODE ME", hp.decode("DE"));
    }


   public void testTypewriter01()
   {
      TypeWriter tw = new TypeWriter();
      assertEquals(true, tw.usesLeftHand("am"));
      assertEquals(true, tw.usesRightHand("am"));
      assertEquals(false, tw.usesLeftHand("m"));
      assertEquals(false, tw.usesRightHand("a"));

      assertEquals(true, tw.usesOnlyLeftHand("stewardesses"));
      assertEquals(false, tw.usesOnlyLeftHand("stewardessesy"));

      assertEquals(true, tw.usesOnlyRightHand("monimolimnion"));
      assertEquals(false, tw.usesOnlyRightHand("amonimolimnion"));
      assertEquals(true, tw.usesBothLeftAndRightHand("am"));

      assertEquals(true, tw.usesTopRow("1 fish"));
      assertEquals(true, tw.usesMiddleRow("amonimolimnion"));
      assertEquals(true, tw.usesBottomRow("amonimolimnion"));

      assertEquals(false, tw.usesTopRow("1 fsh"));
      assertEquals(false, tw.usesMiddleRow("monimoimnion"));
      assertEquals(false, tw.usesBottomRow("atoil"));

      assertEquals(true, tw.usesOnlyTopRow("iriueowqpqQWREIOPTIOW"));
      assertEquals(true, tw.usesOnlyMiddleRow("asdfjlfDFSLKHASLKF"));
      assertEquals(true, tw.usesOnlyBottomRow("MCBNVNMZncmxzmvbz,m"));

      assertEquals(false, tw.usesOnlyTopRow("iriueowqpqQaWREIOPTIOW"));
      assertEquals(false, tw.usesOnlyMiddleRow("asdfjlfDFiSLKHASLKF"));
      assertEquals(false, tw.usesOnlyBottomRow("MCBNVNMZnclmxzmvbzm"));
    }
}