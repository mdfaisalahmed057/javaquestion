import java.util.Collection;
import java.util.HashSet;

public class findduplicate {
    public static void main(String[] args) {
        String s="faisal";
        firstUniqChar(s);
     }
    public static int firstUniqChar(String s) {
          for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)!=s.charAt(i+1)){
                return i;
                 

            }
    
        }
        return -1;
        
    }
    
}
