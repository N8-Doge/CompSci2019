import java.util.*;
/**
 * Write a description of class TzolkinCalener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TzolkinCalendar
{
   int number;
   String nameOfTheDay;
   int year;
   boolean firstHalf;

   public TzolkinCalendar(int num, String notd, int y)
   {
      number = num;
      nameOfTheDay = notd;
      year = y;
   }

   public boolean equals(Object obj)
   {
      TzolkinCalendar tc = (TzolkinCalendar)obj;
      return number == tc.number
             && nameOfTheDay.equals(tc.nameOfTheDay) 
             && year == tc.year;
   }
//  methods I added to solve promblem
   public int getNumber() { return number; }
   public String getNameOfTheDay(){ return nameOfTheDay; }
   public int getYear(){return year;}
   public String toString()
   { return getNumber() + " " + getNameOfTheDay() + " " + getYear(); }
   public void advanceDay()
   {
      number++;
      if (number == 14)
         number = 1;
      advanceNameOfTheDay();
   }
   private void advanceNameOfTheDay()
   {
      String[] allDaysNames = {"imix", "ik", "akbal", "kan", "chicchan",
                               "cimi", "manik", "lamat", "muluk", "ok",
                               "chuen", "eb", "ben", "ix", "mem", "cib",
                               "caban", "eznab", "canac", "ahau" };
      int ind = 0;
      while( !allDaysNames[ind].equals(nameOfTheDay))
         ind++;
      ind++;
      if (ind < allDaysNames.length)
         nameOfTheDay = allDaysNames[ind];
      else
         nameOfTheDay = allDaysNames[0];
   }
   public void advanceYear()
   {
      year++;
      number = 1;
      nameOfTheDay = "imix";
      firstHalf = true;
   }
}