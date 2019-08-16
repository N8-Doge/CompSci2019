/*
If client creates a "hash" AllenWittrySet, then it may hold heterogeneous info and other AllenWittrySets.
If client creates a "tree" AllenWittrySet, then it may only hold elements which implement the Comparable interface as required by the TreeSet() class.
This class also has a compareTo() method which enables it to hold other AllenWittrySets.
 */
import java.util.*;
public class AllenWittrySet <E> implements Comparable <E> {
    private Set <E> mySet;

    public AllenWittrySet (String type){
        if ("hash".equals(type))
            mySet = new HashSet <E> ();
        else if ("tree".equals(type))
            mySet = new TreeSet <E> ();
        else
            mySet = new HashSet <E> ();
    }

    public AllenWittrySet<E> setUnion(AllenWittrySet <E> s){
        AllenWittrySet <E> a = new AllenWittrySet<E>("hash");
        Iterator<E> t = s.iterator();
        Iterator<E> tt = setDifference(s).iterator();
        while(t.hasNext())
            a.add(t.next());
        while(tt.hasNext())
            a.add(tt.next());
        return a;
    }

    public AllenWittrySet<E> setIntersection(AllenWittrySet <E>  s){
        return setDifference(setDifference(s));
    }

    public AllenWittrySet<E> setDifference(AllenWittrySet <E> s){
        AllenWittrySet<E> a = new AllenWittrySet<E>("hash");
        Iterator<E> t = mySet.iterator();
        while(t.hasNext()){
            E obj = t.next();
            if(!s.contains(obj))
                a.add(obj);
        }
        return a;
    }

    public boolean isSubsetOf(AllenWittrySet <E> s){
        Iterator<E> t = mySet.iterator();
        while(t.hasNext())
            if(!s.contains(t.next()))
                return false;
        return true;
    }

    public boolean isProperSubsetOf(AllenWittrySet <E> s){
        return isSubsetOf(s)&&!equals(s);
    }

    public Iterator <E> iterator(){
        return mySet.iterator();
    }

    public int size(){
        return mySet.size();
    }

    public boolean isEmpty(){
        return mySet.size()==0;
    }

    public boolean contains(E o){
        return mySet.contains(o);
    }

    public void clear(){
        mySet.clear();
    }

    public Object[] toArray(){
        Object[] r = new Object[mySet.size()];
        Iterator<E> it = mySet.iterator();
        int a=0;
        while(it.hasNext()){
            r[a]=it.next();
            ++a;
        }
        return r;
    }

    public void add(E o){
        mySet.add(o);
    }

    public void remove(E o){
        mySet.remove(o);
    }

    public int compareTo(E otherObj){
        return toString().compareTo(((AllenWittrySet)otherObj).toString());
    }

    public boolean equals (Object otherObj){
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        AllenWittrySet<E> other = (AllenWittrySet) otherObj;
        return compareTo((E)otherObj)==0;
    }

    public String toString(){
        String s="[";
        for(E e:mySet)
            s+=e.toString()+", ";
        if(s.length()>1)
            s=s.substring(0,s.length()-2);
        return s+"]";
    }
}