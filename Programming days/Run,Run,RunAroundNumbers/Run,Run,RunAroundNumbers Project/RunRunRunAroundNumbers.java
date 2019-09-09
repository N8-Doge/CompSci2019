import java.util.*;
import java.lang.Math;
/**
 * A lab
 */
public class RunRunRunAroundNumbers
{
    public static boolean isRunRoundNumber(int num)
    {
        String s = Integer.toString(num);
        String f = "";
        int i = (Character.getNumericValue(s.charAt(0)))%s.length();
        int j = Character.getNumericValue(s.charAt(i));
        for(char c:s.toCharArray())
            f+="x";
        while(!s.equals(f)){
            if(s.charAt(i)=='x')
                return false;
            s=s.substring(0,i)+"x"+s.substring(i+1);
            i=(j+i)%s.length();
            j=Character.getNumericValue(s.charAt(i));
        }
        return true;
    }

    public static int getNextRunAroundNumber(int seqNum)
    {
        int i=seqNum+1;
        while(!isRunRoundNumber(i))
            ++i;
        return i;
    }
}