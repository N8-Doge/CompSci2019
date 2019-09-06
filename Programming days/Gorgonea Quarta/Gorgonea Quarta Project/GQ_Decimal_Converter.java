import java.util.*;
public class GQ_Decimal_Converter{
    public static int toDecimal(String s){
        int r=0;
        int i=1;
        char[] ca = new StringBuilder(s).reverse().toString().toCharArray();
        for(char c: ca){
            if(c=='1')
                r+=i;
            if(c=='-')
                r-=i;
            i*=3;
        }
        return r;
    }

    public static String toGQ(int num){
        int r = 0;
        int f = 1;
        while (num > 0){
            r+=num%3*f;
            num/=3;
            f*=10;
        }
        return Integer.toString(r).replace('0','-').replace('1','0').replace('2','1');
    }
}