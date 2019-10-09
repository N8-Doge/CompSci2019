import java.util.*;
import java.lang.Math;
/**
 * problem77 Page134  Weird String Function
 *
 * @author  
 * @version (a version number or a date)
 */
public class problem77Page134{
    private String[] domain;
    public problem77Page134(String[] domain){
        this.domain=domain;
    }
    
    public String weirdStringFunction(String[] y){
        String s = "";
        for(int i=0;i<3;++i){
            if(Arrays.asList(domain).contains(y[i]))
                s+="1";
            else
                s+="0";
        }
        return s;
    }
}