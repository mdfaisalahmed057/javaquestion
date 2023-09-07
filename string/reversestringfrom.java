public class reversestringfrom {
    public static void main(String[] args) {
        String  word = "abcdefd";
        char  ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
    public static String reversePrefix(String word, char ch) {
int n=word.length();
int index=0;
for(int i=0;i<n;i++){
    if(word.charAt(i)==ch){
        index=i;
        break;
         
        
    }
}
 
StringBuilder sb=new StringBuilder(word.substring(0, index+1));
 sb.reverse();
 String res=sb.toString().concat(word.substring(index+1));
 return res;
        
    }
     
}
