 
public class reversefrom {
    public static void main(String[] args) {
        String s="abcdef";
        char d='d';
        System.out.println(reversePrefix(s, d));
    }
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
         StringBuilder sb=new StringBuilder(word.substring(0, index+1));
        sb.reverse();
        return sb.toString().concat(word.substring(index+1));
}
}
