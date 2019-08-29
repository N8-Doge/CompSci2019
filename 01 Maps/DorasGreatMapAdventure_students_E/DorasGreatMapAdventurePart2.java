import java.util.*;
/**
 * Dora part 2: Electric Boogaloo
 * 
 * @author Mr. Allen
 * @author Nathan Chen
 * @version 8-29-19
 */
public class DorasGreatMapAdventurePart2<K, V> extends DorasGreatMapAdventure<K,V>
{

    /**
     *   If client creates a "hash" DorasGreatMapAdventure, key will have a reasonable hashCode, the associated set contains Objects
     *   If client creates a "tree" DorasGreatMapAdventure, key will implement Comparable interface as required by the TreeMap() class,
     *                                                                          the associated set contains Objects
     */
    public DorasGreatMapAdventurePart2(String type) {
        super(type);
    }

    /**  returns a DorasGreatMapAdventure implemented with a HashMap
     *      This allows me to take the union of DorasGreatMapAdventure implemented with TreeMaps and HashMap
     *
     *      the returned Map will contains the keys that are in either Map.
     *      For keys that are in both Maps, the associated Sets will be a union of the two sets
     */
    public DorasGreatMapAdventurePart2<K, V> mapUnion(DorasGreatMapAdventure<K, V> boots)
    {
        DorasGreatMapAdventurePart2<K, V> u = new DorasGreatMapAdventurePart2<K, V>("Hash");
        for(K k:this.keySet())
            for(V v:this.getMap().get(k))
                u.add(k,v);
        for(K k:boots.keySet())
            for(V v:boots.getMap().get(k))
                u.add(k,v);
        return u;
    }

    /**  returns a DorasGreatMapAdventure implemented with a HashMap
     *      This allows me to take the intersection of DorasGreatMapAdventure implemented with TreeMaps and HashMap
     *
     *      the returned Map will contains the keys that are only in both Maps.
     *      the associated Sets will be an intersection of the two sets
     */
    public DorasGreatMapAdventurePart2<K, V> mapIntersection(DorasGreatMapAdventure<K, V> backpack)
    {
        return mapDifference(mapDifference(backpack));
    }

    /**  returns a DorasGreatMapAdventure implemented with a HashMap
     *      This takes the difference of DorasGreatMapAdventure implemented with TreeMaps and HashMap
     *
     *      the returned Map will contain the keys that are in this.iAmTheMap.
     *      for each key in this.iAmTheMap,
     *      if that key is in swiper,
     *         the associated set is the set difference of this.iAmTheMap - swiper.iAmTheMap
     *         if the associated Set is Empty, remove the Key - Set pair from the Map
     *      otherswise (key is NOT in swiper)
     *         teh associated set is the set associated with key in this.iAmTheMap
     */
    public DorasGreatMapAdventurePart2<K, V> mapDifference(DorasGreatMapAdventure<K, V> swiper)
    {
        DorasGreatMapAdventurePart2<K, V> d = new DorasGreatMapAdventurePart2<K, V>("Hash");
        for(K k:this.keySet())
            if(swiper.keySet().contains(k)){
                for(V v:this.getMap().get(k))
                    if(!swiper.getMap().get(k).contains(v))
                        d.add(k,v);
            }
            else
                d.getMap().put(k,this.getMap().get(k));
        return d;
    }

    /**
     *      returns true iff
     *         for each key in this.iAmTheMap, backpack.iAmTheMap contains the same key
     *         this.iAmTheMap.get(key) is a subset of backpack.iAmTheMap.get(k)
     *      note:  this allows both Maps to be equal
     *      otherwise return false
     */
    public boolean isSubmapOf(DorasGreatMapAdventure<K, V> backpack) {
        for(K k:this.keySet())
            if(backpack.keySet().contains(k))
                for(V v:backpack.getMap().get(k)
                    if(
            else
                return false;
    }

    /**
     *      returns true iff
     *         for each key in this.iAmTheMap, backpack.iAmTheMap contains the same key
     *         this.iAmTheMap.get(key) is a subset of backpack.iAmTheMap.get(key) for every key in iAmTheMap.keySet() with either:
     *            1) this.iAmTheMap.get(key) is a proper subset of backpack.iAmTheMap.get(key) for atleast one key in iAmTheMap.keySet()
     *         or 2) backpack.iAmTheMap contains at least one key that this.iAmTheMap does not
     *      note:  this implies that equal sets are NOT properSubsets.
     *      otherwise return false
     */
    public boolean isProperSubmapOf(DorasGreatMapAdventure<K, V> s) {
        return 0 == (int)(2*Math.random());  // so compiles
    }

    
    /**
     *      Removes all mappings from this map
     *  postCondition:  keySet().size() == 0
     */
    public void clear() {
        if(keySet().size()!=0)
            keySet().clear();
    }

    /**
     *      the set associated with key isa is emptied
     *  postCondition:  getMap().get(isa).size() == 0
     *      if isa is not a key
     *          - do not throw an exception, that is exit the method gracefully
     */
    public void clearKey(K isa) {
        if(keySet().contains(isa))
            this.getMap().get(isa).clear();
    }

    /**
     *      returns the number key-value mapping in iAmTheMap
     */
    public int numMappings() {
        return keySet().size();
    }
}