import java.lang.*;
import java.util.*;
import java.lang.Math;
public class ArrayStack{
    private String[] myStack;
    private int top;

    public ArrayStack(){
        myStack = new String[10];
        top = 0;
    }

    public String pop(){
        return myStack[top--];
    }

    public void push(String item){
        if(top==myStack.length-1){
            String[] nS = new String[2*myStack.length];
            for(int i=0;i<myStack.length;++i)
                nS[i]=myStack[i];
            myStack=nS;
        }
        myStack[++top]=item;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public int size(){
        return top;
    }

    public String[] getStack(){
        return myStack;
    }
}