////////////////////////////////////////////////////////////////////////////
//
//    Mr. Allen            
//
//    Purpose	     :  Hannah Counter.
//
//    Interface     :  None
//
//    Side-effects  :  exasperation, 
//                     vexation,
//                     botheration
//
////////////////////////////////////////////////////////////////////////////
/**
 *  WordCounter.
 * 
 * @author Your name here
 * 
 * @version (a version number or a date)
 */
public class WordCounter
{
    // instance variables - replace the example below with your own
    private String[] myLetters;

    /**
     * Constructor for objects of class TearCalculator
     */
    public WordCounter(String[] letters)
    {
        myLetters = letters;
    }

    /**
     * The starting method
     * 
     * @param  target, a String  - the 'word' thouest is looking for-est
     * @return     the number of times target can be found in myLetters 
     *             without 'jumping on thy self'
     *             
     *  see the associated word doc.
     */
    public int countEmAll(String target)
    {
        int total = 0;
        for (int i = 0; i < myLetters.length; i++)
            for (int j = 0; j < myLetters[i].length(); j++)
            /* fix this code*/;
        return total;
    }

    /**
     * The recursive helper method - looking for the next letter in target
     * 
     * @param  total:   current number of time target has been found
     *         row:     current row the method is searching
     *         col:     current col the method is searching
     *         target:  the remaining string that needs to found
     *         
     * @return   Either the total number of ways target can be built from
     *           myLetters[row][col]
     */
    private int countWord(int total, int row, int col, String target)
    {
        // add your code here
        return total;
    }
}