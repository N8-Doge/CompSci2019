import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RubricsCubeTest extends junit.framework.TestCase
{
   public void testRubricsCube01()
   {
      RubriksCube cube = new RubriksCube();
      assertEquals("yellow", cube.getColorOfTopRowRightColumn());
      cube.topRowToTheRight();
      assertEquals("white", cube.getColorOfTopRowMiddleColumn());
      assertEquals("yellow", cube.getColorOfMiddleRowRightColumn());

      cube.leftColumnUp();
      assertEquals("yellow", cube.getColorOfMiddleRowMiddleColumn());
      assertEquals("red", cube.getColorOfBottomRowLeftColumn());
    }
}