import java.util.*;
/**
 * The test class PascalRealConstantsTest.
 *
 * @author  2007 So Cal Programming Contest
 * @version 2007
 */
public class PascalRealConstantsTest extends junit.framework.TestCase
{
	public void testPascalRealConstants01()
	{
        assertEquals(true, PascalRealConstants.isValid("1.2"));
        assertEquals(false, PascalRealConstants.isValid("1."));
        assertEquals(false, PascalRealConstants.isValid("E-12"));
        assertEquals(true, PascalRealConstants.isValid("1.0e-55"));
        assertEquals(true, PascalRealConstants.isValid("1e-12"));
        assertEquals(true, PascalRealConstants.isValid("+4.1234567890E-99999"));
        assertEquals(false, PascalRealConstants.isValid("7.6e+12.5"));
        assertEquals(false, PascalRealConstants.isValid("99"));
        assertEquals(false, PascalRealConstants.isValid("6.5E"));
    }

    public void testPascalRealConstants02()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid(".2"));
           assertEquals(true, PascalRealConstants.isValid("-1.5E-3333"));
           assertEquals(false, PascalRealConstants.isValid("0.E12"));
           assertEquals(true, PascalRealConstants.isValid("-99999991.099999e-55555555555"));
        }
    }

    public void testPascalRealConstants03()
	{
        for (int x = 0; x < 2; x++)
        {
           assertEquals(false, PascalRealConstants.isValid(".2"));
           assertEquals(false, PascalRealConstants.isValid("12."));
           assertEquals(true, PascalRealConstants.isValid("0.0"));
           assertEquals(true, PascalRealConstants.isValid("9.9"));
           assertEquals(true, PascalRealConstants.isValid("9999999999999999.000000000000000"));
           assertEquals(false, PascalRealConstants.isValid("+12."));
        }
    }

    public void testPascalRealConstants04()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("+0.0"));
           assertEquals(false, PascalRealConstants.isValid("-9999999999999999."));
           assertEquals(false, PascalRealConstants.isValid("12.12-"));
           assertEquals(true, PascalRealConstants.isValid("+0.9"));
           assertEquals(true, PascalRealConstants.isValid("-9.000"));
        }
    }

    public void testPascalRealConstants05()
	{
        for (int x = 0; x < 3; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("90.0e+12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99e-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.e12"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.e+99999123456456.2"));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056e+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("62.000005e"));
           assertEquals(false, PascalRealConstants.isValid("62132005e12."));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235e.5"));
        }
    }

    public void testPascalRealConstants06()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("90.0E+12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99E-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.E12"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.E+99999123456456.2"));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056E+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("62.000005E"));
           assertEquals(false, PascalRealConstants.isValid("62132005E12."));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235E.5"));
        }
    }

    public void testPascalRealConstants07()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid("6.5E"));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235e.5"));
           assertEquals(true, PascalRealConstants.isValid("-99999991.099999e+55555555555"));
           assertEquals(false, PascalRealConstants.isValid("+12."));
           assertEquals(false, PascalRealConstants.isValid("-9999999999999999.56656465484513123131e3123213123132."));
           assertEquals(false, PascalRealConstants.isValid("12.12e-."));
           assertEquals(true, PascalRealConstants.isValid("90.0E+12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99E-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.E12"));
           assertEquals(false, PascalRealConstants.isValid("621987.123154651235E.5"));
        }
    }

    public void testPascalRealConstants08()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid("E-12"));
           assertEquals(false, PascalRealConstants.isValid("-9.99e-5544444444443210."));
           assertEquals(false, PascalRealConstants.isValid("+1.e12"));
           assertEquals(true, PascalRealConstants.isValid("90.0e+12"));
           assertEquals(true, PascalRealConstants.isValid("1.2"));
           assertEquals(true, PascalRealConstants.isValid("9999999999999999.000000000000000"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.e+99999123456456.2"));
           assertEquals(false, PascalRealConstants.isValid("62132005e12."));
           assertEquals(true, PascalRealConstants.isValid("1.0e-55"));
           assertEquals(true, PascalRealConstants.isValid("1e-12"));
       }
    }

    public void testPascalRealConstants09()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(true, PascalRealConstants.isValid("-1.5E-3333"));
           assertEquals(false, PascalRealConstants.isValid("+41234567890.E+99999123456456.2"));
           assertEquals(false, PascalRealConstants.isValid("1."));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056E+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("12."));
           assertEquals(true, PascalRealConstants.isValid("0.0"));
           assertEquals(false, PascalRealConstants.isValid("62.000005E"));
           assertEquals(false, PascalRealConstants.isValid("62132005E12."));
           assertEquals(true, PascalRealConstants.isValid("+0.0"));
           assertEquals(false, PascalRealConstants.isValid("0.E12"));
       }
    }

    public void testPascalRealConstants10()
	{
        for (int x = 0; x < 5; x++)
        {
           assertEquals(false, PascalRealConstants.isValid(".2"));
           assertEquals(true, PascalRealConstants.isValid("+0.9"));
           assertEquals(true, PascalRealConstants.isValid("9.9"));
           assertEquals(true, PascalRealConstants.isValid("+4.1234567890E-99999"));
           assertEquals(false, PascalRealConstants.isValid("7.6e+12.5"));
           assertEquals(false, PascalRealConstants.isValid("99"));
           assertEquals(true, PascalRealConstants.isValid("7123054652132056106056e+125123456789123456789"));
           assertEquals(false, PascalRealConstants.isValid("62.000005e"));
           assertEquals(true, PascalRealConstants.isValid("-9.000"));
           assertEquals(false, PascalRealConstants.isValid(".2"));
        }
    }
}