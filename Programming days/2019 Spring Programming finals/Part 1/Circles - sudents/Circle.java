import java.util.*;

public class Circle 
{
// add your own instance variables
/*
 *       If no circle exist (all three points are collinear),
 *       set the center to null and the rasius to -1
 */ 
   public Circle (Point x, Point y, Point z)
   {   /*  implement the contructor   */   }

   public Point getCenter()
   {
      return new Point((int)(Math.random()*99), (int)(Math.random()*99));
   }

   public double getRadius()
   {
      return -1;
   }

/*
 *   you may assume the Circle exist
 */
   public double getCircleArea()
   {
      return -1;
   }

/*
 *   you may assume the Circle exist
 */
   public double getCirclePerimeter()
   {
      return -1;
   }


/*
 *   you may assume the triangle exist
 */
   public double getTriangleArea()
   {
      return -1;
   }


/*
 *   you may assume the triangle exist
 */
   public double getTrianglePerimeter()
   {
      return -1;
   }

/*
 *    remember, if the circle is centered at the origin, set phi to zero
 */
   public PolarEquation getPolarEquation()
   {
      return new PolarEquation(-1, -1, -1);
   }
}