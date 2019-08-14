import java.util.*;
/**
 * The test class MaximumSumTest.
 *
 * @author  2007 So Cal Programming Contest
 * @version 2007
 */
public class MaximumSumTest extends junit.framework.TestCase
{
	public void testMaximumSum01()
	{
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(0));
        row0.add(new Integer(-2));
        row0.add(new Integer(-7));
        row0.add(new Integer(0));
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(new Integer(9));
        row1.add(new Integer(2));
        row1.add(new Integer(-6));
        row1.add(new Integer(2));
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(new Integer(-4));
        row2.add(new Integer(1));
        row2.add(new Integer(-4));
        row2.add(new Integer(2));
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(new Integer(-1));
        row3.add(new Integer(8));
        row3.add(new Integer(0));
        row3.add(new Integer(-2));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		MaximumSum array1 = new MaximumSum(arr);
	    assertEquals(15, array1.sum());
    }
}