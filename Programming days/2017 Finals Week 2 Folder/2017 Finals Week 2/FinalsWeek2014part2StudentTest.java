import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class FinalsWeek2014part2StudentTest extends junit.framework.TestCase
{
    public void testGoFigureTest01()
    {
        GoFigure gf = new GoFigure();

        assertEquals("123+123=246", gf.goFigureDecimal("123123246"));
        assertEquals("10100+1010=11110", gf.goFigureBinary("10100101011110"));
        assertEquals("MXIII+CCCLX=MCCCLXXIII", gf.goFigureRomanNumeral("MXIIICCCLXMCCCLXXIII"));
    }

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

    public void testPeriodicWords01()
    {
        List<Element> inStock = new ArrayList<Element>();
        inStock.add( new Element("H", 1));
        inStock.add( new Element("He", 2));
        inStock.add( new Element("O", 8));
        inStock.add( new Element("C", 6));
        PeriodicWords pw = new PeriodicWords(inStock);

        List<Element>  mix = new ArrayList<Element>();
        mix.add( new Element("H", 1));
        mix.add( new Element("Li", 3));
        mix.add( new Element("O", 8));

        List<Element> missing = pw.getMissingElements(mix);
        assertEquals(4, inStock.size());
        assertEquals(3, mix.size());
        assertEquals(1, missing.size());
        assertEquals(new Element("Li", 3), missing.get(0));
        //      assertEquals(true, ans.indexOf(missing.get(0)) >= 0);

        assertEquals(true, pw.isPeriodicSpellingPossible("BACON"));
        assertEquals(true, pw.isPeriodicSpellingPossible("HER"));
        assertEquals(true, pw.isPeriodicSpellingPossible("HERE"));
        assertEquals(true, pw.isPeriodicSpellingPossible("SPOONS"));
        assertEquals(true, pw.isPeriodicSpellingPossible("BYTE"));
        assertEquals(true, pw.isPeriodicSpellingPossible("LIKES"));
        assertEquals(false, pw.isPeriodicSpellingPossible("TEST"));
        assertEquals(false, pw.isPeriodicSpellingPossible("COMPUTER"));
    }

    public void testPartitionThis01()
    {
        assertEquals(4, PartitionThis.sumDigits(103));
        assertEquals(6, PartitionThis.sumDigits(-24));
        assertEquals(9+2+3+7, PartitionThis.sumDigits(-9237));
        assertEquals(1+5+0+8+6, PartitionThis.sumDigits(15086));
        assertEquals(true, PartitionThis.isPartitionable(415041131, 5));
        assertEquals(true, PartitionThis.isPartitionable(410250101, 7));
        assertEquals(false, PartitionThis.isPartitionable(415041132, 5));

        assertEquals(0, PartitionThis.minPartitionDegree(0));
        assertEquals(5, PartitionThis.minPartitionDegree(415041131));
        assertEquals(28, PartitionThis.minPartitionDegree(3054628));
    }
}