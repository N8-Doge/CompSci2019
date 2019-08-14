import java.util.*;
/**
 * The test class MaximumSumTest.
 *
 * @author  2007 So Cal Programming Contest
 * @version 2007
 */
public class RationaNumberTest extends junit.framework.TestCase
{
	public void testRationaNumber01()
	{
	    RepeatingDecimalString rd = new RepeatingDecimalString("3", "18");
	    RationalFraction rf = new RationalFraction(rd);
	    assertEquals(true, rf.equals(new RationalFraction(7, 22)));
    }
}