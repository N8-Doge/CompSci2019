import java.util.*;
import java.lang.*;

public class SinglyLinkedList{
    private ListNode first;

    public SinglyLinkedList(){
        first = null;
    }

    /**
     * Every object as string and wrapped in brackets
     */
    public String toString(){
        String s = "[";
        for(int i=0;i<size();++i)
            s+=getNodeAtIndex(i).getValue().toString()+", ";
        if(s.length()!=1)
            s=s.substring(0,s.length()-2);
        return s+"]";
    }

    /**
     * Inserts object to list at location
     */
    public void add(int ind, Object obj){
        if(first==null)
            first=new ListNode(obj,null);
        else if(ind==0)
            first=new ListNode(obj,first);
        else
            getNodeAtIndex(ind-1).setNext(new ListNode(obj,getNodeAtIndex(ind)));
    }

    /**
     * Gets object at index
     */
    public Object get(int ind){
        if(first==null)
            return null;
        return getNodeAtIndex(ind).getValue();
    }

    /**
     * Gets node at index
     */
    public ListNode getNodeAtIndex(int ind)
    {
        if(first==null)
            return null;
        ListNode n = first;
        for(int i=0;i<ind;++i)
            n=n.getNext();
        return n;
    }

    /**
     * # of elements in list
     */
    public int size()
    {
        ListNode n = first;
        int r=0;
        while(n!=null){
            n=n.getNext();
            ++r;
        }
        return r;
    }

    /**
     * If list contains object
     */
    public boolean contains(Object o)
    {
        for(int i=0;i<size();++i)
            if(getNodeAtIndex(i).getValue().equals(o))
                return true;
        return false;
    }

    /**
     * If list has no elements
     */
    public boolean isEmpty()
    {
        return size()==0;
    }

    /**
     * Adds object to the front of list
     */
    public void addFirst(Object value){
        add(0,value);
    }

    /**
     * Gets object at front of list
     */
    public Object getFirst(){
        return get(0);
    }

    /**
     * Adds object to end of list
     */
    public void addLast(Object value){
        add(size(),value);
    }

    /**
     * Gets object at end of list
     */
    public Object getLast(){
        return get(size()-1);
    }

    /**
     * Sets object at index, returns former value
     */
    public Object set(int ind, Object obj)
    {
        Object o = get(ind);
        getNodeAtIndex(ind).setValue(obj);
        return o;
    }

    /**
     * Returns object in the middle of the list
     * Uses int division to find middle
     */
    public ListNode getMiddleNode()
    {
        if(first==null)
            return null;
        return getNodeAtIndex(size()/2);
    }

    /**
     * Removes value at index, returns removed value
     */
    public Object remove(int ind){
        Object o = get(ind);
        if(ind==0)
            first = first.getNext();
        else
            getNodeAtIndex(ind-1).setNext(getNodeAtIndex(ind+1));
        return o;
    }

    /**
     * Deletes first instance of value
     * Returns false if nothing deleted
     */
    public boolean remove(Object elem)
    {
        if(!contains(elem))
            return false;
        for(int i=0;i<size();++i)
            if(get(i).equals(elem)){
                remove(i);
                break;
        }
        return true;
    }

    /**
     * Removes all of value from list
     * Returns false if nothing deleted
     */
    public boolean removeAll(Object elem)
    {
        if(!contains(elem))
            return false;
        while(contains(elem))
            remove(elem);
        return true;
    }

    /**
     * Removes and returns the first object in list
     * If list was empty returns null
     */
    public Object removeFirst()
    {
        if(first==null)
            return null;
        Object o = getFirst();
        remove(0);
        return o;
    }

    /**
     * Removes and returns the last object in list
     * If list was empty returns null
     */
    public Object removeLast()
    {
        if(first==null)
            return null;
        Object o = getLast();
        remove(size()-1);
        return o;
    }

    /*
     *   contents of the List have been reversed
     *   
     *   Sample:   if  toString().equals("[a, b, c, d, ... ,m]") == true before reverse
     *   
     *           then  toString().equals("[m, l, k, j, ... ,a]") == true after reverse
     *           
     *   if size() == 0, or size() == 1. the List is not modified
     * 
     */
    public void reverse()
    {
        if(size()<=1)
            return;
        ListNode n = new ListNode(null,null);
        ListNode l = n;
        for(int i=size()-1;i>=0;--i){
            l.setValue(get(i));
            if(i!=0){
                l.setNext(new ListNode(null,null));
                l=l.getNext();
            }
        }
        first=n;
    }

    /**
     * Inserts the items in ascending order
     */
    public void inOrderInsert(Comparable c){
        if(first==null)
            first = new ListNode(c,null);
        else{
            ListNode n = first;
            int i=0;
            while(((Comparable)n.getValue()).compareTo(c)<0){
                if(n.getNext()==null){
                    addLast(c);
                    return;
                }
                n=n.getNext();
                ++i;
            }
            add(i,c);
        }
    }
}