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
      return new Site(-111, -111);
   }
}