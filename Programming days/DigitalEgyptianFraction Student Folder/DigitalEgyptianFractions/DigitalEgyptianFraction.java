import java.util.*;

public class DigitalEgyptianFraction extends Fraction
{
   public DigitalEgyptianFraction(int b)
   {
       /* insert code here to create a Digital Fraction of the form 1 / b  */
       super(b, b);  // you may want to change this line of code
   }

   public static Fraction addAllDigitalEgyptianFractionsInList(List<DigitalEgyptianFraction> efs)
   {
      Fraction ans = new Fraction(0, 1);

      return ans;
   }

   public static List<DigitalEgyptianFraction> getListOfDigitalEgyptianFractions(Fraction f)
   {
      List<DigitalEgyptianFraction> ans = new ArrayList<DigitalEgyptianFraction>();

      return ans;
   }
}