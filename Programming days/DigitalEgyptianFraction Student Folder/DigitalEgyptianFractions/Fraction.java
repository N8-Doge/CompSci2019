import java.util.*;
public class Fraction implements Comparable<Fraction>
{
    private int top,bottom;

    public Fraction(int t, int b){
        this.top = t;
        this.bottom = b;
    }

    public int compareTo(Fraction f){
        return (int)((this.getDecimal()-f.getDecimal())*100.0D);
    }

    public int getTop(){
        return this.top;
    }

    public int getBottom(){
        return this.bottom;
    }

    public double getDecimal(){
        return (double)this.top/(double)this.bottom;
    }

    /*
     * A static method
     * returns the simplified fraction computed by summing all fractions
     *         in it List parameter fs
     */
    public static Fraction addAllFractionsInList(List<Fraction> fs){
        int gcm = 1, t = 0;;
        for(Fraction f : fs)
            gcm*=f.getBottom();
        for(Fraction f : fs)
            t+=(f.getTop()*gcm)/f.getBottom();
        Fraction f = new Fraction(t,gcm);
        f.simplify();
        return f;
    }

    public void subtract(Fraction f){
        this.top = (this.top*f.getBottom())-(f.getTop()*this.bottom);
        this.bottom = this.bottom*f.getBottom();
        simplify();
    }

    public void add(Fraction f){
        this.top = (this.top*f.getBottom())+(f.getTop()*this.bottom);
        this.bottom = this.bottom*f.getBottom();
        simplify();
    }

    public void multiply(Fraction f){
        this.top *= f.getTop();
        this.bottom *= f.getBottom();
        simplify();
    }

    public boolean equals(Object obj){
        return compareTo((Fraction)obj)==0;
    }

    public String toString(){
        simplify();
        return Integer.toString(top)+" / "+Integer.toString(bottom);
    }

    private void simplify(){
        int gcm = gcm(top,bottom);
        top/=gcm;
        bottom/=gcm;
    }

    public static int gcm(int a, int b){
        return b==0 ? a : gcm(b, a % b);
    }
}