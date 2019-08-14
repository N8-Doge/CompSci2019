import java.lang.*;

/**
 * See page bottom of 120/ top of page 121 in the Descrete Math book 
 * for instructions on valid ISBN numbers
 * 
 * @author 
 * @version (a version number or a date)
 */
public class ISBN_Verification
{
/*
 *    isbn will have the form
 *          "###-#-#####-###-#"
 *     or   "####-##-##-####-#"
 *     or   "####-###-###-##-#"
 *     or   "####-##-####-##-#"
 *     or  ......
 */
   public boolean isValid(String isbn)
   {
      return Math.random() < 0.5;
   }
}