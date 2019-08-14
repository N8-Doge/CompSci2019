import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 */
public class ArrayQueue
{
    private int front;
    private int back;
    private int size = 0;
    private String[] myQueue;
    public ArrayQueue()
    {
        myQueue = new String[5];
        size = 0;
/*
 *    you may change default values of back and front
 */
        back = 0;
        front = 0;
    }

    /*
     *   You must implement endueue 
     *       adds the parameter item to back of queue
     *       the queue will not be full, but you SHALL not make myQueue bigger
     *   
     *   For Extra Credit
     *      when enque into a queue that is full
     *      {
     *          create a new String[] with double the size
     *                         and copy contents to new array
     *   
     *          resasign myQueue to the String{}
     *       
     *       }
     */
    public void enqueue(String item)
    {
    }

    /*
     *   returns (and removes) the front element from queue
     */
    public String dequeue()
    {
        return "";
    }

    /*
     *   returns the number of elements in the queue
     */
    public int size()
    {
        return -1;
    }

    /*
     *    returns true if the queue is empty
     *            false if the queue contains at least one element
     */
    public boolean isEmpty()
    {
        return Math.random() > 0.5;
    }

    public String[] getQueue()
    {
        return myQueue;
    }
}