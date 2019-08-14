import java.util.*;
import java.lang.Math;
/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProblemsAndMoreProblems
{

   public static void getTestData()
   {
       System.out.println("problem8 test data");
       for (int k = 0; k < 99; k++)
       {
           int a = (int) (Math.random() * 155) - 25;
           int b = (int) (Math.random() * 155) - 25;
           int c = (int) (Math.random() * 500) - 50;
           int d = (int) (Math.random() * 405) - 51;
           int e = (int) (Math.random() * 651) - 75;
//           System.out.println("problem8(" + a + ", " + b + ", " + c + ", " + d + ", " + e +") = "
           System.out.println("problem8(" + (a/10.) + ", " + (b/10.) + ") = "
                                                + ProblemsAndMoreProblems.problem8(a/10., b/10.));// , c, d, e));
       }
   }
           
   public static int problem1(int m, int n)
   {
      /* to be implemented  */
      if (m==0 && n == 0) return 1;
      if (m==0) return n*ProblemsAndMoreProblems.problem1(0,(n-1)/3);
      if (n==0) return m+ProblemsAndMoreProblems.problem1(m/2,0);
      if (m>3 && n > 3)
         return 3*ProblemsAndMoreProblems.problem1(m-2,n-3)-ProblemsAndMoreProblems.problem1(m-3,n-1);
      return 5+2*ProblemsAndMoreProblems.problem1(n/2,ProblemsAndMoreProblems.problem1(0,m/3));
   }

   public static double problem2(double x)
   {
      /* to be implemented  */
      double part1 = Math.pow(x, x+2)-3;
      double part2 = Math.pow(x, 3) + x;
      part2 = part2 * part2;
      double part3 = 2.5 + x - 3 * Math.pow(x, 2 * Math.cos(3 * Math.PI * x));
      
      return part1 * part2 / part3;
   }

   public static double problem3(double x, double y)
   {
      /* to be implemented  */
      double part1 = Math.pow(x/(3*y), y);
      double part2 = (Math.cos(x) + Math.sin(Math.sqrt(x+y)))/(x*y+11);
      double part3 = (x * y - 4 * y) / (3 * Math.pow(x, Math.sqrt(y)));
      part3 = part3 / Math.pow(2 * x + 3 * y, x + 2 * y);
      
      return part1 + part2 - part3;
   }

   public static double problem4(double x, double y, double z)
   {
      /* to be implemented  */
      double part1 = Math.pow(Math.abs(Math.cos(x)), 2+Math.sin(5*z));
      part1 = part1 + Math.sin(Math.sqrt(Math.pow(x, y+z)+Math.pow(y, x+z)));
      double part2 = (x - y) * Math.pow(x*z - y*z, 1./z);
      double part3 = x + y + z;
      
      return part1 / part2 - part3;
   }

   public static double problem5(double a, double b, double c)
   {
      /* to be implemented  */
      double part1 = Math.pow(a, Math.sqrt(b+c));
      double part2 = Math.sqrt(a*a*a + b*b + c);
      double part3 = Math.pow(part2, a*b*c);
      
      return part1 + part3;
   }

   public static double problem6(double x, double y, double z)
   {
      /* to be implemented  */
      double part1 = Math.pow(Math.abs(Math.sin(2*x)), 3 * Math.cos(Math.sqrt(y)));
      System.out.println("part1: " + part1);
      double part2 = Math.pow(1+Math.sin(x+y*z), Math.abs(Math.tan(Math.cos(y))));
      part2 = part2 / (Math.pow(.3*x, 2*z-y) + Math.pow(z, 2. / (5+Math.sin(x))));
      System.out.println("part2: " + part2);
      double part3 = 200+Math.pow(x, x/3) + Math.pow(y, Math.sin(y)) + Math.pow(z, -Math.sqrt(z));
      part3 = part3 / (3*x - 5*y + 2*z);
      System.out.println("part3: " + part3);
      
      return part1 + part2 + part3;
   }

   public static double problem7(double x, double y, double z)
   {
      /* to be implemented  */

      double part1 = ProblemsAndMoreProblems.problem2(ProblemsAndMoreProblems.problem3(z, x));
      double part2 = ProblemsAndMoreProblems.problem4(2*z, 4*x, Math.sqrt(y));
      double part3 = Math.sqrt(ProblemsAndMoreProblems.problem5(y, z, x));
      
      return part1 * part2 / part3;
   }

   public static double problem8(double a, double b)
   {
      /* to be implemented  */

      double part1 = b + Math.sqrt(Math.abs(ProblemsAndMoreProblems.problem2(Math.pow(a, b))));
//      System.out.println("part1 = " + part1);
      double part2 = ProblemsAndMoreProblems.problem2(a);
//      System.out.println("part2 = " + part2);
      part2 = ProblemsAndMoreProblems.problem4(b+a, Math.abs(part2), 1);
//      System.out.println("part2 = " + part2);
      double part3 = ProblemsAndMoreProblems.problem5(5, part1, part2);
//      System.out.println("part3 = " + part3);
      return part3;
   }

   public static double problem9(double a, double b, double x, double y, double z)
   {
      /* to be implemented  */

      double part1 = ProblemsAndMoreProblems.problem3(Math.pow(z, a+b), a + x);
      System.out.println("9 -part1 : " + part1);
      double part2 = ProblemsAndMoreProblems.problem6(Math.pow(y, b), Math.pow(z, a), Math.cbrt(x+y+z+a+b));
      System.out.println("9- part2 : " + part2);
      return part1 + part2;
   }

   public static double problem10(double a, double b, double x, double y, double z)
   {
      /* to be implemented  */

      double part1 = ProblemsAndMoreProblems.problem5(z-3, (y+1)/2, (x+1)/2);
//      System.out.println("part1 = " + part1);
      double part2 = ProblemsAndMoreProblems.problem3(b, a);
//      System.out.println("part2 = " + part2);
      return Math.expm1(part1 + part2);
   }
}