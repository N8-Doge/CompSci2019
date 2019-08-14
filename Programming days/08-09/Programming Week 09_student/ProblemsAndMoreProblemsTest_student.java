public class ProblemsAndMoreProblemsTest_student extends junit.framework.TestCase
{
   public void testProblemsAndMoreProblems_student00()
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
}