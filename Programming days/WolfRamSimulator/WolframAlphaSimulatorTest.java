/**
 * The test class CarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WolframAlphaSimulatorTest extends junit.framework.TestCase
{
    private int two_15 = (int)Math.pow(2, 15);

    public void testInvert01()
    {
        WolframAlphaSimulator wolfie = new WolframAlphaSimulator("a*b + !a*b");
        boolean[] v = {true, false};
        assertEquals(false, wolfie.evaluate(v));
        assertEquals("a*b + !a*b", wolfie.getDisjunctiveNormalForm());
    }
}