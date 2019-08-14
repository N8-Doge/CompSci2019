import java.util.*;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest extends junit.framework.TestCase
{
   public void testBCC01()
   {
      BCC sample1 = new BCC("AaBb");
      int[] ans1a = sample1.convertToBCC();
      int[] tempa = {65, 97, 66, 98, 70};
      assertEquals(tempa.length, ans1a.length);
      for(int k = 0; k < ans1a.length; k++)
         assertEquals(tempa[k], ans1a[k]);

      BCC sample2 = new BCC("12345678");
      int[] ans2a = sample2.convertToBCC();
      int[] tempb = {49, 50, 51, 52, 202, 53, 54, 55, 56, 218};
      assertEquals(tempb.length, ans2a.length);
      for(int k = 0; k < ans2a.length; k++)
         assertEquals(tempb[k], ans2a[k]);

      BCC sample3 = new BCC("qwerty");
      int[] ans3a = sample3.convertToBCC();
      int[] tempc = {113, 119, 101, 114, 191, 116, 121, 0, 0, 237};
      assertEquals(tempc.length, ans3a.length);
      for(int k = 0; k < ans3a.length; k++)
         assertEquals(tempc[k], ans3a[k]);

      BCC sample = new BCC("qwerty");
      int[] s1 = {49, 50, 51, 52, 202, 53, 54, 55, 56, 218};
      assertEquals(true, sample.checkBCC(s1));

      int[] s2 = {113, 119, 101, 114, 191, 116, 121, 0, 0, 237};
      assertEquals(true, sample.checkBCC(s2));

      int[] s3 = {1, 2, 3, 4, 11};
      assertEquals(false, sample.checkBCC(s3));

      int[] s4 = {50, 51, 52, 53, 206, 25, 75, 100, 57, 1, 100, 101, 10, 0, 210};
      assertEquals(false, sample.checkBCC(s4));

      BCC b = new BCC("Help me");
      int[] ans1 = b.convertToBCC();
      int[] temp = {'H', 'e', 'l', 'p', ('H'+'e'+'l'+'p')%256,
                    ' ', 'm', 'e', 0,  (' '+'m'+'e'+0)%256};

      assertEquals(temp.length, ans1.length);
      for(int k = 0; k < ans1.length; k++)
         assertEquals(temp[k], ans1[k]);

      assertEquals(true, b.checkBCC(temp));

      b = new BCC("I love IB");
      int[] ans2 = b.convertToBCC();
      int[] temp2 = {'I', ' ', 'l', 'o', ('I'+' '+'l'+'o')%256,
                      'v', 'e', ' ', 'I', ('v'+'e'+' '+'I')%256,
                      'B', 0, 0, 0, 'B'};

      assertEquals(temp2.length, ans2.length);
      for(int k = 0; k < ans2.length; k++)
         assertEquals(temp2[k], ans2[k]);

      int[] temp3 = {122, 32, 65, 50, (122+32+65+50)%256, 82, 111, 82, 120, (82+111+82+120)%256};
      assertEquals(true, b.checkBCC(temp3));
   }
}