import java.util.*;
import java.lang.Math;
import java.lang.*;

/**
 * Write a description of class Translator here.
 * 
 * @author 2007 SC programming contest 
 * @version (a version number or a date)
 */
public class Translator
{
//    you create/use your own data structure to store the dictionary
    String[] goodWords;

    public Translator(String[] dictionary)
    {
        goodWords = dictionary;
    }

    public String[] decodeMessage(String[] story)
    {
        String[] temp = new String[story.length];
        
        for (int ind = 0; ind < story.length; ind++)
            if (story[ind].length() == 1)
               temp[ind] = story[ind];
            else
               for (int index = 0; index < goodWords.length; index++)
                  if (sameLetters(story[ind], goodWords[index]))
                     temp[ind] = goodWords[index];
        
        return temp;
    }

    private boolean sameLetters(String word1, String word2)
    {
        String w1 = word1.toUpperCase();
        String w2 = word2.toUpperCase();
        if (w1.length() != w2. length()) return false;
        for (int ind = 0; ind < w1.length(); ind++)
           if (w2.indexOf(w1.substring(ind, ind+1)) != -1)
           {
               int loc = w2.indexOf(w1.substring(ind, ind+1));
               w2 = w2.substring(0, loc) + w2.substring(loc + 1);
           }
        return w2.length() == 0;
              
    }
}