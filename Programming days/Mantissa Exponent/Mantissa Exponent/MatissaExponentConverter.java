import java.util.*;
public class MatissaExponentConverter{
    public static String toMatissaExponent(double val, int m, int e){
        String j = "";
        String k = "";
        if(val==0.){
            for(int i=0;i<m;++i)
                j+="0";
            for(int i=0;i<e;++i)
                k+="0";
            return j+" "+k;
        }
        return "add code here";
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
        System.out.println("M"+m+"D"+d);
        return Math.pow(2,m)*d;
    }
}