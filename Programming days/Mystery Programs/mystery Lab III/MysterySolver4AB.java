import java.util.*;

/*    for all methods - you get 
StringTokenizer strTok = new StringTokenizer(input);
Stack<?????> s = new Stack<??????>();
Queue<?????> q = new LinkedList<?????>();
plus one other Object

plus a String only to return the result
 */     

public class MysterySolver4AB implements MysterySolverInterface4AB
{
    /*
     *   required operators for PreFix and Post are:
     *     *, /, +, -, % and ^ (exponent)
     *     
     *     You may assume all inputs are integers,
     *     all calculations should done using integer Math  (5 / 2 == 2)
     */
    public String mysteryPreFix(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }

    public String mysteryPostFix(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }

    public String mysteryP(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }

    public String mysteryS(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Queue<Integer> q = new LinkedList<Integer>();
        String str = new String();
        Integer i = Integer.parseInt(strTok.nextToken());
        q.add(i);
        while(strTok.hasMoreTokens()){
            int n = Integer.parseInt(strTok.nextToken());
            if(n<i)
                i=n;
            boolean b = true;
            while(b){
                if(n<q.peek()){
                    q.add(n);
                    b=false;
                }
                else
                    q.add(q.poll());
            }
            System.out.println("I have successfully added "+n);
            while(q.peek()!=i)
                q.add(q.poll());
            System.out.println("Reset order");
        }
        while(q.size()!=0){
            str += Integer.toString(q.poll())+" ";
        }
        return str.substring(0,str.length()-1);
    }  

    /*
     *    See tester for sample input - output
     *    
     *    You may assume the first int < second int.
     *    
     *    You may assume all three ints will be greater than 0
     */  

    public String mystery10(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }

    /*
     *    Precondition:  The tester will never have more than 3 consecutive numbers
     *                   That is, the same number will never appear more than 3 times in a row
     *                   
     *    restating the precondition
     *
     *    you may assume no input will have more than 3 consecutive digits
     *    that is:  3333, 211116, 10000000, 33334444 are all invalid values for the first part of the input
     *    but:       123456, 300044412, ... are valid values for the first part of input
     *    
     */  
    public String mysteryC(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }
}