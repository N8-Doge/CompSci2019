import java.util.*;
import java.lang.*;

public class SinglyLinkedList{
    private ListNode first;

    public SinglyLinkedList(){
        first = null;
    }
    
    /*
     *    returns a string of the form:  [obj.toString(), obj.toString(), obj.toString(), ..., obj.toString()]
     *
     *    returns  [] if the List is empty
     */    
    public String toString(){
        String s = "[";
        for(int i=0;i<size();++i)
            s+=getNodeAtIndex(i).getValue().toString()+", ";
        if(s.length()!=1)
            s=s.substring(0,s.length()-2);
        return s+"]";
    }

    /*    insert obj at index ind, shift all previous objects to the next higher index
     *     e.g., list before: [1, 2, 3, 4]
     *     list.add(2, 11) modifies list to [1, 2, 11, 3, 4]
     *     
     *     preCondition: 0 <= ind <= size()
     */
    public void add(int ind, Object obj){
        if(first==null)
            first=new ListNode(obj,null);
        else if(ind==0)
            first=new ListNode(obj,first);
        else
            getNodeAtIndex(ind-1).setNext(new ListNode(obj,getNodeAtIndex(ind)));
    }

    /*
     *     return a referrence (not the object) to the obj at index ind.
     *     list is not modified!
     *     preCondition: 0 <= ind < size()
     *                   if list is empty return null
     */
    public Object get(int ind){
        if(first==null)
            return null;
        return getNodeAtIndex(ind).getValue();
    }

    /*
     *     return a referrence to the ListNode (not the object or Value) at index ind.
     *     list is not modified!
     *     preCondition: 0 <= ind < size()
     *                   if list is empty return null
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

    /*
     *    returns the number of elements in the List
     *    
     *    returns zero if the List is empty
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

    /*
     *    returns true if a ListNode in List is equal ( getValue().equals( o ) == true) 
     *    
     *    returns false otherwise
     */
    public boolean contains(Object o)
    {
        for(int i=0;i<size();++i)
            if(getNodeAtIndex(i).getValue().equals(o))
                return true;
        return false;
    }

    /*
     *    returns true if the size of the List is 0
     *    
     *    Returns false otherwise
     */
    public boolean isEmpty()
    {
        return size()==0;
    }

    /*
     * 
     *          END OF METHODS FOR PART A !!!!!!!!
     * 
     * 
     */

    /*
     * 
     *          BEGIN METHODS FOR PART B !!!!!!!!
     * 
     * 
     */

    /*
     *     Creates a ListNOde containing value
     *     
     *     insert the newly created ListNOde at Front of List
     */
    public void addFirst(Object value){
        add(0,value);
    }

    /*
     *     return the Object stored in the first ListNOde
     */
    public Object getFirst(){
        return get(0);
    }

    /*
     *     Creates a ListNOde containing value
     *     
     *     insert the newly created ListNOde at End of List
     */
    public void addLast(Object value){
        add(size(),value);
    }

    /*
     *     return the Object stored in the last ListNOde
     */
    public Object getLast(){
        return get(size()-1);
    }

    //  return the object previously at index ind.
    //  replace that value with obj!
    //  preCondition: 0 < ind < size()
    //                size() > 0
    public Object set(int ind, Object obj)
    {
        Object o = get(ind);
        getNodeAtIndex(ind).setValue(obj);
        return o;
    }

    /*
     *     return a reference to the middle ListNode
     *     
     *     That is, the Listnode at index = size() / 2   (remember to use integer Math - truncate/round down
     *     
     *     if size() == 0 return null
     */
    public ListNode getMiddleNode()
    {
        if(first==null)
            return null;
        return getNodeAtIndex(size()/2);
    }

    /*
     * 
     *          END OF METHODS FOR PART 2 !!!!!!!!
     * 
     * 
     */

    /*
     * 
     *          BEGIN METHODS FOR PART 3 !!!!!!!!
     * 
     * 
     */

    /*
     *     return the object at index ind.
     *     
     *     deletes the ListNode at index = ind
     *     
     *     preCondition: 0 <= ind < size()
     *                   0 < size()
     *                   
     *     postCondition  size has been decreased by 1
     */
    public Object remove(int ind){
        Object o = get(ind);
        if(ind==0)
            first = first.getNext();
        else
            getNodeAtIndex(ind-1).setNext(getNodeAtIndex(ind+1));
        return o;
    }

    /*
     *     deletes the first (at smallest index) ListNode in the List such that .getValue().equals(elem) and return true
     * 
     *     if no ListNode contains elem, return false and do NOT modify the List
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

    /*
     *     deletes all ListNode in the List such that .getValue().equals(elem) and return true
     * 
     *     if no ListNode contains elem, return false and do NOT modify the List
     */
    public boolean removeAll(Object elem)
    {
        if(!contains(elem))
            return false;
        while(contains(elem))
            remove(elem);
        return true;
    }

    /*
     *    if ( size() > 0) 
     *        returns Object stored in first ListNode (use getValue()) in the List
     *        AND removes that node from the List
     *    
     *        postondtion:  size() has been decresed by 1
     *        
     *     otherwise  (size() == 0)
     *       return null
     */
    public Object removeFirst()
    {
        if(first==null)
            return null;
        Object o = getFirst();
        remove(0);
        return o;
    }

    /*
     *    if ( size() > 0) 
     *        returns Object stored in first ListNode (use getValue()) in the List
     *        AND removes that node from the List
     *    
     *        postondtion:  size() has been decresed by 1
     *        
     *     otherwise  (size() == 0)
     *       return null
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
     * 
     *          END OF METHODS FOR PART 3 !!!!!!!!
     * 
     * 
     */

    /*
     * 
     *          BEGIN METHODS FOR EXTRA CREDIT !!!!!!!!
     * 
     * 
     */

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
        /*   add your code here   */
    }

    /*
     *     insert new ListNode(c)
     *     
     *     such that get(n).getValue().compareTo(c) > 0
     *     with smallest n available
     *     
     *     i.e., ascending order insert
     *     
     */    
    public void inOrderInsert(Comparable c){
        if(first==null)
            first = new ListNode(c,null);
        ListNode n = first;
        int i=0;
        while(((Comparable)n.getValue()).compareTo(c)<0){
            n=n.getNext();
            if(n==null){
                addLast(c);
                return;
            }
            ++i;
        }
        add(i,c);
    }
}