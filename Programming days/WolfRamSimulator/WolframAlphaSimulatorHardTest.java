/**
 * The test class CarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WolframAlphaSimulatorHardTest extends junit.framework.TestCase
{
    private int two_15 = (int)Math.pow(2, 15);

    public void testHarderInvert01()
    {
        WolframAlphaSimulator wolfie = new WolframAlphaSimulator("ab!c + !ab");
        boolean[] v = {true, false, true};
        assertEquals(false, wolfie.evaluate(v));
        assertEquals("a*b*!c + !a*b*c + !a*b*!c", wolfie.getDisjunctiveNormalForm());
    }

    public void testWithParensInvert02()
    {
        WolframAlphaSimulator wolfie = new WolframAlphaSimulator("a!b(!c+!a)(b+d)");
        boolean[] v = {true, false, false, true};
        assertEquals(true, wolfie.evaluate(v));
        assertEquals("a*!b*!c*d", wolfie.getDisjunctiveNormalForm());
    }
}
