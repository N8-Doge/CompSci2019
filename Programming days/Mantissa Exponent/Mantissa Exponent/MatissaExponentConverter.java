import java.util.*;
public class MatissaExponentConverter{
    public static String toMatissaExponent(double val, int m, int e){
        int x = (val==0.)? 0 : Math.getExponent(val)+1;
        String ex = Integer.toString(x,2);
        if(ex.length()>=e)
            return "np";
        double v = Math.abs(val);
        double b = 1;
        String mn = "";
        while(b<v)
            b*=2;
        while(v>=0.01){
            b/=2;
            if(v>=b){
                mn+="1";
                v-=b;
            }
            else
                mn+="0";
        }
        if(mn.length()>m)
            return "np";
        while(mn.length()<m-1)
            mn+="0";
        while(ex.length()<e)
            ex="0"+ex;
        mn = (val<0.)? "1"+mn : "0"+mn;
        return mn+" "+ex;
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