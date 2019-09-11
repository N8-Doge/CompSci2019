import java.lang.*;
import java.util.*;
public class ISBN_Verification{
    public boolean isValid(String isbn){
        StringBuilder s = new StringBuilder(isbn);
        for(int i=s.length()-1;i>=0;--i)
            if(s.charAt(i)=='-')
                s.deleteCharAt(i);
        s.deleteCharAt(s.length()-1);
        boolean b = false;
        int r=0;
        for(char c:s.toString().toCharArray()){
            int j = Character.getNumericValue(c);
            if(b) 
                j*=3;
            r+=j;
            b=!b;
        }
        r=10-r%10;
        return r==Integer.parseInt(isbn.substring(isbn.length()-1));
    }
}