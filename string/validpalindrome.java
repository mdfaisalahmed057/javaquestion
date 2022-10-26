import javax.swing.plaf.TextUI;

public class validpalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
             char start=s.charAt(i);
            char end=s.charAt(s.length()-1);
        
            if(start!=end)
                return false;
            else
                 return true;
            
        
        return false;
        

}
}
