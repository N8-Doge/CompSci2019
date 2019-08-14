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
	    assertEquals(false, PascalRealConstants.isValid("1E12"));
    }
}