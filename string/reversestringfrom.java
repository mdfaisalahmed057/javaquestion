public class reversestringfrom {
    public static void main(String[] args) {
        String  word = "abcdefd";
        char  ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
    public static String reversePrefix(String word, char ch) {
int n=word.length();
for(int i=0;i<n;i++){
    if(word.charAt(i)==ch){
        break;
        
        
    }
}
        return word;
        
    }
     
}
