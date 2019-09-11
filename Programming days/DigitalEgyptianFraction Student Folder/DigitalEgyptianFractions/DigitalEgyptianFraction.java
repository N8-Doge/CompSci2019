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
        Fraction s = new Fraction(f.getTop(),f.getBottom());
        double n = 2;
        while(s.getDecimal()!=0.0D)
            if((1.0D/n)<s.getDecimal()){
                ans.add(new DigitalEgyptianFraction((int)n));
                s.subtract(new Fraction(1,(int)n));
            }
        return ans;
    }
}