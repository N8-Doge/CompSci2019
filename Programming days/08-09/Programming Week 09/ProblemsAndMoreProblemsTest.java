import java.util.*;

/**
 * The test class FunctionsAndMoreFunctionsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProblemsAndMoreProblemsTest extends junit.framework.TestCase
{
   public void testProblemsAndMoreProblems00()
   {
      assertEquals(43,  ProblemsAndMoreProblems.problem1(10, 3));
      assertEquals(true, Math.abs(19402.74809 - ProblemsAndMoreProblems.problem2(-5)) < 0.05);
      assertEquals(true, Math.abs(3.2850 - ProblemsAndMoreProblems.problem3(10, 1)) < 0.05);
      assertEquals(true, Math.abs(-12.172968 - ProblemsAndMoreProblems.problem4(5, 2, 5)) < 0.05);
      assertEquals(true, Math.abs(31.45921 - ProblemsAndMoreProblems.problem5(7/3., 2., 0.5)) < 0.05);
      assertEquals(true, Math.abs(188.46168 - ProblemsAndMoreProblems.problem6(3.1, 2.4, 1.9)) < 0.05);
      assertEquals(true, Math.abs(4.0705124 - ProblemsAndMoreProblems.problem7(0.9, 1, 1.1)) < 0.05);
      assertEquals(true, Math.abs(13.344057809078318 - ProblemsAndMoreProblems.problem8(0.7, -0.5)) < 0.05);
      assertEquals(true, Math.abs(106378.58236 - ProblemsAndMoreProblems.problem9(1, 2, 3, 4, 5)) < 0.05);
      assertEquals(true, Math.abs(47.314003207741756 - ProblemsAndMoreProblems.problem10(6, 20, 3, -5, 3)) < 0.05);
   }

   public void testProblemsAndMoreProblems01a()
   {
      assertEquals(34,  ProblemsAndMoreProblems.problem1(5, 14));
   }

   public void testProblemsAndMoreProblems01b()
   {
      assertEquals(40693, ProblemsAndMoreProblems.problem1(25, 16));
   }

   public void testProblemsAndMoreProblems01c()
   {
      assertEquals(279,  ProblemsAndMoreProblems.problem1(8, 22));
   }

   public void testProblemsAndMoreProblems01d()
   {
      assertEquals(688,  ProblemsAndMoreProblems.problem1(21, 10));
   }

   public void testProblemsAndMoreProblems01e()
   {
      assertEquals(34,  ProblemsAndMoreProblems.problem1(5, 14));
      assertEquals(40693, ProblemsAndMoreProblems.problem1(25, 16));
      assertEquals(279,  ProblemsAndMoreProblems.problem1(8, 22));
      assertEquals(688,  ProblemsAndMoreProblems.problem1(21, 10));
      assertEquals(43,  ProblemsAndMoreProblems.problem1(16, 3));
   }

   public void testProblemsAndMoreProblems02a()
   {
      assertEquals(true, Math.abs(103967.08860759494 - ProblemsAndMoreProblems.problem2(-18)) < 0.05);
   }

   public void testProblemsAndMoreProblems02b()
   {
      assertEquals(true, Math.abs(274.4040404040404 - ProblemsAndMoreProblems.problem2(-4)) < 0.05);
   }

   public void testProblemsAndMoreProblems02c()
   {
      assertEquals(true, Math.abs(232107.8491335372 - ProblemsAndMoreProblems.problem2(-22)) < 0.05);
   }

   public void testProblemsAndMoreProblems02d()
   {
      assertEquals(true, Math.abs(41806.45161290322 - ProblemsAndMoreProblems.problem2(3)) < 0.05);
   }

   public void testProblemsAndMoreProblems02e()
   {
      assertEquals(true, Math.abs(103967.08860759494 - ProblemsAndMoreProblems.problem2(-18)) < 0.05);
      assertEquals(true, Math.abs(274.4040404040404 - ProblemsAndMoreProblems.problem2(-4)) < 0.05);
      assertEquals(true, Math.abs(232107.8491335372 - ProblemsAndMoreProblems.problem2(-22)) < 0.05);
      assertEquals(true, Math.abs(41806.45161290322 - ProblemsAndMoreProblems.problem2(3)) < 0.05);
      assertEquals(true, Math.abs(20572.593431372825 - ProblemsAndMoreProblems.problem2(-12)) < 0.05);
   }

   public void testProblemsAndMoreProblems03a()
   {
      assertEquals(true, Math.abs(0.0027466795956978016 - ProblemsAndMoreProblems.problem3(25, 20)) < 0.05);
   }

   public void testProblemsAndMoreProblems03b()
   {
      assertEquals(true, Math.abs(0.013924459075937553 - ProblemsAndMoreProblems.problem3(9, 14)) < 0.05);
   }

   public void testProblemsAndMoreProblems03c()
   {
      assertEquals(true, Math.abs(0.19422676128444352 - ProblemsAndMoreProblems.problem3(5, 3)) < 0.05);
   }

   public void testProblemsAndMoreProblems03d()
   {
      assertEquals(true, Math.abs(0.0027466795956978016 - ProblemsAndMoreProblems.problem3(25, 20)) < 0.05);
      assertEquals(true, Math.abs(0.013924459075937553 - ProblemsAndMoreProblems.problem3(9, 14)) < 0.05);
      assertEquals(true, Math.abs(0.19422676128444352 - ProblemsAndMoreProblems.problem3(5, 3)) < 0.05);
      assertEquals(true, Math.abs(0.010323136644518753 - ProblemsAndMoreProblems.problem3(10, 16)) < 0.05);
   }

   public void testProblemsAndMoreProblems04a()
   {
      assertEquals(true, Math.abs(-14.191084642845682 - ProblemsAndMoreProblems.problem4(-2, -3, 20)) < 0.05);
   }

   public void testProblemsAndMoreProblems04b()
   {
      assertEquals(true, Math.abs(54.99029463511852 - ProblemsAndMoreProblems.problem4(-21, 2, -36)) < 0.05);
   }

   public void testProblemsAndMoreProblems04c()
   {
      assertEquals(true, Math.abs(10.8957996359804498 - ProblemsAndMoreProblems.problem4(-7, 5, -9)) < 0.05);
   }

   public void testProblemsAndMoreProblems04d()
   {
      assertEquals(true, Math.abs(-42.07963286750715 - ProblemsAndMoreProblems.problem4(5, 1, 36)) < 0.05);
   }

   public void testProblemsAndMoreProblems04e()
   {
      assertEquals(true, Math.abs(-14.191084642845682 - ProblemsAndMoreProblems.problem4(-2, -3, 20)) < 0.05);
      assertEquals(true, Math.abs(54.99029463511852 - ProblemsAndMoreProblems.problem4(-21, 2, -36)) < 0.05);
      assertEquals(true, Math.abs(10.8957996359804498 - ProblemsAndMoreProblems.problem4(-7, 5, -9)) < 0.05);
      assertEquals(true, Math.abs(-42.07963286750715 - ProblemsAndMoreProblems.problem4(5, 1, 36)) < 0.05);
      assertEquals(true, Math.abs(4.7715163077651646 - ProblemsAndMoreProblems.problem4(4, 6, -15)) < 0.05);
   }

   public void testProblemsAndMoreProblems05a()
   {
      assertEquals(true, Math.abs(26343.559736970397 - ProblemsAndMoreProblems.problem5(25, -10, 20)) < 0.05);
   }

   public void testProblemsAndMoreProblems05b()
   {
      assertEquals(true, Math.abs(1108.960323489566 - ProblemsAndMoreProblems.problem5(23, -6, 11)) < 0.05);
   }

   public void testProblemsAndMoreProblems05c()
   {
      assertEquals(true, Math.abs(84.28959632772819 - ProblemsAndMoreProblems.problem5(23, -6, 8)) < 0.05);
   }

   public void testProblemsAndMoreProblems05d()
   {
      assertEquals(true, Math.abs(26343.559736970397 - ProblemsAndMoreProblems.problem5(25, -10, 20)) < 0.05);
      assertEquals(true, Math.abs(1108.960323489566 - ProblemsAndMoreProblems.problem5(23, -6, 11)) < 0.05);
      assertEquals(true, Math.abs(84.28959632772819 - ProblemsAndMoreProblems.problem5(23, -6, 8)) < 0.05);
   }

   public void testProblemsAndMoreProblems06a()
   {
      assertEquals(true, Math.abs(1700622.1982287425 - ProblemsAndMoreProblems.problem6(18, 24, 43)) < 0.05);
   }

   public void testProblemsAndMoreProblems06b()
   {
      assertEquals(true, Math.abs(-1.2523004839886591 - ProblemsAndMoreProblems.problem6(-18, 14, 15)) < 0.05);
   }

   public void testProblemsAndMoreProblems06c()
   {
      assertEquals(true, Math.abs(-4.294047382220627 - ProblemsAndMoreProblems.problem6(4, 19, 22)) < 0.05);
   }

   public void testProblemsAndMoreProblems06d()
   {
      assertEquals(true, Math.abs(188.49928416824443 - ProblemsAndMoreProblems.problem6(5, 14, 0)) < 0.05);
   }

   public void testProblemsAndMoreProblems06e()
   {
      assertEquals(true, Math.abs(1700622.1982287425 - ProblemsAndMoreProblems.problem6(18, 24, 43)) < 0.05);
      assertEquals(true, Math.abs(-1.2523004839886591 - ProblemsAndMoreProblems.problem6(-18, 14, 15)) < 0.05);
      assertEquals(true, Math.abs(-4.294047382220627 - ProblemsAndMoreProblems.problem6(4, 19, 22)) < 0.05);
      assertEquals(true, Math.abs(188.49928416824443 - ProblemsAndMoreProblems.problem6(5, 14, 0)) < 0.05);
      assertEquals(true, Math.abs(-0.3814776671641231 - ProblemsAndMoreProblems.problem6(-18, 28, 23)) < 0.05);
   }

   public void testProblemsAndMoreProblems07a()
   {
      assertEquals(true, Math.abs(ProblemsAndMoreProblems.problem7(1, 27, 14)) < 0.05);
   }

   public void testProblemsAndMoreProblems07b()
   {
      assertEquals(true, Math.abs(4.4896325534902966 - ProblemsAndMoreProblems.problem7(0, 27, 15)) < 0.05);
   }

   public void testProblemsAndMoreProblems07c()
   {
      assertEquals(true, Math.abs(0.6015167511823717 - ProblemsAndMoreProblems.problem7(0, 24, 41)) < 0.05);
   }

   public void testProblemsAndMoreProblems07d()
   {
      assertEquals(true, Math.abs(36.27009773121567 - ProblemsAndMoreProblems.problem7(0, 3, 48)) < 0.05);
   }

   public void testProblemsAndMoreProblems07e()
   {
      assertEquals(true, Math.abs(ProblemsAndMoreProblems.problem7(1, 27, 14)) < 0.05);
      assertEquals(true, Math.abs(4.4896325534902966 - ProblemsAndMoreProblems.problem7(0, 27, 15)) < 0.05);
      assertEquals(true, Math.abs(0.6015167511823717 - ProblemsAndMoreProblems.problem7(0, 24, 41)) < 0.05);
      assertEquals(true, Math.abs(36.27009773121567 - ProblemsAndMoreProblems.problem7(0, 3, 48)) < 0.05);
   }

   public void testProblemsAndMoreProblems08a()
   {
      assertEquals(true, Math.abs(1.573301276012362 - ProblemsAndMoreProblems.problem8(0.0, 1.1)) < 0.05);
   }

   public void testProblemsAndMoreProblems08b()
   {
      assertEquals(true, Math.abs(8369230.536791829 - ProblemsAndMoreProblems.problem8(1.3, 3.5)) < 0.05);
   }

   public void testProblemsAndMoreProblems08c()
   {
      assertEquals(true, Math.abs(4.230771270218148 - ProblemsAndMoreProblems.problem8(1.4, 1.2)) < 0.05);
   }

   public void testProblemsAndMoreProblems08d()
   {
      assertEquals(true, Math.abs(1.573301276012362 - ProblemsAndMoreProblems.problem8(0.0, 1.1)) < 0.05);
      assertEquals(true, Math.abs(8369230.536791829 - ProblemsAndMoreProblems.problem8(1.3, 3.5)) < 0.05);
      assertEquals(true, Math.abs(4.230771270218148 - ProblemsAndMoreProblems.problem8(1.4, 1.2)) < 0.05);
      assertEquals(true, Math.abs(2.984565193407736 - ProblemsAndMoreProblems.problem8(1.2, -0.6)) < 0.05);
   }

   public void testProblemsAndMoreProblems09a()
   {
      assertEquals(true, Math.abs(148192.4288187874 - ProblemsAndMoreProblems.problem9(-3, -3, 4, 4, 10)) < 0.05);
   }

   public void testProblemsAndMoreProblems09b()
   {
      assertEquals(true, Math.abs(51.951714857603335 - ProblemsAndMoreProblems.problem9(0, -7, 45, 49, 1)) < 0.05);
   }

   public void testProblemsAndMoreProblems09c()
   {
      assertEquals(true, Math.abs(31.700174821883714 - ProblemsAndMoreProblems.problem9(-7, -2, 7, 14, 26)) < 0.05);
   }

   public void testProblemsAndMoreProblems09d()
   {
      assertEquals(true, Math.abs(148192.4288187874 - ProblemsAndMoreProblems.problem9(-3, -3, 4, 4, 10)) < 0.05);
      assertEquals(true, Math.abs(51.951714857603335 - ProblemsAndMoreProblems.problem9(0, -7, 45, 49, 1)) < 0.05);
      assertEquals(true, Math.abs(31.700174821883714 - ProblemsAndMoreProblems.problem9(-7, -2, 7, 14, 26)) < 0.05);
      assertEquals(true, Math.abs(65932.33680330997 - ProblemsAndMoreProblems.problem9(-7, -5, 35, 29, 56)) < 0.05);
   }

   public void testProblemsAndMoreProblems10a()
   {
      assertEquals(true, Math.abs(-0.6328045303147218 - ProblemsAndMoreProblems.problem10(25, 15, 1, -1, 1)) < 0.05);
   }

   public void testProblemsAndMoreProblems10b()
   {
      assertEquals(true, Math.abs(1.718271875348925 - ProblemsAndMoreProblems.problem10(34, 35, 13, 0, 3)) < 0.05);
   }

   public void testProblemsAndMoreProblems10c()
   {
      assertEquals(true, Math.abs(9040262.155521104 - ProblemsAndMoreProblems.problem10(15, 39, 11, -12, 53)) < 0.05);
   }

   public void testProblemsAndMoreProblems10d()
   {
      assertEquals(true, Math.abs(-0.6328045303147218 - ProblemsAndMoreProblems.problem10(25, 15, 1, -1, 1)) < 0.05);
      assertEquals(true, Math.abs(1.718271875348925 - ProblemsAndMoreProblems.problem10(34, 35, 13, 0, 3)) < 0.05);
      assertEquals(true, Math.abs(9040262.155521104 - ProblemsAndMoreProblems.problem10(15, 39, 11, -12, 53)) < 0.05);
   }

   public void testProblemsAndMoreProblems_testEmAll()
   {
      testProblemsAndMoreProblems10d();
      testProblemsAndMoreProblems09d();
      testProblemsAndMoreProblems08d();
      testProblemsAndMoreProblems07c();
      testProblemsAndMoreProblems06e();
      testProblemsAndMoreProblems05d();
      testProblemsAndMoreProblems04e();
      testProblemsAndMoreProblems03d();
      testProblemsAndMoreProblems02e();
      testProblemsAndMoreProblems01e();
   }

   public void testProblemsAndMoreProblems_testEmAll4_48()
   {
      testProblemsAndMoreProblems_testEmAll();
   }

   public void testProblemsAndMoreProblems_testEmAll4_49()
   {
      testProblemsAndMoreProblems_testEmAll();
   }

   public void testProblemsAndMoreProblems_testEmAll4_50()
   {
      testProblemsAndMoreProblems_testEmAll();
   }
}