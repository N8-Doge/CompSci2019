import java.util.*;
public class MatissaExponentConverter{
    public static String toMatissaExponent(double val, int m, int e){
        int x = Math.getExponent(val)+1;
        String ex = Integer.toString(x,2);
        if(ex.length()>=e)
            return "np";
        double v = Math.abs(val);
        double b = 1;
        while(b<v)
            b*=2;
        String mn = new String();
        while(v!=0)
            
        if(val<0)
            ex="1"+ex;
        else if (val>0)
            ex="0"+ex;
        else
            for(int i=0;i<e;++i)
                ex+="0";
        return "011000 0100";
    }

    public static double toDouble(String str){
        String j = str.substring(0,str.indexOf(" "));
        String k = str.substring(str.indexOf(" ")+1);
        double m=0.,d=0.;
        for(int i=0;i<j.length();++i){
            if(i==0 && j.charAt(0)=='1')
                d-=1.;
            else if(j.charAt(i)=='1')
                d+=1./Math.pow(2.,i);
        }
        for(int i=0;i<k.length();++i)
            if(k.charAt(k.length()-i-1)=='1')
                m+=Math.pow(2,i);
        return Math.pow(2,m)*d;
    }
}