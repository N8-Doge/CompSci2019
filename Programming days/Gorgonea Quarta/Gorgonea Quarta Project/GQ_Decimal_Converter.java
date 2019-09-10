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
        if(num==0)
            return "0";
        int i=0;
        String r=b3toGQ("0");
        while(toDecimal(r)!=num){
            ++i;
            r=b3toGQ(toB3(i));
        }
        return b3toGQ(toB3(i));
    }
    
    private static String toB3(int num){
        int n = num;
        int i = 3;
        String s="";
        while (n>0){
            s=s+(n%i);
            i*=3;
            n/=3;
        }
        return s;
    }
    
    private static String b3toGQ(String s){
        String r = s.replace('0','-').replace('1','0').replace('2','1');
        if(r.charAt(0)=='0')
            r=r.substring(1);
        return r;
    }

    public static void print(){
        for(int i=0;i<=1024;i=i+2)
            System.out.println(""+i+" is '"+toB3(i)+"'");
    }
}