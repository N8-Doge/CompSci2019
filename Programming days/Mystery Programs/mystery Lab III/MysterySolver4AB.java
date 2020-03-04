import java.util.*;
public class MysterySolver4AB implements MysterySolverInterface4AB{
    public String mysteryPreFix(String exprsn){
        exprsn = exprsn.replaceAll(" ", "");
        Stack<Double> s = new Stack<Double>(); 
        for (int j = exprsn.length()-1; j >= 0; j--){ 
            if (isOperand(exprsn.charAt(j))){
                System.out.println( (double)(exprsn.charAt(j) - 48));
                s.push((double)(exprsn.charAt(j) - 48)); 
            }

            else{ 
                double o1 = s.peek(); 
                s.pop(); 
                double o2 = s.peek(); 
                s.pop();
                switch (exprsn.charAt(j)){ 
                    case '+': 
                    s.push(o1 + o2); 
                    break; 
                    case '-': 
                    s.push(o1 - o2); 
                    break; 
                    case '^': 
                    s.push(Math.pow(o1,o2)); 
                    break; 
                    case '*': 
                    s.push(o1 * o2); 
                    break; 
                    case '%': 
                    s.push(o1 % o2); 
                    break; 
                    case '/': 
                    s.push(o1 / o2); 
                    break; 

                } 
            } 
        } 
        int x = (int) Math.round(s.peek());
        return "" + x; 
    }

    public static Boolean isOperand(char c){ 
        return (c >= 48 && c <= 57);
    } 

    public String mysteryPostFix(String input)
    {
        return "";
    }

    public String mysteryP(String input){
        StringTokenizer strTok=new StringTokenizer(input);
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(2);
        Queue<Integer> queue=new LinkedList<Integer>();
        Integer i=Integer.parseInt(strTok.nextToken());
        String ans="2 ";
        while(i>1){
            queue.add(stack.peek());
            stack.push(stack.pop()+1);
            while(queue.peek()!=stack.peek()-1){
                if(stack.peek()%queue.peek()==0)
                    break;
                queue.add(queue.poll());
            }
            if(stack.peek()%queue.peek()!=0){
                ans+=""+stack.peek()+" ";
                i--;
            }
        }
        return ans.substring(0,ans.length()-1);
    }

    public String mysteryS(String input)
    {

        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        String ans = "";
        ArrayList<Integer>elements=new ArrayList<Integer>();
        while(strTok.hasMoreTokens())
        {
            elements.add(Integer.parseInt(strTok.nextToken()));
        }
        Collections.sort(elements);

        for(int i = 0; i < elements.size(); i++)
        {
            ans = ans + " " + elements.get(i);
        }

        return ans.substring(1);
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
        String ans = "";
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();

        double frac = Double.valueOf(strTok.nextToken())/Double.valueOf(strTok.nextToken());
        ans = ans + frac + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";

        //int x= Integer.parseInt(strTok.nextToken());
        ans = ans.substring(2);
        ans = ans.substring(0, Integer.parseInt(strTok.nextToken()));
        //System.out.println(ans);
        return ans;
    }

    public String mysteryC(String number)
    {
        StringTokenizer strTok = new StringTokenizer(number);
        String currentIteration = strTok.nextToken();
        String ans = "OUTPUT:\n" + currentIteration;

        int x = Integer.parseInt(strTok.nextToken());
        strTok = new StringTokenizer(number);

        for(int i = 0; i<x; i++)
        {
            currentIteration = lockAndSaySequence(currentIteration);
            ans = ans + "\n" + currentIteration;
        }

        return ans;
    }

    public String lockAndSaySequence(String number)
    {
        StringBuilder result= new StringBuilder();
        char repeat= number.charAt(0);
        number= number.substring(1) + " ";
        int times= 1;

        for(char actual: number.toCharArray()){
            if(actual != repeat){
                result.append(times + "" + repeat);
                times= 1;
                repeat= actual;
            }else{
                times+= 1;
            }
        }
        return result.toString();
    }
}