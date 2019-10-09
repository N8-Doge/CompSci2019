import java.util.*;
import java.lang.Math;
/**
 * Friday the 13.
 * 
 * Discrete Math
 * Problem 107, page 134
 *
 * @author  
 * @version (a version number or a date)
 */
public class Problem107Page134{
    public static String[] findFriday13(int year){
        double x = (double)year;
        int y = (int)((x+(x-1.0)/4.0-(x-1.0)/100.0+(x-1.0)/400.0)%7.0);
        boolean b = (year%4==0)&&(year%100!=0||year%400==0);
        switch(y){
            case 0:
            if(!b)
                return m(new int[]{1,10});
            else
                return m(new int[]{1,4,7});
            case 1:
            if(!b)
                return m(new int[]{4,7});
            else
                return m(new int[]{9,12});
            case 2:
            if(!b)
                return m(new int[]{9,12});
            else
                return m(new int[]{6});
            case 3:
            if(!b)
                return m(new int[]{6});
            else
                return m(new int[]{3,11});
            case 4:
            if(!b)
                return m(new int[]{2,3,11});
            else
                return m(new int[]{2,8});
            case 5:
            if(!b)
                return m(new int[]{8});
            else
                return m(new int[]{5});
            default:
            if(!b)
                return m(new int[]{5});
            else
                return m(new int[]{10});
        }
    }
    
    public static String[] m(int[] months){
        String[] s = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String[] r = new String[months.length];
        for(int i=0;i<months.length;++i){
            r[i]=s[months[i]-1];
        }
        return r;
    }
}