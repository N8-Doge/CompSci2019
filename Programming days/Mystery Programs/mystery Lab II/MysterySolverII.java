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
        Queue<String> q = new LinkedList<String>();
        String str = new String();
        Integer i = new Integer(0);
        while(strTok.hasMoreTokens()){
            i += Integer.parseInt(strTok.nextToken());
            for(int n=1;n<i;++n)
                q.add(Integer.toString(i)+" ");
            q.add(Integer.toString(i)+"\n");
        }
        while(q.size()!=0)
            str+=q.poll();
        return str.substring(0,str.length()-1);
    }

    public String mystery8(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<Integer> s = new Stack<Integer>();
        String str = new String();
        Integer i = new Integer(0);
        while(strTok.hasMoreTokens())
            s.push(Integer.parseInt(strTok.nextToken()));
        while(!s.isEmpty()){
            i+=s.pop();
            str+=Integer.toString(i)+" ";
        }
        return str.substring(0,str.length()-1);
    }

    public String mystery9(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        String str = new String();
        Integer i;
        while(strTok.hasMoreTokens()){
            i = Integer.parseInt(strTok.nextToken());
            if(i%2==1)
                q.add(i);
            else
                s.push(i);
        }
        while(q.size()!=0)
            str+=q.poll()+" ";
        while(!s.empty())
            str+=s.pop()+" ";
        return str.substring(0,str.length()-1);
    }

    public String mysteryF(String input)
    {
        Stack<Integer> s = new Stack<Integer>();
        String str = new String("1 ");
        Integer i = new Integer(1);
        s.push(i);
        for(int n=1;n<Integer.parseInt(input);n++){
            s.push(i+(i=s.peek()));
            str+=Integer.toString(i)+" ";
        }
        return str.substring(0,str.length()-1);
    }
}