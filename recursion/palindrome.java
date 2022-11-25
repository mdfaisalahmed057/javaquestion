public class palindrome{
    public static void main(String[] args) {
        int n=121;
        System.out.println(name(n));
       
     }
     public static int name(int n) {
         int rev=0;
        while(n>0){
              rev=n%10+rev*10;//on 0th position 1 will come
            n=n/10;
        }
        return rev;
        
     }
   
}