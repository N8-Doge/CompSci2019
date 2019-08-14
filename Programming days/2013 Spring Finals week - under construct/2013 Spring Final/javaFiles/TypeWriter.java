import java.util.*;

public class TypeWriter 
{
   private String leftHand;
   private String rightHand;
   private String topRow;
   private String middleRow;
   private String bottomRow;

   public TypeWriter()
   {
      leftHand = "QWERTGFDSAZXCVqwertgfdsazxcv123456";
      rightHand = "YUIOPHJKLBNMyuiophjklbnm7890";
      topRow = "QWERTYUIOPpoiuytrewq";
      middleRow = "ASDFGHJKLlkjhgfdsa";
      bottomRow = "ZXCVBNMMNBVCXZzxcvbnm";
   }

   private boolean hasNumbers(String s)
   {
      return false;
   }

   private boolean hasSpace(String s)
   {
      return false;
   }

/*
 *    postcondition:  returns true if the lefthand is required to type the given String s
 */
   public boolean usesLeftHand(String s)
   {
      return false;
   }

   private boolean usesLeftHandHelper(String s)
   {
      boolean flag = false;

      return flag;
   }
   
   public boolean usesRightHand(String s)
   {
      return false;
   }

   private boolean usesRightHandHelper(String s)
   {
      boolean flag = false;

      return flag;
   }

   public boolean usesOnlyLeftHand(String s)
   {
      return false;
   }
   
   public boolean usesOnlyRightHand(String s)
   {
      return false;
   }

   public boolean usesBothLeftAndRightHand(String s)
   {
      return false;
   }
   
   public boolean usesTopRow(String s)
   {
      boolean flag = false;

      return flag;
   }

   public boolean usesMiddleRow(String s)
   {
      boolean flag = false;

      return flag;
   }

   public boolean usesBottomRow(String s)
   {
      boolean flag = false;

      return flag;
   }
   
   public boolean usesOnlyTopRow(String s)
   {
      return false;
   }

   public boolean usesOnlyMiddleRow(String s)
   {
      return false;
   }

   public boolean usesOnlyBottomRow(String s)
   {
      return false;
   }
}