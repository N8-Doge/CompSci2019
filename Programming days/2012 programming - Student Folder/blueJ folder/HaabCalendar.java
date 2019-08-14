import java.util.*;
/**
 * Write a description of class HaabCalender here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HaabCalendar
{
    int      numberOfTheDay;
    String   month;
    int      year;

    public HaabCalendar(int notd, String m, int y)
    {
       numberOfTheDay = notd;
       month = m;
       year = y;
    }

    public TzolkinCalendar changeCalendar()
    {
       return new TzolkinCalendar(1, "imix", 2011);
    }
}