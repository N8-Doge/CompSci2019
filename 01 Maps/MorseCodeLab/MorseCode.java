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
        traverse(decodeTree,"");
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
        System.out.print("On my quest to insert '"+c+"', ");
        System.out.println("currently I have '"+s+"' left");
        try{
            System.out.println("(BTW, this node has a '"+n.getValue()+"')");
        }
        catch(Exception e){
            System.out.println("I tried to find a value at this node but it gave me a "+e);
        }
        if(n==null){
            System.out.print("This node is null, therefore I ");
            n=new TreeNode(' ');
            System.out.println("gave null node a '"+n.getValue()+"'");
        }
        if(s.length()==0){
            System.out.print("There are no more characters to traverse, so I");
            n.setValue(c);
            System.out.println(" gave this node a '"+n.getValue()+"'");
        }
        else{
            if(s.charAt(0)==DOT){
                System.out.println("My map tells me to go LEFT at the DOT");
                insert(c,s.substring(1),n.getLeft());
            }
            if(s.charAt(0)==DASH){
                System.out.println("My map tells me to go RIGHT at the DASH");
                insert(c,s.substring(1),n.getRight());
            }
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
        String d="";
        for(String s:morse.split(" "))
            d+=find(s,decodeTree);
        return d;
    }

    public static String find(String m, TreeNode n){
        System.out.println("Looking at "+m);
        try{
            System.out.println("There is a '"+n.getValue()+"' in this pos of the tree");
        }
        catch(Exception e){
            System.out.println("No value here because "+e);
        }
        if(m.length()==0){
            System.out.println("I found a "+n.getValue());
            return ""+n.getValue();
        }
        System.out.println("Node L/R: "+m.charAt(0));
        if(m.charAt(0)==DOT){
            System.out.println("Heading left because there is a DOT");
            return find(m.substring(1),n.getLeft());
        }
        if(m.charAt(0)==DASH){
            System.out.println("Heading right because there is a DASH");
            return find(m.substring(1),n.getRight());
        }
        System.out.println("unreachable statement");
        return " ";
    }

    public static void tester(){
        start();
        traverse(decodeTree,"");
        System.out.println(find(".-",decodeTree));
        System.out.println(find("..-",decodeTree));
        System.out.println(find(" ",decodeTree));
    }

    private static void traverse(TreeNode n,String s){
        if(n==null)
            return;
        traverse(n.getLeft(),s+".");
        System.out.println(s+n.getValue());
        traverse(n.getRight(),s+"-");
    }
}