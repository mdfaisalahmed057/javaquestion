public class findfirstpalindrme {
    public static void main(String[] args) {
       String words[] = {"abc","car","ada","racecar","cool"};
       System.out.println( firstPalindrome(words));
     }
    public static String firstPalindrome(String[] words) {
 return palin(words);

    }
    static String palin(String str[]){
        int i=0;
        int n=str.length;
        while(n>0){
            if(str[i]==str[n-1]){
                i++;
             }

        }
        return str[i];
    }
}
