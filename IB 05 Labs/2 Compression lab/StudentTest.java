import java.util.*;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest extends junit.framework.TestCase
{
   public void testSampleFindPart01()
   {
       StringCoder sc = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
       StringPart solution = new StringPart(0, "sixty".length());
       StringPart temp = sc.findPart("sixty");

       assertEquals(solution.getStart(), temp.getStart());
       assertEquals(solution.getLength(), temp.getLength());

       solution = new StringPart(16, "qui".length());
       temp = sc.findPart("quit");

       assertEquals(solution.getStart(), temp.getStart());
       assertEquals(solution.getLength(), temp.getLength());
   }

   public void testSampleDecodeString01()
   {
       ArrayList<StringPart> parts = new ArrayList<StringPart>();
       StringCoder sc = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
       String sol = "computers";
       StringPart temp = new StringPart(19, 1);
       parts.add(temp);
       temp = new StringPart(31, 2);
       parts.add(temp);
       temp = new StringPart(7, 1);
       parts.add(temp);
       temp = new StringPart(42, 3);
       parts.add(temp);
       temp = new StringPart(10, 2);
       parts.add(temp);

       assertEquals(sol, sc.decodeString(parts));

       parts = new ArrayList<StringPart>();
       sc = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
       sol = "wewerefromtheovenjuteb";
       temp = new StringPart(12, 2);
       parts.add(temp);
       temp = new StringPart(12, 4);
       parts.add(temp);
       temp = new StringPart(29, 7);
       parts.add(temp);
       temp = new StringPart(37, "ovenjuteb".length());
       parts.add(temp);

       assertEquals(sol, sc.decodeString(parts));
    }

   public void testSampleEncodeString01()
   {
       ArrayList<StringPart> parts = new ArrayList<StringPart>();
       StringCoder sc = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
       String word = "computers";
       StringPart temp = new StringPart(19, 1);
       parts.add(temp);
       temp = new StringPart(31, 2);
       parts.add(temp);
       temp = new StringPart(7, 1);
       parts.add(temp);
       temp = new StringPart(42, 3);
       parts.add(temp);
       temp = new StringPart(10, 2);
       parts.add(temp);

       ArrayList<StringPart> sol =  sc.encodeString(word);
       assertEquals(parts.size(), sol.size());
       for(int j = 0; j <parts.size(); j++)
       {
          assertEquals(parts.get(j).getStart(), sol.get(j).getStart());
          assertEquals(parts.get(j).getLength(), sol.get(j).getLength());
       }
    }
}