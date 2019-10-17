import java.util.*;
public class MatissaExponentConverter{
    //.005 double accuracy
    public static String toMatissaExponent(double val, int m, int e){
        int x = (val==0.)? 0 : Math.getExponent(val)+1;
        String ex = Integer.toString(Math.abs(x),2);
        while(ex.length()<e)
            ex="0"+ex;
        if(x<0.)
            ex.replace('1','x').replace('0','1').replace('x','0');
        if(ex.length()>e)
            return "np";
        System.out.println("exponent is "+ex);
        String mn = "";
        double d = 1;
        double v = Math.abs(val);
        while(d<val)
            d*=2;
        for(int i=0;i<m;++i){
            if(d<=v){
                mn+="1";
                v-=d;
            }
            else
                mn+="0";
            d/=2;
        }
        System.out.println("v is "+v);

        //code negative nums IDIOT
        if(v>.05)
            return "np";
        return mn+" "+ex;
    }

    public static double toDouble(String str){
        String j = str.substring(0,str.indexOf(" "));
        String k = str.substring(str.indexOf(" ")+1);
        double m=0.,d=0.;
        for(int i=0;i<j.length();++i){
            if(j.charAt(i)=='1'){
                if(i==0)
                    d-=1.;
                else
                    d+=1./Math.pow(2.,i);
            }
        }
        for(int i=0;i<k.length();++i)
            if(k.charAt(k.length()-i-1)=='1')
                if(k.length()-i-1==0)
                    m-=Math.pow(2,i);
                else
                    m+=Math.pow(2,i);
        return Math.pow(2,m)*d;
    }
}