import java.util.*;
public class MatissaExponentConverter{
    public static String toMatissaExponent(double val, int m, int e){
        double d = Math.abs(val);
        int x=0;
        while(d!=(double)(int)d){
            d*=2;
            x--;
        }
        String man = Integer.toString((int)d,2);
        x+=(man.equals("0")) ? 0 : man.length();
        while(man.length()<m-1)
            man+="0";
        if(val<0){
            man=twosComplement(man);
            man="1"+man;
        }
        else
            man="0"+man;
        String ex = Integer.toString(Math.abs(x),2);
        do{
            ex="0"+ex;
        }while(ex.length()<e);
        if(x<0){
            ex=twosComplement(ex);
            if(ex.indexOf("11")==0){
                boolean b = true;
                for(int i=0;i<ex.length()-1;i++)
                    if(i>1 && ex.charAt(i)!='0')
                        b=false;
                if(b)
                    ex=ex.substring(1);
            }
        }
        while(man.length()>m && man.charAt(man.length()-1)=='0')
            man=man.substring(0,man.length()-1);
        if(man.length()>m || ex.length()>e)
            return "np";
        return man+" "+ex;
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

    public static String twosComplement(String s){
        s=s.replace('0','x').replace('1','0').replace('x','1');
        StringBuilder b = new StringBuilder(s);
        int i = b.length()-1;
        while(b.charAt(i)=='1' && i>0){
            b.setCharAt(i,'0');
            i--;
        }
        if(b.charAt(i)=='0')
            b.setCharAt(i,'1');
        return b.toString();
    }
}