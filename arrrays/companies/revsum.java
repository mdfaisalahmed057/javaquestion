package arrrays.companies;

public class revsum {
    public static void main(String[] args) {
        int num=21;
        int ans=name(num);
        if(ans>num){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
        System.out.println(ans);
        
    }
    public static int name(int num) {
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
         }
          return rev;
     }

    
}
