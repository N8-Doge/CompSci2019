

/**
 * The test class PrimaryArithmeticTest.
 *
 * @author  
 * @version 
 */
public class PrimaryArithmeticTest extends junit.framework.TestCase
{
	public void testPrimaryArithmetic01()
	{
		String problemMsg="Problem with: testPrimaryArithmetic01";
		int base = 10;
		int num1 = 123;
		int num2 = 457;
		String[] numbers = {""+num1, ""+num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 1, pa.getResults(numbers));
	}
}
