import java.util.*;
public class Twos_Complement{
    private String type;

    public static int convertToDecimal(String s){
        int r=0;
        for(int i=0;i<s.length()-1;++i)
            if(s.charAt(s.length()-i-1)=='1')
                r+=Math.pow(2,i);
        if(s.charAt(0)=='1')
            r-=Math.pow(2,s.length()-1);
        return r;
    }

    public static String convertDecimalTo2sComplement(int val, int bits){
        String s = Integer.toString(Math.abs(val),2);
        while(s.length()!=bits)
            s="0"+s;
        return val<0 ? invert(s) : s;
    }

    public static String invert(String s){
        String t = s.replace('0','x').replace('1','0').replace('x','1');
        StringBuilder b = new StringBuilder(t);
        b.setCharAt(b.length()-1,(char)(b.charAt(b.length()-1)+1));
        for(int i=b.length()-1;i>=0;--i)
            if(b.charAt(i)>='2'){
                char c = b.charAt(i)=='2' ? '0' : '1';
                b.setCharAt(i,c);
                if(i!=0)
                    b.setCharAt(i-1,(char)(b.charAt(i-1)+1));
            }
        return b.toString();
    }
}