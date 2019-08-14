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

	public void testMaximumSum02()
	{
        ArrayList<Integer> row0 = new ArrayList<Integer>();
        row0.add(new Integer(-1));
        row0.add(new Integer(-2));
        row0.add(new Integer(-2));
        row0.add(new Integer(-2));
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(new Integer(-2));
        row1.add(new Integer(-2));
        row1.add(new Integer(-2));
        row1.add(new Integer(-2));
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(new Integer(-2));
        row2.add(new Integer(-2));
        row2.add(new Integer(-2));
        row2.add(new Integer(-2));
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(new Integer(-2));
        row3.add(new Integer(-2));
        row3.add(new Integer(-2));
        row3.add(new Integer(-2));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(row0);
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		
        int lastI = -1;
		for (int i = 0; i < arr.size(); i++)
        {
           int lastJ = -1;
		   for (int j = 0; j < arr.get(i).size(); j++)
		   {
		       arr.get(i).set(j, new Integer(-1));
		       if ( lastI == -1 && lastJ == -1)
		           /* first time */;
		       else if ( lastI == -1 /*&& lastJ != -1*/)  // changing element in first row
                  arr.get(0).set(lastJ, new Integer(-2));
		       else if ( lastJ == -1 )  // changing element in first row
                  arr.get(lastI).set(arr.get(i).size()-1, new Integer(-2));
               else   // if ( lastI != -1 && lastJ != -1)  // changing middle element
                  arr.get(lastI).set(lastJ, new Integer(-2));
		       MaximumSum array1 = new MaximumSum(arr);
               assertEquals(array1.sum(), -1);
		       lastJ = j;
		   }
		   lastI = i;
		}
    }
}