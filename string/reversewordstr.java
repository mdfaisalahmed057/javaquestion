public class reversewordstr{
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        System.out.println(reverseWords(str));
        
    }
    public  static String reverseWords(String s) {
        char ch[]=s.toCharArray();
        int start=0;
        int end;
        for(end=0;end<=ch.length;end++){
            if(end==ch.length || ch[end]==' '){
                reverse(ch,start,end-1);
                start=end+1;
                
            }
        }
                    return new String(ch);

    }
    static void reverse(char ch[],int start,int end){
        while(start<end){
            char temp=ch[end];
            ch[end]=ch[start];
            ch[start]=temp;
            start++;
            end--;
        }
    }
}
 