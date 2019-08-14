import java.util.*;
import java.lang.*;
import java.awt.*;
/**
 * 2. CompressionLab
 *
 * @author  Mr. Allen
 * @version
 */
public class StringPart
{
   private int s;
   private int len;
   /** @param start the starting position of the substring
    *               in a master string
    *  @param length the length of the substring in a master string
    */
   public StringPart(int start, int length)
   {
      s = start;
      len = length;
   }

   /** @return the starting position of the substring in
    *          a master string
    */
   public int getStart()
   { return s; }

   /** @return the length of the substring in a master string
   */
   public int getLength()
   { return len; }
}
