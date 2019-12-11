import java.lang.*;
import java.util.*;
/**
 * @author  
 * 
 * 
 *     note:  you may look at student tester for sample input - output
 */
public class Java8ReplaceAllPractice {
    /*
     *   double (times 2) every value in nums
     *
    doubleIt([5]) returns [10]
     */
    public static List<Integer> doubleIt(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    /*
     *   replace every value in the parameter nums with the onesPlaceValue^2 
     *   
    squareOnePlaceValue([17]) returns [49]
     */
    public static List<Integer> squareOnePlaceValue(List<Integer> nums) {
        nums.replaceAll(n -> (n%10)*(n%10));
        return nums;
    }

    /*
     *   subtract the parameter that from all values in the parameter nums 
     *   
    subtract_that([5], 2) returns [3]
     */
    public static List<Integer> subtract_that(List<Integer> nums, int that) {
        nums.replaceAll(n -> n-that);
        return nums;
    }

    /*
     *     each String in words modified by adding the parameter phrase as both a prefix and postfix
     *
    surroundWordWith_phrase(["foo], "*#") returns["*#foo*#"]
     */
    public static List<String> surroundWordWith_phrase(List<String> words, String phrase) {
        words.replaceAll(n -> phrase+n+phrase);
        return words;
    }

    /*
     *     each String in words modified by:
     *          adding first 3 elements of phrase as a prefix
     *          adding the remaining letter (after the first 3) as a postfix
     *          
     *          You may assume phrase.length() >= 3
     *          
    stickWordsInMiddleOfPhrase(["foo"], "12345")  returns ["123foo45"]
     */
    public static List<String> stickWordsInMiddleOfPhrase(List<String> words, String phrase) {
        words.replaceAll(n -> phrase.substring(0,3)+n+phrase.substring(3));
        return words;
    }

    /*
     *        return a list where all occurrences of phrase has been removed
     *
    removePhrase(["ax", "bb", "xcx"], "x") returns ["a", "bb", "c"]
    removePhrase(["mississippi", "passes", "stop"], "ss") returns ["miiippi", "paes", "stop"]
    removePhrase(["please"], "please") returns []
     */
    public static List<String> removePhrase(List<String> words, String phrase) {
        words.replaceAll(n -> n.replace(phrase, ""));
        return words;
    }
}