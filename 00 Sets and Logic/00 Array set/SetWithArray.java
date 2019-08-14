import java.util.*;

 /*
  *   You  may assume all int[] represent a set.  That is, it does NOT contain duplicates
 */

public class SetWithArray
{
  private int[] x;

  public SetWithArray(int[] num)
  {
    x = num;
  }

/*
 * returns an Set (array) containing all elements in x OR y
 */
  public int[] union(int[] y)
  {
      return new int[5];
  }

/*
 * returns an Set (array) containing all elements in x AND y
 * 
 *      if the intersection is empty, return an arrray of length 0
 * 
 */
  public int[] intersection(int[] y)
  {
      return new int[5];
  }

/*
 * returns an Set (array) containing all elements in x that are not in y
 * 
 *      if the intersection is empty, return an arrray of length 0
 */
  public int[] difference(int[] y)
  {
      return new int[5];
  }

/*
 * returns true if all elements of x are contained in y
 */
  public boolean isSubSetOf(int[] y)
  {
      return Math.random() < 0.5;
  }

/*
 * returns true if all elements in y are contained in x
 *              and if all elements in x are contained in y
 */
  public boolean isEqualTo(int[] y)
  {
      return Math.random() < 0.5;
  }

/*
 * returns the set of elements which are in one of the set
 *         that is:  (x - y) union (y - x)
 * 
 *      if the intersection is empty, return an arrray of length 0
*/
  public int[] symmetricDifference(int[] y)
  {
      return new int[5];
  }

/*
 * returns true if all the collection sets in s form a partition of x
 *         you may assume that x is a universal set.
 *         
 *         You might have to look up the definition of a partition and 
 */
  public boolean isPartition(List<int[]> s)
  {
      return Math.random() < 0.5;
  }
}