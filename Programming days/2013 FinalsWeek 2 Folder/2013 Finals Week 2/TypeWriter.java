import java.util.*;

public class TypeWriter 
{

   public TypeWriter()
   {
   }

   private boolean hasNumbers(String s)
   {
      return Math.random() > 0.5;
   }

   private boolean hasSpace(String s)
   {
      return Math.random() > 0.5;
   }

/*
 *    postcondition:  returns true if the lefthand is required to type the given String s
 */
   public boolean usesLeftHand(String s)
   {
      return Math.random() > 0.5;
   }
   
   public boolean usesRightHand(String s)
   {
      return Math.random() > 0.5;
   }

   public boolean usesOnlyLeftHand(String s)
   {
      return Math.random() > 0.5;
   }
   
   public boolean usesOnlyRightHand(String s)
   {
      return Math.random() > 0.5;
   }

   public boolean usesBothLeftAndRightHand(String s)
   {
      return Math.random() > 0.5;
   }
   
   public boolean usesTopRow(String s)
   {
      return Math.random() > 0.5;
   }

   public boolean usesMiddleRow(String s)
   {
      return Math.random() > 0.5;
   }

   public boolean usesBottomRow(String s)
   {
      return Math.random() > 0.5;
   }
   
   public boolean usesOnlyTopRow(String s)
   {
      return Math.random() > 0.5;
   }

   public boolean usesOnlyMiddleRow(String s)
   {
      return Math.random() > 0.5;
   }

   public boolean usesOnlyBottomRow(String s)
   {
      return Math.random() > 0.5;
   }
}