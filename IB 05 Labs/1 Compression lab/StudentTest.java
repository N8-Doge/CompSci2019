import java.util.*;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest extends junit.framework.TestCase
{
/*
   public static ArrayList<String> makeJPEGcompressPicture(Color[][] picture)
   public static String[][] uncompressJPEGPicture(ArrayList<String> comp)
*/

   public void testSample01()
   {
       ArrayList<String> ans = new ArrayList<String>();

       ans.add("10100001");
       ans.add("11001010");
       ans.add("10101010");
       ans.add("10010001");
       ans.add("10100010");
       ans.add("11001010");
       ans.add("10010010");
       ans.add("10100100");
       ans.add("11111001");
       ans.add("11001110");
       ans.add("10101010");

       String[][] f = {{"10100", "11001", "11001", "10101", "10101"},
                       {"10010", "10100", "10100", "11001", "11001"},
                       {"10010", "10010", "10100", "10100", "10100"},
                       {"10100", "11111", "11001", "11001", "11001"},
                       {"11001", "11001", "11001", "10101", "10101"}  };
       ArrayList<String> temp = FileCompression.compressPicture(f);
       assertEquals(ans.size(), temp.size());
       for (int i = 0; i < ans.size(); i++)
       {
          assertEquals(ans.get(i), temp.get(i));
       }
   }

   public void testSample02()
   {
       ArrayList<String> ans = new ArrayList<String>();

       ans.add("10101111");
       ans.add("10100101");
       ans.add("10010100");
       ans.add("10100010");
       ans.add("11111011");
       ans.add("11001001");
       ans.add("11111101");
       ans.add("10101010");
       ans.add("10100001");

       String[][] f = {{"10101", "10101", "10101", "10101", "10101", "10101"},
                       {"10101", "10100", "10100", "10100", "10100", "10100"},
                       {"10010", "10010", "10010", "10010", "10100", "10100"},
                       {"11111", "11111", "11111", "11001", "11111", "11111"},
                       {"11111", "11111", "11111", "10101", "10101", "10100"}  };
       ArrayList<String> temp = FileCompression.compressPicture(f);
       assertEquals(ans.size(), temp.size());
       for (int i = 0; i < ans.size(); i++)
       {
          assertEquals(ans.get(i), temp.get(i));
       }
   }

   public void testSample03()
   {
       ArrayList<String> ans = new ArrayList<String>();

       ans.add("10100001");
       ans.add("11001010");
       ans.add("10101010");
       ans.add("10010011");
       ans.add("11001010");
       ans.add("10010010");
       ans.add("10100100");
       ans.add("11111001");
       ans.add("11001110");
       ans.add("10101010");

       String[][] f = {{"10100", "11001", "11001", "10101", "10101"},
                       {"10010", "10100", "10100", "11001", "11001"},
                       {"10010", "10010", "10100", "10100", "10100"},
                       {"10100", "11111", "11001", "11001", "11001"},
                       {"11001", "11001", "11001", "10101", "10101"} };

       String[][] temp = FileCompression.uncompressPicture(ans);
       assertEquals(f.length, temp.length);
       for (int j = 0; j < temp.length; j++)
       {
          for (int k = 0; k < temp[j].length; k++)
          {
             assertEquals(temp[j][k], temp[j][k]);
          }
       }
   }
   public void testSample04()
   {
       ArrayList<String> ans = new ArrayList<String>();

       ans.add("10100001");
       ans.add("11001010");
       ans.add("10101011");
       ans.add("10010001");
       ans.add("10110001");
       ans.add("11110001");

       String[][] f = {{"10100", "11001", "11001"},
                       {"10101", "10101", "10101"},
                       {"10010", "10110", "11110"} };

       String[][] temp = FileCompression.uncompressPicture(ans);
       assertEquals(f.length, temp.length);
       for (int j = 0; j < temp.length; j++)
       {
          for (int k = 0; k < temp[j].length; k++)
          {
             assertEquals(temp[j][k], temp[j][k]);
          }
       }
   }
}