public class findfirstpalindrme {
    public static void main(String[] args) {
       String words[] = {"abc","car","ada","racecar","cool"};
       System.out.println( firstPalindrome(words));
     }
    public static boolean firstPalindrome(String[] words) {
       for(int i=0;i<words.length;i++){
        String str=words[i];
        System.out.println("this is under for loop"+" "+str);
          StringBuilder sb=new StringBuilder();
        sb.append(str);
        if(str==sb.reverse().toString()){
            System.out.println("this is palindtome");
         }else{
            System.out.println("not a palindrome");
         }
        }
       return false;
          
    }
     
}
