import kareltherobot.*;
import java.lang.*;
import java.util.stream.*;
import java.awt.Point;
import java.util.*;
//import java.util.stream;
/**
 * @author  Don Allen
 */
public class Java8StreamMapCollect implements Directions
{
    /*
     *    remove all negative numbers (< 0) from the parameter nums
     */
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
        .filter(n -> n >= 0)
        .collect(Collectors.toList());
    }

    /*
     *   Given a list of Strings
     *   return a new (and different) list with the first and last letter removed
     *          omitting all new Strings with a length shorter than (not equal) the parameter minLength
     *   
     *   postcondition:  words remains unchanged
     *   
    shortenString(["one", "five", "seven", "twenty-one"], 4) returns ["wenty-on"]
     */
    public static List<String> shortenString(List<String> words, int minLength) {
        return words.stream()
        .filter(x -> x.length() >= minLength+2)
        .map(x -> x.substring(1, x.length()-1))
        .collect(Collectors.toList());
    }

    /*
     *   Given a list of Strings
     *   omitting all new Strings with a length shorter than OR equal to the parameter minLength
     *   then return a new (and different) list with the first and last letter removed
     *   
     *   postcondition:  words remains unchanged
     *   
    shortenStringAgain(["one", "five", "seven", "twenty-one"], 4) returns ["wenty-on"]
     */
    public static List<String> shortenStringAgain(List<String> words, int minLength) {
        return words.stream()
        .filter(x -> x.length() > minLength)
        .map(x -> x.substring(1, x.length()-1))
        .collect(Collectors.toList());
    }

    /*
     *   Given a list of non negative Integers
     *   return a new (and different) list with the values in nums times the parameter scalar
     *          omitting all products that end in 5
     *   
    multiplyByScalar([7, 11, 2, 5], 7) returns ["49", "77", "14"]
     *   postcondition:  nums remains unchanged
     */
    public static List<Integer> multiplyByScalar(List<Integer> nums, int scalar) {
        return nums.stream()
        .map(n -> n*scalar)
        .filter(n -> n%10!=5)
        .collect(Collectors.toList());
    }

    /*
     *   Given a List of Integers
     *   return a list of all positive values (> 0) in nums as a string
     *          yes, omit any values in the List that are NOT positive, that is greater than zero
     *   
    convertToString([7, 11, -2, 5]) returns ["7", "11", "5"]
     *   postcondition:  nums remains unchanged
     */
    public static List<String> convertToString(List<Integer> nums) {
        return nums.stream()
        .filter(n -> n>0)
        .map(n -> ""+n)
        .collect(Collectors.toList());
    }

    /*
     *   return a Integer List of the length of each String in words 
     *  
     *   omitting all number ontain the digits evil
     *   
    listOfLengths(["123456", "123", "123456789"], 7) returns [6, 3]
     *   postcondition:  nums remains unchanged
     */
    public static List<Integer> listOfLengths(List<String> words, int evil) {
        return words.stream()
        .filter(n -> !n.contains(""+evil))
        .map(n -> n.length())
        .collect(Collectors.toList());
    }

    /*
     *   returns a List of Robots using the parameter p to determine the street and avenue
     *       the Robot at index n is constructed at:
     *            Street p.get(n).getX()
     *            Avenue p.get(n).getY()
     *            Facing North
     *            with 10 beepers
     *        omit all Robots with a Street <= 0 or Avenue <= 0
     *        
     *        
    listOfLengths([new IntPoint(1, 1), new IntPoint(1, 0), new IntPoint(10, 2)])
    returns [new Robot(1, 1, North, 10). new Robot(10, 2, North, 10)]

     *   postcondition:  p remains unchanged
     */
    public static List<Robot> robotMaker(List<IntPoint> p) {
        return p.stream()
        .filter(n -> n.getX()>0 && n.getY()>0)
        .map(n -> new Robot(n.getX(),n.getY(),North,10))
        .collect(Collectors.toList());
    }

    /*
     *     Returns an Object[] of all elements in the parameter List<Object> items,
     *             omitting the first skipThese elements (skipThese is a parameter)
     *             
     *     you may assume items.size() > skipThese        
     *             
    getAsArray{ [1, 2, 3, 4, 5, 6, 7, 8, 9], 7) return [8, 9]          
     */
    public static Object[] getAsArray(List<Object> items, int skipThese) {
        return items.stream()
        .filter(n -> items.indexOf(n)>skipThese-1)
        .toArray();
    }

    /*
     *     Returns an array of all elements in the parameter List<Object> items,
     *             omitting the first skipThese elements (skipThese is a parameter)
     *             including only items that are an instanceof the Class indicated by the parameter c
     *
     *   Review the last paragraph of the word file describing the isAssignableFrom mehtod

    Given:  SuperBot extends BetterTurned extends Robot
    List<BetterTurner> rBot,
    Robot r;
    BetterTurned b;
    SuperBot s;

    rBot.get(0).isAssignableFrom(  r.getClass() ) returns false
    rBot.get(0).isAssignableFrom(  b.getClass() ) returns true
    rBot.get(0).isAssignableFrom(  s.getClass() ) returns true

    The following is sample code for the getTheseObjects(...) mehtod

    List<Object> oList = new ArrayList<Object>();
    oList.add(new IntPoint(1, 1));
    oList.add(new PointSum(1, 0));
    oList.add(new PointProd(10, 2));
    oList.add(new PointSum(1, 1));
    oList.add(new PointProd(10, 12));
    oList.add(new IntPoint(21, 112));
    oList.add(new PointSum(17, 90));

    Object[] oResult = Java8StreamMapCollect.getTheseObjects(oList, new PointSum(9, 99), 5);
    assertEquals(1, oResult.length);
    assertEquals(new IntPoint(17, 90), oResult[0]);
     */
    public static Object[] getTheseObjects(List<Object> items, Object obj, int skipThese)
    {
        String c = obj.getClass().toString();
        return items.stream()
        .filter(n -> items.indexOf(n)>skipThese)
        .filter(n -> n.getClass().toString().equals(c))
        .toArray();
    }
}