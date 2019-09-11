import java.util.*;
public class GQ_Decimal_Converter{
    public static int toDecimal(String s){
        int r=0,i=1;
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
        if(num==0)
            return "0";
        StringBuilder s = new StringBuilder(Integer.toString(Math.abs(num),3));
        for(int i=s.length()-1;i>=0;--i){
            if(s.charAt(i)=='2'||s.charAt(i)=='3'){
                char c = (s.charAt(i)=='2')?'-':'0';
                s.setCharAt(i,c);
                if(i==0)
                    s=new StringBuilder("1").append(s);
                else{
                    c = (s.charAt(i-1)=='-')?'1':(char)(s.charAt(i-1)+1);
                    s.setCharAt(i-1,c);
                }
            }
        }
        String r = (num<0) 
            ? s.toString().replace('-','x').replace('1','-').replace('x','1') 
            : s.toString();
        while(r.charAt(0)=='0')
            r=r.substring(1);
        return r;
    }
}