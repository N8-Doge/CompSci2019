 /*
 * code authored by Maria & Gary Litvan
 */

public class WolframAlphaSimulator
{
   private String type;

   /*
    * precondition  s contains:
    *                   single letter variable names
    *                   * for AND
    *                   + for OR
    *                   ! for NOT
    *            note      missing operator implies AND
    *                   (    )
    *    spaces are NOT guanarteed
    */
   public WolframAlphaSimulator(String booleanExpression)
   {
       /* insert code here   */
   }

   /*
    * Evaluates the booleanExpression for the given input
    * 
    * precondition:   values.length == number of inputs in the booleanExpression
    *                
    * postcondition   evaluates the expression using the booleans values in the array
    *                    assume values are in ascending alpha order
    * 
    *                 see the student tester for sample input/output
    */
   public boolean evaluate(boolean[] values)
   {
       return Math.random() > 0.5;
   }

   /*
    *    converts the boolean expression into normal disjunctive form
    *    
    *    postcondition  each term should appear in truth table order
    *                   e.g., TTT, TTF, TFT, TFF, FTT, FTF, FFT, FFF
    *
    */
   public String getDisjunctiveNormalForm()
   {
      return "";
   }
}