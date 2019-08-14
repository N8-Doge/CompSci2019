 /*
 * code authored by Maria & Gary Litvan
 */

public class Twos_Complement
{
   private String type;

   /*
    * Convert the 2s complement representation to its integer equivalent
    * 
    * precondition  s is the 2s complement number that is to be convert to an int
    *               The number of bits = s.length()
    * 
    *                 see the student tester for sample input/output
    */
   public static int convertToDecimal(String s)
   {
       return ((int)Math.random()*1000);
   }

   /*
    * Convert the int parameter val to its 2s complement representatino
    * 
    * precondition:  -2^(bits-1) <+ val <+ (2^[bits-1]) - 1
    *                i.e., the valu fits in the range
    *                
    * postcondition   The return value has length() == bits
    * 
    *                 see the student tester for sample input/output
    */
   public static String convertDecimalTo2sComplement(int val, int bits)
   {
       return "";
   }

   /*
    *    inverts the String parameter s to it negative value
    *    precondition:  s is a valid 2s complement number with s.length() bits
    *    
    *    postcondition  return a string with length() == s.length()
    *                   the decimals value of s == - decimal value of return String
    *                   
    *                   e.g.,  If s = 0111, the String 1001 is returned
    *                          If s = 001, the String 111 is returned
    */
   public static String invert(String s)
   {
      return "";
   }
}