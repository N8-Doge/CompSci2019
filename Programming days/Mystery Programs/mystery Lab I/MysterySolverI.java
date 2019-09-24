import java.util.*;

/*    for all methods - you get 
StringTokenizer strTok = new StringTokenizer(input);
Stack<?????> s = new Stack<??????>();
Queue<?????> q = new LinkedList<?????>();
plus one other Object  // no collections or List or ....

plus a String only to return the result
 */     

public class MysterySolverI implements MysterySolverInterfaceI
{

    public String mystery1(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        String str = new String();
        while(strTok.hasMoreTokens())
            s.push(strTok.nextToken());
        while(!s.empty())
            str+=s.pop()+" ";
        return str.substring(0,str.length()-1);
    }

    public String mystery2(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }

    public String mystery3(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<Integer> s = new Stack<Integer>();
        String str = new String();
        while(strTok.hasMoreTokens())
            s.push(Integer.parseInt(strTok.nextToken()));
        while(!s.empty())
            str+=""+(int)Math.pow(s.pop(),2)+" ";
        return str.substring(0,str.length()-1);
    }

    public String mystery4(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        String r = new String();
        while(strTok.hasMoreTokens())
            s.push(Integer.parseInt(strTok.nextToken()));
        while(!s.empty()){
            q.add(s.pop());
        }
        while(!q.empty())
            r+=""+q.poll()+" ";
        return r.substring(0,str.length()-1);
    }

    public String mystery5(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */     
        return "";
    }
}