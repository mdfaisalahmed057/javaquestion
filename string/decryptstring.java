// // 1309. Decrypt String from Alphabet to Integer Mapping
import java.util.*;
public class decryptstring{
    public static void main(String[] args) {
        String s="10#11#12";
        System.out.println(freqAlphabets(s));
    } 
        public static String freqAlphabets(String str) {
    HashMap<String, Character> map = new HashMap<>();
    int k = 1;
    
    //if value comes less then i then noraml count else add the # value in it

    for (char ch = 'a'; ch <= 'z'; ch++) {
        if (ch < 'j')
            map.put(String.valueOf(k++), ch);// to convert the value of int to string
        else
            map.put(String.valueOf(k++)+"#", ch);
    }
    
    StringBuilder sb = new StringBuilder();
    int i = str.length() - 1;
    while (i >= 0) {
        if (str.charAt(i) == '#') {
            sb.append(map.get(str.substring(i - 2, i+1)));
            
            i -= 3;
         } else {
            sb.append(map.get(str.substring(i, i + 1)));
            i--;
            System.out.println(i);
        }
    }
    
    return sb.reverse().toString();
}
}



//revisit