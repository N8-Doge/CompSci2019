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
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        String str = new String();
        while(strTok.hasMoreTokens()){
            Integer i = Integer.parseInt(strTok.nextToken());
            if(i%2==1)
                s.push(i);
            else
                q.add(i);
        }
        while(!s.empty())
            str+=s.pop()+" ";
        while(q.size()!=0)
            str+=q.poll()+" ";
        return str.substring(0,str.length()-1);
    }

    public String mystery3(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<Integer> s = new Stack<Integer>();
        String str = new String();
        while(strTok.hasMoreTokens())
            s.push(Integer.parseInt(strTok.nextToken()));
        while(!s.empty()){
            Integer i = new Integer(s.pop());
            i*=i;
            str+=""+i+" ";
        }
        return str.substring(0,str.length()-1);
    }

    public String mystery4(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        String r = new String();
        Integer i = new Integer(1);
        while(strTok.hasMoreTokens())
            q.add(Integer.parseInt(strTok.nextToken()));
        while(q.size()!=0){
            i*=q.poll();
            s.push(i);
        }
        while(!s.empty())
            r+=" "+s.pop();
        return r.substring(1);
    }

    public String mystery5(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        String r = new String();
        Integer i = new Integer(1);
        while(strTok.hasMoreTokens())
            q.add(Integer.parseInt(strTok.nextToken()));
        while(q.size()!=0){
            i*=q.poll();
            s.push(i);
        }
        while(!s.empty())
            r=""+s.pop()+" "+r;
        return r.substring(0,r.length()-1);
    }
}