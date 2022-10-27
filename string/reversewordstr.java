public class reversewordstr{
    public static void main(String[] args) {
        String str="contest";
        int k=2;
        System.out.println(reverseSt(str,k));
        
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
    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0 ; i <= n-1; i += 2*k){
            if(i+k-1 <= n-1){
                reverseK(i,i+k-1,str);
            }else{
				//for fewer than k characters left (edge case)
                reverseK(i,n-1,str);
            }
        }
        String ans = new String(str);
        return ans;
    }
    public static void reverseK(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
    public static String reverseSt(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
             swap(arr, i, j);
            i += 2 * k;
         }
        return String.valueOf(arr);
    
     }
    private static void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

}
 