import java.util.*;

public class RPSSL 
{
   public String playRound(Player p1, Player p2)
   {
   	  if (p1.getChoice().equals("rock"))
   	  {
   	      if (p2.getChoice().equals("lizard") || p2.getChoice().equals("scissors"))
   	         return p1.getName();
   	      if (p2.getChoice().equals("paper") || p2.getChoice().equals("spock"))
   	         return p2.getName();
     	  return "TIE";
   	  }
   	  if (p1.getChoice().equals("lizard"))
   	  {
   	      if (p2.getChoice().equals("paper") || p2.getChoice().equals("spock"))
   	         return p1.getName();
   	      if (p2.getChoice().equals("rock") || p2.getChoice().equals("scissors"))
   	         return p2.getName();
     	  return "TIE";
   	  }
   	  if (p1.getChoice().equals("spock"))
   	  {
   	      if (p2.getChoice().equals("rock") || p2.getChoice().equals("scissors"))
   	         return p1.getName();
   	      if (p2.getChoice().equals("lizard") || p2.getChoice().equals("paper"))
   	         return p2.getName();
     	  return "TIE";
   	  }
   	  if (p1.getChoice().equals("scissors"))
   	  {
   	      if (p2.getChoice().equals("lizard") || p2.getChoice().equals("paper"))
   	         return p1.getName();
   	      if (p2.getChoice().equals("spock") || p2.getChoice().equals("rock"))
   	         return p2.getName();
     	  return "TIE";
   	  }
   	  if (p1.getChoice().equals("paper"))
   	  {
   	      if (p2.getChoice().equals("spock") || p2.getChoice().equals("rock"))
   	         return p1.getName();
   	      if (p2.getChoice().equals("lizard") || p2.getChoice().equals("scissors"))
   	         return p2.getName();
     	  return "TIE";
   	  }
   	  return "How did I get here";
   }
}