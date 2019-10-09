import java.util.*;
import java.lang.Math;
public class Problem64Page105{
   public static int evaluate_J(int num){
      return (2*(num-(int)Math.pow(2,(int)(Math.log10(num)/Math.log10(2)))))+1;
   }
}