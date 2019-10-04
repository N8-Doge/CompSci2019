import java.util.*;

/*    for all methods - you get 
StringTokenizer strTok = new StringTokenizer(input);
Stack<?????> s = new Stack<??????>();
Queue<?????> q = new LinkedList<?????>();
plus one other Object

plus a String only to return the result
 */     

public class MysterySolverII implements MysterySolverInterfaceII
{
    public String mystery6(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Queue<Integer> q = new LinkedList<Integer>();
        String str = new String();
        Integer i = new Integer(0);
        while(strTok.hasMoreTokens()){
            i+=Integer.parseInt(strTok.nextToken());
            q.add(i);
        }
        while(q.size()!=0)
            str+=Integer.toString(q.poll())+" ";
        return str.substring(0,str.length()-1);
    }

    public String mystery7(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Queue<Integer> q = new LinkedList<Integer>();
        String str = new String();
        Integer i = new Integer(0);
        while(strTok.hasMoreTokens())
            q.add(Integer.parseInt(strTok.nextToken()));
        return "";
    }

    public String mystery8(String input)
    {
        return "";
    }

    public String mystery9(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }

    public String mysteryF(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }
}