import java.lang.*;
import java.util.*;
import java.lang.Math;
public class ArrayQueue{
    private int front,back,size;
    private String[] myQueue;
    public ArrayQueue(){
        myQueue = new String[5];
        size = back = front = 0;
    }

    public void enqueue(String item){
        if(size==myQueue.length){
            String[] nq = new String[size*2];
            for(int i=0;i<myQueue.length;++i)
                nq[i]=myQueue[i];
            myQueue=nq;
        }
        myQueue[back++]=item;
        size++;
    }

    public String dequeue(){
        size--;
        return myQueue[front++];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String[] getQueue(){
        return myQueue;
    }
}