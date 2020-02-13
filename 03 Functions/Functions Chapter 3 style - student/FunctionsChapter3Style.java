import java.util.*;
import java.lang.Math;
public class FunctionsChapter3Style{
    private Set<OrderedPair> op;
    private Set<String> d,co;

    public FunctionsChapter3Style(Set<String> d, Set<String> co){
        this.d=d;
        this.co=co;
    }

    public FunctionsChapter3Style(Set<String> d, Set<String> co, Set<OrderedPair> r)
    {
        this.d=d;
        this.co=co;
        op=r;
    }

    /*
     *returns a String of the form: [(a,b), (c,d), ...(v,w)]
     */
    public String getRelString(){
        String s = "[";
        for(OrderedPair o:op)
            s+=o.toString()+", ";
        if(s.length()>1)
            s=s.substring(s.length()-3);
        return s+"]";
    }

    /*
     *    replaces the current relation instance variable with op
     *    
     *    YES - this method gets used in the my (stipulator) tester
     */
    public void setRelation(Set<OrderedPair> op){
        this.op=op;
    }

    /*
     *    returns the current relation instance variable 
     */
    public Set<OrderedPair> getRelation(){  
        return op;
    }

    /*
     *    retruns the number of Order Pairs in the relation
     */
    public int size(){
        return op.size();
    }

    /*
     *    returns true if the array of Order Pairs forms a function
     *    returns false otherwise
     */
    public boolean isFunction(){
        HashMap h = new HashMap<String,String>();
        for(OrderedPair o:op)
            if(h.put(o.getX(),o.getY())!=null)
                return false;
        return true;
    }

    /* 
     *    A function f from X to Y is said to be one to one if 
     *    for each y in Y, there is at most one x in X with f(x) = y
     *
     *    returns true if array of order Pairs is a function and the function is one to one
     *    returns false otherwise
     */
    public boolean isOneToOne(){
        if(!isFunction())
            return false;
        HashMap h = new HashMap<String,String>();
        for(OrderedPair o:op)
            if(h.put(o.getY(),o.getX())!=null)
                return false;
        return true;
    }

    /*
     *    A function from X to Y is said to be onto if
     *    the range of f == Y
     *
     *    returns true if array of order Pairs is a function and the function is onto
     *    returns false otherwise
     */
    public boolean isOnTo(){
        if(!isFunction())
            return false;
        HashSet h = new HashSet<String>();
        for(OrderedPair o:op)
            h.add(o.getY());
        for(String s:co)
            if(!h.contains(s))
                return false;
        return true;
    }

    /*
     *     returns true if the array of order Pairs is a function and the function is bijective
     *              that is both one to one and onto
     *     returns false otherwise
     */
    public boolean isBijective(){
        return isOneToOne() && isOnTo();
    }

    /*
     *   precondition:  getRelation() and op (the parameter) are both functions.  
     *                  Domain of op is a subset of coDomain of getRelation()
     *   
     *   returns a new FunctionsChapter3Style Object.
     *   The domain of new FunctionsChapter3Style Object is this.domain
     *   The coDomain is opCoDomain (the paramenter)
     *   
     *   The new function is the composition op( this.getRelation (this.domain) )
     */
    public FunctionsChapter3Style composition(Set<OrderedPair> op, Set<String> opCoDomain){
        FunctionsChapter3Style ans = new FunctionsChapter3Style(d, opCoDomain, new HashSet<OrderedPair>());
        HashSet<OrderedPair> rel = new HashSet<OrderedPair>();
        HashMap<String,String> h = new HashMap<String,String>();
        for(OrderedPair o:op)
            h.put(o.getX(),o.getY());
        for(OrderedPair o:this.op)
            rel.add(new OrderedPair(o.getX(),h.get(o.getY())));
        ans.setRelation(rel);
        return ans;
    }

    /*
     *   precondition:  rel is a function.
     *   rel does not have to be both 1-1 and onto
     *   the inverse does not need to be a function
     */
    public OrderedPair[] getInverse(){
        OrderedPair[] ans = new OrderedPair[op.size()];
        OrderedPair[] oparr = (OrderedPair[])((Set)op).toArray();
        for(int i=0;i<op.size();i++)
            ans[i]=new OrderedPair(oparr[i].getY(),oparr[i].getX());
        return ans;
    }

    /*
     * A relation is reflexive if (x, x) in R for every x in X
     * 
     *       returns true if the current relation is reflexive
     *       returns false otherwise
     */
    public boolean isReflexive(){
        HashSet h = new HashSet<String>();
        for(OrderedPair o:op)
            h.add(o.getX());
        for(String s:(HashSet<String>)h)
            if(!op.contains(new OrderedPair(s,s)))
                return false;
        return true;
    }

    /*
     *       A relation is symmetric if
     *       for all x, y in X, if (x,y) in R, then (y,x) in R
     * 
     *       returns true if the current relation is symmetric
     *       returns false otherwise
     */
    public boolean isSymmetric(){
        for(OrderedPair o:op)
            if(!op.contains(new OrderedPair(o.getY(),o.getX())))
                return false;
        return true;
    }

    /*
     *       A relation is Antisymmetric if
     *       for all x, y in X, if (x,y) in R, and (y,x) in R, then x = y
     * 
     *    returns true if the current relation is Antisymmetric
     *    returns false otherwise
     */
    public boolean isAntiSymmetric(){
        for(OrderedPair o:op)
            if(op.contains(new OrderedPair(o.getY(),o.getX())))
                if(!o.getX().equals(o.getY()))
                    return false;
        return true;
    }

    /*
     *       A relation is transitive:
     *       if (a,b) and (b,c) then (a,c)
     * 
     *       returns true if the current relation is reflexive
     *       returns false otherwise
     */
    public boolean isTransitive(){
        HashMap<String,String> m = new HashMap<String,String>();
        for(OrderedPair o:op)
            m.put(o.getX(),o.getY());
        for(OrderedPair o:op)
            if(m.keySet().contains(o.getY()))
                if(!op.contains(new OrderedPair(o.getX(),m.get(o.getY()))))
                    return false;
        return true;
    }

    /*
     *    returns true is the relation is an Equivalence Relation
     *    returns false otherwise
     */
    public boolean isEquivalenceRelation(){
        return isSymmetric() && isReflexive() && isTransitive();
    }

    /*
     * 
     *    returns true is the relation is an Partially Order
     *    returns false otherwise
     */
    public boolean isPartiallyOrder(){
        return isAntiSymmetric() && isReflexive() && isTransitive();
    }
}