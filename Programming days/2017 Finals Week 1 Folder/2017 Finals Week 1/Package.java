/**
 * Write a description of class Pacakage here.
 * 
 * @author Mr. Allen
 * @version (a version number or a date)
 */
public class Package
{
   private int weight;
   private int value;

   public Package(int w, int v)
   {
      weight = w;
      value = v;
   }

   public int getWeight()
   {
      return weight;
   }

   public int getValue()
   {
      return value;
   }

   public int hashCode()
   {
      Integer w = new Integer(weight);
      Integer v = new Integer(value);
      return w.hashCode() + v.hashCode();
   }

   public boolean equals(Object obj)
   {
      Package p = (Package) obj;
      return value == p.getValue() && weight == p.getWeight();
   }
}