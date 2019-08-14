import java.util.*;
/**
 * The test class MaximumSumTest.
 *
 * @author  2007 So Cal Programming Contest
 * @version 2007
 */
public class TzolkinCalenderTest extends junit.framework.TestCase
{
	public void testTzolkinCalender01()
	{
        HaabCalendar hc = new HaabCalendar(0, "pop", 0);
        TzolkinCalendar result = hc.changeCalendar();
        TzolkinCalendar ans = new TzolkinCalendar(1, "imix", 0);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(10, "zac", 0);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(3, "chuen", 0);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(10, "zac", 1995);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(9, "cimi", 2801);
        assertEquals(true, ans.equals(result));

        hc = new HaabCalendar(0, "pop", 1);
        result = hc.changeCalendar();
        ans = new TzolkinCalendar(2, "cimi", 1);
        assertEquals(true, ans.equals(result));
    }
}