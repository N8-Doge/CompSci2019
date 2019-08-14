

/**
 * The test class RationalCounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PermalexTest extends junit.framework.TestCase
{
	public void testPermalex01()
	{
	    assertEquals(15, Permalex.answer("bacaa"));
	    assertEquals(1, Permalex.answer("abc"));
	    assertEquals(6, Permalex.answer("cba"));
    }
}