import java.util.*;
import java.lang.*;
import java.awt.*;
/**
 * 2. CompressionLab - StringCoder
 *
 * @author  
 * @version (a version number or a date)
 */
public class StringCoder
{
//  add your own instance variables

   /** @param master the master string for the StringCoder
    *  Precondition: the master string contains all letters of
    *  the alphabet
    */
   public StringCoder(String master)
   { /*  add your own code  */; }

   /** @param parts an ArrayList of string parts that are valid
    *               in the master string
    *  Precondition: parts.size() > 0
    *  @return the string obtained by concatenating the parts of
    *           the master string
    */
   public String decodeString(ArrayList<StringPart> parts)
   {
      return "a String";
   }

   /** @param str the string to encode using the master string
    *  Precondition: all of the characters in str appear in
    *                the master string;
    *  str.length() > 0
    *  @return a string part in the master string that matches
    *            the beginning of str.
    *  The returned string part has length at least 1.
   */
   public StringPart findPart(String str)
   {
         return new StringPart(-1, -1);
   }

   /** @param word the string to be encoded
   *   Precondition: all of the characters in word appear in
   *                the master string;
   *   word.length() > 0
   *   @return an ArrayList of string parts of the master string
   *           that can be combined to create word
   */
   public ArrayList<StringPart> encodeString(String word)
   {
      ArrayList<StringPart> ans = new ArrayList<StringPart>();

      return ans;
   }
}