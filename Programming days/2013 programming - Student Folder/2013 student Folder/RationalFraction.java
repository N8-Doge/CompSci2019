import java.util.*;
/**
 * Write a description of class RationalCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RationalFraction
{
    int    numerator;
    int    denominator;

    public RationalFraction(int top, int bottom)
    {
       numerator = top;
       denominator = bottom;
    }

    public RationalFraction(RepeatingDecimalString rd)
    {
       /*  add code here  */
    }

    public int getNumerator()
	{
	    return numerator;
    }

	public int getDenominator() 
	{
        return denominator;
    }

    public boolean equals(Object obj)
    {
        RationalFraction rf = (RationalFraction)obj;
        return getNumerator() == rf.getNumerator()
                         && getDenominator() == rf.getDenominator();
    }
}