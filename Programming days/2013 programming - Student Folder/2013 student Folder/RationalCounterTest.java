

/**
 * The test class RationalCounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RationalCounterTest extends junit.framework.TestCase
{
	public void testRationalCounter01()
	{
		Fraction f1 = new Fraction(2, 1);
		Fraction ans = RationalCounter.getFraction(3);
	    assertEquals(ans.getNumerator(), 2);
		assertEquals(ans.getDenominator(), 1);

		f1 = new Fraction(2, 4);
		ans = RationalCounter.getFraction(14);
	    assertEquals(ans.getNumerator(), 2);
		assertEquals(ans.getDenominator(), 4);

		f1 = new Fraction(1, 4);
		ans = RationalCounter.getFraction(7);
	    assertEquals(ans.getNumerator(), 1);
		assertEquals(ans.getDenominator(), 4);
    }
}