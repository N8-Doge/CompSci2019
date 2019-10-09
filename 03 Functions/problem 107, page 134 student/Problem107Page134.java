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
public class Problem107Page134
{
    /*
     *  returns an array of all months with a Friday the 13th in Calendar order
     *        Use the following Strings for each Month
     *        "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"
     */
    public static String[] findFriday13(int year){
        double x = (double)year;
        int y = (int)((x+(x-1.0)/4.0-(x-1.0)/100.0+(x-1.0)/400.0)%7.0);
        boolean b = (year%4==0)&&(year%100!=0||year%400==0);
        switch(y){
            case 0:
            if(b)
                return m(new int[]{1,10});
            else
                return m(new int[]{1,5,7});
            case 1:
            if(b)
                return m(new int[]{5,7});
            else
                return m(new int[]{9,12});
        }
        return new String[1];
    }
    
    public static String[] m(int[] months){
        String[] s = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String[] r = new String[months.length];
        for(int i=0;i<months.length;++i){
            r[i]=s[months[i]];
        }
        return r;
    }
}