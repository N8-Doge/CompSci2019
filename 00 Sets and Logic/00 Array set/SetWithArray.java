import java.util.*;
public class SetWithArray{
    private int[] x;

    public SetWithArray(int[] num){
        x = num;
    }

    public int[] union(int[] y){
        int[] d = difference(y);
        int[] r = new int[y.length+d.length];
        for(int i=0;i<y.length;++i)
            r[i]=y[i];
        for(int i=0;i<d.length;++i)
            r[i+y.length]=d[i];
        return r;
    }

    public int[] intersection(int[] y){
        return difference(difference(y));
    }

    public int[] difference(int[] y){
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i:x)
            a.add(i);
        for(Integer i:y)
            a.remove(i);
        int[] r = new int[a.size()];
        for(int i=0;i<a.size();i++)
            r[i]=a.get(i);
        return r;
    }

    public boolean isSubSetOf(int[] y){
        boolean b=true;
        for(int i:x){
            for(int j:y)
                if(i==j)
                    b=false;
            if(b)
                return false;
            else
                b=true;
        }
        return true;
    }

    public boolean isEqualTo(int[] y){
        int a=0;
        for(int i:x){
            for(int j:y)
                if (i==j)
                    a++;
            if(a!=1)
                return false;
            else
                a=0;
        }
        return x.length==y.length;
    }

    public int[] symmetricDifference(int[] y){
        int[] temp = x;
        int[] n = intersection(y);
        x = union(y);
        n = difference(n);
        x = temp;
        return n;
    }

    public boolean isPartition(List<int[]> s){
        int a=0;
        for(int[] i:s)
            a+=i.length;
        int[] r = new int[a];
        a=0;
        for(int[] i:s){
            for(int j:i){
                r[a]=j;
                ++a;
            }
        }
        return isEqualTo(r);
    }
}