import java.util.TreeMap;
/* 
 * @author:
 *  period:
 *
 *  directions: complete the methods below. the lab should be case insensitive
 *
 *  You should use the TreeNode class provided in this project
 *  I have been told the java version of TreeNode is more complicated
 *  to use than this simpler TreNode class provided by The College Board
 *  during the years of the AP Computer Science AB test
 */
public class MorseCode
{
    private static final char DOT = '.';
    private static final char DASH = '-';

    private static TreeMap<Character, String> codeMap;
    private static TreeNode decodeTree;

    // this method is complete
    public static void start(){
        codeMap = new TreeMap<Character, String>();
        decodeTree = new TreeNode(' ');
        // put a space in the root of the decoding tree

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
     *  Inserts a letter and its Morse code string into the encoding map (codeMap)
     *  and calls treeInsert to insert them into the decoding tree.
     */
    private static void addSymbol(char letter, String code){
        codeMap.put(letter,code);
        treeInsert(letter,code);
    }

    /**
     *  Inserts a letter according to its Morse code string into the 
     *  decoding tree.  Each dot-dash string corresponds to a path
     *  in the tree from the root to a node: at a "dot" go left, at a "dash" go
     *  right.  The node at the end of the path holds the symbol
     *  for that code string.  See the word documents for more help.
     */
    private static void treeInsert(char letter, String code){
        TreeNode n = decodeTree;
        for(char c:code.toCharArray()){
            if(c==DOT)
                n=n.getLeft();
            if(c==DASH)
                n=n.getRight();
            if(n==null)
                n=new TreeNode(new Character(' '));
        }
        n.setValue(letter);
    }
    
    private static void insert(char letter,String code,TreeNode t){
        if(code.length()==0){
            t.setValue(letter);
            return;
        }
        
    }

    /**
     *   Converts text into a Morse code message.  Adds a space after a dot-dash
     *   sequence for each letter.  Other spaces in the text are transferred directly
     *   into the encoded message.
     *   Returns the encoded message.
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
     *   Converts a Morse code message into a text string.  Assumes that dot-dash
     *   sequences for each letter are separated by one space.  Additional spaces are
     *   transferred directly into text.
     *   Returns the plain text message.
     */
    public static String decode(String morse){
        String e = ""+morse;
        String d = "";
        while(e.length()>2){
            d+=find(e.substring(0,e.indexOf(" ")+1));
            e=e.substring(e.indexOf(" ")+1);
        }
        return d;
    }

    private static String find(String m){
        TreeNode n = decodeTree;
        for(char c:m.toCharArray()){
            System.out.println(n.getValue());
            if(c==DOT)
                n=n.getLeft();
            if(c==DASH)
                n=n.getRight();
        }
        return ""+n.getValue();
    }
    
    public static void inOrderTraverse(){
        traverse(decodeTree);
    }
    
    private static void traverse(TreeNode t){
        if(t.getValue()==null)
            return;
        traverse(t.getLeft());
        System.out.println(t.getValue());
        traverse(t.getRight());
    }
}