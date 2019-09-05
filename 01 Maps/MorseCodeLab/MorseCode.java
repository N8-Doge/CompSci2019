import java.util.TreeMap;
/* 
 * MorseCode and stuff like that
 */
public class MorseCode{
    //Instance Variables
    private static final char DOT = '.';
    private static final char DASH = '-';
    private static TreeMap<Character, String> codeMap;
    private static TreeNode decodeTree;

    /**
     * Init method
     */
    public static void start(){
        codeMap = new TreeMap<Character, String>();
        decodeTree = new TreeNode(' ');
        addSymbol('A', ".-");
        addSymbol('B', "-...");
        addSymbol('C', "-.-.");
        addSymbol('D', "-..");
        addSymbol('E', ".");
        addSymbol('F', "..-.");
        addSymbol('G', "--.");
        addSymbol('H', "....");
        addSymbol('I', "..");
        addSymbol('J', ".---");
        addSymbol('K', "-.-");
        addSymbol('L', ".-..");
        addSymbol('M', "--");
        addSymbol('N', "-.");
        addSymbol('O', "---");
        addSymbol('P', ".--.");
        addSymbol('Q', "--.-");
        addSymbol('R', ".-.");
        addSymbol('S', "...");
        addSymbol('T', "-");
        addSymbol('U', "..-");
        addSymbol('V', "...-");
        addSymbol('W', ".--");
        addSymbol('X', "-..-");
        addSymbol('Y', "-.--");
        addSymbol('Z', "--..");
        addSymbol('0', "-----");
        addSymbol('1', ".----");
        addSymbol('2', "..---");
        addSymbol('3', "...--");
        addSymbol('4', "....-");
        addSymbol('5', ".....");
        addSymbol('6', "-....");
        addSymbol('7', "--...");
        addSymbol('8', "---..");
        addSymbol('9', "----.");
        addSymbol('.', ".-.-.-");
        addSymbol(',', "--..--");
        addSymbol('?', "..--..");
    }

    /**
     *  Puts code into map and tree
     */
    private static void addSymbol(char letter, String code){
        codeMap.put(letter,code);
        treeInsert(letter,code);
    }

    /**
     *  Puts letter into tree depending on code. 
     *  Dot goes left, dash goes right
     */
    private static void treeInsert(char letter, String code){
        insert(letter,code,decodeTree);
    }

    private static void insert(char c, String s, TreeNode n){
        if(n==null)
            n=new TreeNode(' ');
        if(s.length()==0)
            n.setValue(c);
        else{
            if(s.charAt(0)==DOT)
                insert(c,s.substring(1),n.getLeft());
            if(s.charAt(0)==DASH)
                insert(c,s.substring(1),n.getRight());
        }
    }

    /**
     *   Converts a string to morse using codeMap
     */
    public static String encode(String text){
        String s = "";
        for(char c:text.toCharArray()){
            if(c!=' ')
                s+=codeMap.get(c);
            s+=" ";
        }
        return s;
    }

    /**
     * Decodes a morse string to text using decodeTree
     */
    public static String decode(String morse){
        String e = ""+morse;
        String d = "";
        while(e.length()>2){
            d+=find(e.substring(0,e.indexOf(" ")+1),decodeTree);
            e=e.substring(e.indexOf(" ")+1);
        }
        return d;
    }

    public static String find(String m, TreeNode n){
        System.out.println("Finding "+m);
        if(m.length()==1){
            System.out.println("I found a "+n.getValue());
            return ""+n.getValue();
        }
        System.out.println("Examining "+m.charAt(0));
        if(m.charAt(0)==DOT)
            return find(m.substring(1),n.getLeft());
        if(m.charAt(0)==DASH)
            return find(m.substring(1),n.getRight());
        System.out.println("unreachable statement");
        return " ";
    }

    public static void tester(){
        start();
        //traverse(decodeTree,"");
        System.out.println(find(".-",decodeTree));
        System.out.println(find("..-",decodeTree));
        System.out.println(find(" ",decodeTree));
    }

    private static void traverse(TreeNode n,String s){
        if(n.getValue()==null)
            return;
        traverse(n.getLeft(),s+".");
        System.out.println(s+n.getValue());
        traverse(n.getRight(),s+"-");
    }
}