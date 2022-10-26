import java.util.*;
public class stringhalvesalike{
    public static void main(String[] args) {
        String str="fial";
        System.out.println(halvesAreAlike(str));
        
    }
    public static boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>((Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O','U')));
     
        int left =0;
        int right = 0;
        for(int i=0;i<s.length()/2;i++){
             if(set.contains(s.charAt(i))){
                left++;
            }
            if(set.contains(s.charAt(s.length()-1-i))){
                right++;
            }
        
    }
        return left == right;
    }
}
