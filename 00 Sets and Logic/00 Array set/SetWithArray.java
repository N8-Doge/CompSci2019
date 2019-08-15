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
        int[] d = difference(y);
        int[] r = new int[y.length+d.length];
        for(int i=0;i<y.length;++i)
            r[i]=y[i];
        for(int i=0;i<d.length;++i)
            r[i+y.length]=d[i];
        return r;
    }

    /*
     * returns an Set (array) containing all elements in x AND y
     * 
     *      if the intersection is empty, return an arrray of length 0
     * 
     */
    public int[] intersection(int[] y)
    {
        int a=0;
        for(int i:x)
            for(int j:y)
                if (i==j)
                    ++a;
        int[] b = new int[a];
        a=0;
        for(int i:x){
            for(int j:y){
                if (i==j){
                    b[a]=i;
                    ++a;
                }
            }
        }
        return b;
    }

    /*
     * returns an Set (array) containing all elements in x that are not in y
     * 
     *      if the intersection is empty, return an arrray of length 0
     */
    public int[] difference(int[] y)
    {
        int a=0;
        boolean b=true;
        for(int i:x){
            for(int j:y)
                if(i==j)
                    b=false;
            if(b)
                ++a;
            else
                b=true;
        }
        int[] r = new int[a];
        a=0;
        for(int i:x){
            for(int j:y)
                if(i==j)
                    b=false;
            if(b){
                r[a]=i;
                ++a;
            }
            else
                b=true;
        }
        return r;
    }

    /*
     * returns true if all elements of x are contained in y
     */
    public boolean isSubSetOf(int[] y)
    {
        boolean b=true;
        for(int i:x){
            for(int j:y)
                if(i==j)
                    b=false;
            if(b)
                return false;
        }
        return true;
    }

    /*
     * returns true if all elements in y are contained in x
     *              and if all elements in x are contained in y
     */
    public boolean isEqualTo(int[] y)
    {
        boolean b=true;
        for(int i:x){
            for(int j:y)
                if (i==j)
                    b=false;
            if(b)
                return false;
            else
                b=true;
        }
        return true;
    }

    /*
     * returns the set of elements which are in one of the set
     *         that is:  (x - y) union (y - x)
     * 
     *      if the intersection is empty, return an arrray of length 0
     */
    public int[] symmetricDifference(int[] y)
    {
        int[] u = union(y);
        int[] n = intersection(y);
        int a=0;
        boolean b=true;
        for(int i:u){
            for(int j:n)
                if(i==j)
                    b=false;
            if(b)
                ++a;
            else
                b=true;
        }
        int[] r = new int[a];
        a=0;
        for(int i:u){
            for(int j:n)
                if(i==j)
                    b=false;
            if(b){
                r[a]=i;
                ++a;
            }
            else
                b=true;
        }
        return r;
    }

    /*
     * returns true if all the collection sets in s form a partition of x
     *         you may assume that x is a universal set.
     *         
     *         You might have to look up the definition of a partition and 
     */
    public boolean isPartition(List<int[]> s)
    {
        for(int[] i:s)
            if(!isSubSetOf(i))
                return false;
        for(int i:x){
            int[] r = {i};
            if(!s.contains(r))
                return false;
        }
        return true;
    }
}