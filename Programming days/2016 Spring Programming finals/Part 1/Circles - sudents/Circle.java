import java.util.*;

public class Circle 
{
// add your own instance variables
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

   public double getCircleArea()
   {
      return -1;
   }

   public double getCirclePerimeter()
   {
      return -1;
   }

   public double getTriangleArea()
   {
      return -1;
   }

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