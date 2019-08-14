import java.util.*;

public class MiningCenter 
{
   private ArrayList<Site> mines;
//   boolean flag = true;
   boolean flag = false;
   
/*
 *    precondition: m.size() > 0
 */
   public MiningCenter(ArrayList<Site> m)
   {
       mines = m;
   }

   public Site getCenter()
   {
      int minX = mines.get(0).getX();
      int maxX = mines.get(0).getX();
      int minY = mines.get(0).getY();
      int maxY = mines.get(0).getY();

      for (Site m : mines)
      {
          if (m.getX() < minX) minX = m.getX();
          if (m.getX() > maxX) maxX = m.getX();
          if (m.getY() < minY) minY = m.getY();
          if (m.getY() > maxY) maxY = m.getY();
      }
//    if (flag)      System.out.println("minX = " + minX + " maxX = " + maxX + " minY = " + minY + " maxY = " + maxY);

      ArrayList<Site> locs = new ArrayList<Site>();
      locs.add(new Site(minX, minY));
      int dist = maxDistance(minX, minY);

      for (int xIndex = minX; xIndex <= maxX; xIndex++)
      {
          for (int yIndex = minY; yIndex <= maxY; yIndex++)
          {
              if (xIndex != minX || yIndex != minY)
              {
                  int d = maxDistance(xIndex, yIndex);
//    if (flag)                  System.out.println("d = " + d);
                  if (d == dist)
                     locs.add(new Site(xIndex, yIndex));
                  else if (d < dist)
                  {
                      locs = new ArrayList<Site>();
                      locs.add(new Site(xIndex, yIndex));
//      if (flag)                      System.out.println("new List " + locs + " dist = " + d);
                      dist = d;
                  }
              }
          }
      }
//    if (flag)      System.out.println("ans = " + locs);
      if (locs.size() == 1) return locs.get(0);
      return minCenter(locs);
   }

   private Site minCenter(ArrayList<Site> s)
   {
       Site ans = s.get(0);
       int min = s.get(0).getX();
       boolean flag = min < 0;
       if (min < 0) min = -min;
       for (Site m : s)
       {
          int d = m.getX();
          if (d < 0) d = -d;
          if (d == min && flag)
          {
              ans = m;
          }
          if (d < min)
          {
              min = d;
              ans = m;
          }
       }
       return ans;
   }

   private int maxDistance(int x, int y)
   {
       int ans = 0;
       for (Site m : mines)
       {
           int temp = Math.abs(x - m.getX()) + Math.abs(y - m.getY());
           if (ans < temp) ans = temp;
       }
       return ans;
   }

   private int totalDistance(int x, int y)
   {
       int ans = 0;
       for (Site m : mines)
       {
           ans += Math.abs(x - m.getX()) + Math.abs(y - m.getY());
       }
       return ans;
   }
}