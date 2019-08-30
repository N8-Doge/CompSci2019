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
     * So basically hash or tree
     * 
     * @param   type    Hash or tree
     */
    public DorasGreatMapAdventurePart2(String type) {
        super(type);
    }

    /**
     * Returns union of this map and boots' map
     * 
     * @param   boots   A dora map
     * @return  A Dora2 union of this and boots
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

    /**
     * Returns intersection of this and backpack
     * 
     * @param   backpack    A dora map
     * @return  A Dora2 intersection of this and backpack
     */
    public DorasGreatMapAdventurePart2<K, V> mapIntersection(DorasGreatMapAdventure<K, V> backpack)
    {
        return mapDifference(mapDifference(backpack));
    }

    /**
     * Returns difference of this map and swipers map. 
     * Mathematically it is this-swiper
     * 
     * @param   swiper  A dora map
     * @return  A Dora2 of the difference
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
     * Returns if this map is a submap of backpack.
     * First checks if the same keys exist, then if those keys have the same values.
     * 
     * @param   backpack    A dora map
     * @return  Boolean true if this is submap of backpack
     */
    public boolean isSubmapOf(DorasGreatMapAdventure<K, V> backpack) {
        for(K k:this.keySet())
            if(backpack.keySet().contains(k)){
                for(V v:this.getMap().get(k))
                    if(!backpack.getMap().get(k).contains(v))
                        return false;
            }
            else{
                return false;
            }
        return true;
    }

    /**
     * Returns if this map is a submap of backpack but backpack isn't a submap of this
     * 
     * @param   s   A dora map
     * @return  Boolean true if this is proper submap of s
     */
    public boolean isProperSubmapOf(DorasGreatMapAdventure<K, V> s) {
        return isSubmapOf(s) && !s.equals(this);
    }

    /**
     * Clears all keys in map
     */
    public void clear() {
        if(keySet().size()!=0)
            keySet().clear();
    }

    /**
     * Clears the value in map related to key
     * 
     * @param   isa     Key to be cleared
     */
    public void clearKey(K isa) {
        if(keySet().contains(isa))
            this.getMap().get(isa).clear();
    }

    /**
     * Returns size of keySet
     * 
     * @return  Integer for keySet  size
     */
    public int numMappings() {
        return keySet().size();
    }
}