import java.util.*;

public class DigitalEgyptianFraction extends Fraction
{
    public DigitalEgyptianFraction(int b)
    {
        /* insert code here to create a Digital Fraction of the form 1 / b  */
        super(1, b);  // you may want to change this line of code
    }

    public static Fraction addAllDigitalEgyptianFractionsInList(List<DigitalEgyptianFraction> efs)
    {
        Fraction a = new Fraction(0,1);
        for(DigitalEgyptianFraction e:efs)
            a.add(e);
        return a;
    }

    public static List<DigitalEgyptianFraction> getListOfDigitalEgyptianFractions(Fraction f)
    {
        List<DigitalEgyptianFraction> ans = new ArrayList<DigitalEgyptianFraction>();
        int i = 2,n = f.getTop();
        while(n>0){
            int m = f.getBottom()/i;
            if(m<=n){
                ans.add(new DigitalEgyptianFraction(i));
                n-=m;
            }
            i*=2;
        }
        return ans;
    }
}