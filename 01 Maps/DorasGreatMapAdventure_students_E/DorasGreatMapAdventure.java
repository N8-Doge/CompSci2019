import java.util.*;
/**
 * DorasGreatMapAdventure is a manual implementation of a Map
 * 
 * @author  Nathan Chen
 * @version 8-28-19
 */
public class DorasGreatMapAdventure<K,V>{
    //Instance variables
    private Map<K, Set<V>> iAmTheMap;

    /**
     * Constructor to create class
     * 
     * @param   type    Either hash or tree
     */
    public DorasGreatMapAdventure(String type){
        if ("hash".equals(type))
            iAmTheMap = new HashMap<K, Set<V>>();
        else if ("tree".equals(type))
            iAmTheMap = new TreeMap<K, Set<V>>();
        else
            iAmTheMap = new HashMap<K, Set<V>>();
    }

    /**
     * Returns internal map's keyset
     * 
     * @return  Keyset of the map
     */
    public Set<K> keySet(){
        return iAmTheMap.keySet();
    }

    /**
     * Returns the internal map
     * 
     * @return  Gives internal map
     */
    public Map<K, Set<V>> getMap(){
        return iAmTheMap;
    }

    /**
     * Adds a value to the set linked to key. 
     * If there is no set it creates a treeset to add to
     * 
     * @param key Key to add value to
     * @param tico Value to add
     */
    public void add(K key, V tico){
        if(iAmTheMap.get(key)==null)
            iAmTheMap.put(key, new TreeSet<V>());
        iAmTheMap.get(key).add(tico);
    }

    /**
     * The number of elements and keys including dupes
     * 
     * @return Integer sum of elements and keys
     */
    public int size(){
        return numItems()+keySet().size();
    }

    /**
     * The number of elements in the map including dupes
     * 
     * @return Integer of sum of elements
     */
    public int numItems(){
        int i=0;
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null)
                i+=iAmTheMap.get(k).size();
        return i;
    }

    /**
     * The number of elements in the map excluding dupes
     * 
     * @return Integer sum of unique elements
     */
    public int numDistinctItems(){
        TreeSet<V> t = new TreeSet<V>();
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null)
                for(V v:iAmTheMap.get(k))
                    t.add(v);
        return t.size();
    }

    /**
     * Returns true if the map is empty
     * 
     * @return Boolean true if map is empty
     */
    public boolean isEmpty(){
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null)
                if(iAmTheMap.get(k).size()!=0)
                    return false;
        return true;
    }

    /**
     * Returns true if the map contains an object
     * 
     * @param   diego   Object to find
     * @return  Boolean true if diego is in map
     */
    public boolean contains(Object diego){
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null)
                if(iAmTheMap.get(k).contains(diego))
                    return true;
        return false;
    }

    /**
     * Returns map as an array including dupes
     * 
     * @return Object array of all elements in map
     */
    public Object[] toArray(){
        Object[] r = new Object[numItems()];
        int i=0;
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null)
                for(V v:iAmTheMap.get(k)){
                    r[i]=v;
                    ++i;
                }
        return r;
    }

    /**
     * Removes value tico from set in map linked to key
     */
    public void remove(K key, V tico){
        if(iAmTheMap.get(key)!=null)
            iAmTheMap.get(key).remove(tico);
        if(isEmpty())
            iAmTheMap.clear();
    }

    public void removeFromAll(V isa){
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null)
                iAmTheMap.get(k).remove(isa);
        if(isEmpty())
            iAmTheMap.clear();
    }

    public boolean equals(Object otherDorasGreatMapAdventure){
        DorasGreatMapAdventure d = (DorasGreatMapAdventure)otherDorasGreatMapAdventure;
        if(!keySet().containsAll(d.keySet()))
            return false;
        if(!d.keySet().containsAll(keySet()))
            return false;
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null)
                if(!iAmTheMap.get(k).equals(d.getMap().get(k)))
                    return false;
        return true;
    }

    public String toString(){
        String s = "{";
        for(K k:keySet())
            if(iAmTheMap.get(k)!=null){
                s+=k.toString()+"="+getMap().get(k).toString()+", ";
            }
        if(s.length()>1)
            s=s.substring(0,s.length()-2);
        s+="}";
        return s;
    }

    public V maxItem(){
        V v = (V)"";
        Object[] os = toArray();
        for(Object o:os){
            V vo = (V) o;
            if(vo.toString().compareTo(v.toString())>0)
                v=(V)o;
        }
        return v;
    }
}