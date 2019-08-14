import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BiodiversityTest extends junit.framework.TestCase
{
    public void testBiodiversity01()
   {
      assertEquals(1, Biodiversity.getDiversity("AAAA"));
      assertEquals(3, Biodiversity.getDiversity("DDDDDDDDDDDDDDDDDDDDDDDDAAADDDDDAADDDDDAAADAAAA"));
      assertEquals(3, Biodiversity.getDiversity("AAADDDDDAADDDDDAAADAAAA"));
      assertEquals(1, Biodiversity.getDiversity("AAADDDDDAAADDDDDAAADAAADDDD"));
      assertEquals(2, Biodiversity.getDiversity("DDDDDDDAAAADDDDDAADDDDDAADAAAADDDDDD"));
   }
}