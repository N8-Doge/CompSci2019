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
    
    private static void insert(char letter, String code, TreeNode current){
        if(current==null)
            current=new TreeNode(' ');
        if(code.length()==0)
            current.setValue(letter);
        else
            if(code.charAt(0)==DOT)
                insert(letter,code.substring(1),current.getLeft());
            else
                insert(letter,code.substring(1),current.getRight());
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
        if(m.length()==0)
            return ""+n.getValue();
        if(m.charAt(0)==DOT)
            return find(m.substring(1),n.getLeft());
        if(m.charAt(0)==DASH)
            return find(m.substring(1),n.getRight());
        return " ";
    }
}