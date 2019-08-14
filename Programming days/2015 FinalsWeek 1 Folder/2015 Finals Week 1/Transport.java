import java.util.*;
import java.lang.*;
import java.io.*;

public class Transport 
{
   private List<Package> items;
   private int capacity;

   public Transport(List<Package> p, int cap)
   {
      items = p;
      capacity = cap;
   }

   public int getMaxCargo()
   {
      return -1;
   }
}