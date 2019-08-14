import java.util.*;

/**
 * The test class StudentTester.
 *
 * @author  Mr. Allen
 * @version (a version number or a date)
 */
public class TransportStudentTester extends junit.framework.TestCase
{
   public void testTransport01()
   {
      List<Package> pks = new ArrayList<Package>();
      pks.add(new Package(2, 3));
      pks.add(new Package(2, 2));
      pks.add(new Package(3, 3));
      Transport tp = new Transport(pks, 5);
      assertEquals(6, tp.getMaxCargo());

      pks = new ArrayList<Package>();
      pks.add(new Package(7, 42));
      pks.add(new Package(3, 12));
      pks.add(new Package(4, 40));
      pks.add(new Package(5, 25));
      tp = new Transport(pks, 10);
      assertEquals(65, tp.getMaxCargo());
   }
}