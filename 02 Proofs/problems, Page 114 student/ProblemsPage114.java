import java.util.*;
import java.lang.Math;
public class ProblemsPage114{
   public static int problem_8(int n){
      if(n<3){return 0;}
      return problem_8(n/3)+n;
   }

   public static int problem_9_10(int n){
      if(n<2){return 0;}
      return problem_9_10(n/2)+(int)Math.pow(n,2);
   }

   public static int problem_11_13(int n){
      if(n<2){return 0;}
      return 4*problem_11_13(n/2)+n;
   }
}