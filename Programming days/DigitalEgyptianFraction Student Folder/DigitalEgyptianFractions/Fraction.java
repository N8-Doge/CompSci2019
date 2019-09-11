//  all values will be less than or equal to 1.

import java.util.*;

public class Fraction implements Comparable<Fraction>
{
    private int top; //uwu
    private int bottom; //owo

    public Fraction(int t, int b)
    {
        this.top = t;
        this.bottom = b;
    }

    /*
     * returns
     *       a value less than 0 if this < f
     *       0 if f == this
     *       a value greater than 0 if this > f
     */
    public int compareTo(Fraction f)
    {
        return 1;
    }

    /*
     * returns the numerator of this fraction
     */
    public int getTop()
    {
        return this.top;
    }

    /*
     * returns the denominator of this fraction
     */
    public int getBottom()
    {
        return this.bottom;
    }

    /*
     * returns the decimal value this fraction (i.e., numerator / denominator
     */
    public double getDecimal()
    {
        return (double)this.top/(double)this.bottom;
    }

    /*
     * A static method
     * returns the simplified fraction computed by summing all fractions
     *         in it List parameter fs
     */
    public static Fraction addAllFractionsInList(List<Fraction> fs)
    {
        int gcm = 1, t = 0;;
        for(Fraction f : fs)
            if(gcm%f.getBottom()!=0)
                gcm*=f.getBottom();
        for(Fraction f : fs)
            t+=(f.getTop()*gcm)/gcm;
        return new Fraction(t,gcm);
    }

    /*
     * modifies this by subtracting the parameter f from it
     */
    public void subtract(Fraction f)
    {
    }

    /*
     * modifies this by adding the parameter f to it
     */
    public void add(Fraction f)
    {
    }

    /*
     * modifies this by multipling it by the parameter f
     */
    public void multiply(Fraction f)
    {
    }

    /*
     * returns true if the the two objects are equal.
     *         You may assume both Fractions are in simplest form
     */
    public boolean equals(Object obj)
    {
        return ((Fraction)obj).getDecimal()==getDecimal();
    }

    /*
     * returns a string in the form
     * 
     *              "numerator / denominator"
     *         there is exactly one space on both sides of /
     *         no space infront of the numerator and no spaces after the denominator
     */
    public String toString()
    {
        return Integer.toString(top)+" / "+Integer.toString(bottom);
    }
}