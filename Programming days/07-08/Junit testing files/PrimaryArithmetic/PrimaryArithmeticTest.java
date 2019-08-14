

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
		String num1 = ""+123;
		String num2 = ""+457;
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 1, pa.getResults(numbers));
	}

	public void testPrimaryArithmetic02()
	{
		String problemMsg="Problem with: testPrimaryArithmetic02";
		int base = 10;
		String num1 =  ""+773;
		String num2 = ""+9457;
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 4, pa.getResults(numbers));
	}

	public void testPrimaryArithmetic03()
	{
		String problemMsg="Problem with: testPrimaryArithmetic03";
		int base = 10;
		String num1 = ""+22222;
		String num2 = ""+33333;
		String num3 = ""+11111;
		String[] numbers = {num1, num2, num3};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 0, pa.getResults(numbers));

		base = 7;
		num1 = ""+ 1623;
		num2 = ""+12130;
		String[] numbers1 = {num1, num2};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 1, pa.getResults(numbers1));

		base = 17;
		num1 = "A9EH37";
		num2 = "H0A0HB7";
		String[] numbers2 = {num1, num2};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 1, pa.getResults(numbers2));
	}

	public void testPrimaryArithmetic04()
	{
		String problemMsg="Problem with: testPrimaryArithmetic04";
		int base = 2;
		String num1 = ""+10101;
		String num2 =   ""+101;
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 2, pa.getResults(numbers));
	}

	public void testPrimaryArithmetic05()
	{
		String problemMsg="Problem with: testPrimaryArithmetic05";
		int base = 2;
		String num1 = ""+111111;
		String num2 =  ""+11111;
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 6, pa.getResults(numbers));

		base = 7;
		num1 = ""+ 166123;
		num2 = ""+1403606;
		String[] numbers1 = {num1, num2};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 5, pa.getResults(numbers1));
	}

	public void testPrimaryArithmetic06()
	{
		String problemMsg="Problem with: testPrimaryArithmetic06";
		int base = 8;
		String num1 = ""+1234567;
		String num2 = ""+6362013;
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 4, pa.getResults(numbers));
	}

	public void testPrimaryArithmetic07()
	{
		String problemMsg="Problem with: testPrimaryArithmetic07";
		int base = 8;
		String num1 = ""+123;
		String num2 = ""+633;
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 0, pa.getResults(numbers));

		base = 5;
		num1 = ""+ 1123;
		num2 = ""+4030;
		String[] numbers1 = {num1, num2};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 2, pa.getResults(numbers1));
	}

	public void testPrimaryArithmetic08()
	{
		String problemMsg="Problem with: testPrimaryArithmetic08";
		int base = 16;
		String num1 = "8BCDEF";
		String num2 = "870456";
		//            112D245
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 5, pa.getResults(numbers));
	}

	public void testPrimaryArithmetic09()
	{
		String problemMsg="Problem with: testPrimaryArithmetic09";
		int base = 16;
		String num1 = "AF";
		String num2 = "FA";
		String[] numbers = {num1, num2};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 2, pa.getResults(numbers));
	}

	public void testPrimaryArithmetic10()
	{
		String problemMsg="Problem with: testPrimaryArithmetic10";
		int base = 16;
		String num1 = "6A1F";
		String num2 = "7FA0";
		String num3 = "3A20";  // TWO CARRIES IN 16^2 PLACE VALUE COUNT AS TWO
		//            123DF
		String[] numbers = {num1, num2, num3};
		PrimaryArithmetic pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 3, pa.getResults(numbers));

		base = 10;
		num1 = ""+691;
		num2 = ""+970;
		num3 = ""+832;  // TWO CARRIES IN 10^2 PLACE VALUE COUNT AS TWO
		//       2493
		String[] numbers1 = {num1, num2, num3};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 3, pa.getResults(numbers1));

		base = 2;
		num1 = ""+100;
		num2 = ""+101;
		num3 = ""+111;  // TWO CARRIES IN 2^2 PLACE VALUE COUNT AS TWO PLUS CARRY IN 2^3
		//      10000
		String[] numbers2 = {num1, num2, num3};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 5, pa.getResults(numbers2));

		base = 5;
		num1 = ""+123;
		num2 = ""+234;
		num3 = ""+141;  // TWO CARRIES IN 5^1 PLACE VALUE COUNT AS TWO
		//       1103
		String[] numbers3 = {num1, num2, num3};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 4, pa.getResults(numbers3));

		base = 17;
		num1 =  "HHHHH";
		num2 = "H00001";
		String[] numbers4 = {num1, num2};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 6, pa.getResults(numbers4));

		base = 13;
		num1 = "123456789ABC";
		num2 = "10AA30405060";
		String[] numbers5 = {num1, num2};
		pa = new PrimaryArithmetic(base);
		assertEquals(problemMsg, 4, pa.getResults(numbers5));
	}
}