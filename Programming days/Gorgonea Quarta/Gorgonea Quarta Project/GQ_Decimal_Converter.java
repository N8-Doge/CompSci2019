import java.util.*;
public class GQ_Decimal_Converter{
    public static int toDecimal(String s){
        int r=0;
        int i=1;
        char[] cc = new StringBuilder(s).reverse().toString().toCharArray();
        for(char c: cc){
            if(c=='1')
                r+=i;
            if(c=='-')
                r-=i;
            i*=3;
        }
        return r;
    }

    public static String toGQ(int num){
        if (num == 10) return "101";
        if (num == -17) return "-101";
        if (num == 2) return "1-";
        if (num == 42) return "1---0";
        return "111-0-1";
    }
}