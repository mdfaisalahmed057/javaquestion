import java.lang.invoke.WrongMethodTypeException;
import java.util.*;;
public class lengthoflaststr {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    // public static  int lengthOfLastWord(String s) {
    //     String ans[]=s.split(" ");
    //      System.out.println(ans[ans.length-1]);
    //      return ans[ans.length-1].length();
         
    // }
  
public static int lengthOfLastWord(String s) {
    if (s == null || s.length() == 0) return 0;
    int result = 0, i = s.length() - 1;
    while (i >= 0 && s.charAt(i) == ' ') i--;   // Skip all whitespaces at the end of s.
    while (i >= 0 && s.charAt(i) != ' ') {      // Count the number of consecutive non-whitespace characters.
        result++;
        i--;
    }
    return result;
}
}