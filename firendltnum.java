
 import java.util.Scanner;
    public class firendltnum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=factor(6);
       int k= factor(5);
        System.out.println(k);
        if(a/6==k/5)
        {
System.out.println("fried");
        }
        
       
     }
    static int factor(int num){
        int sum=0;
        int i=1;
        while(num>0){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
        return sum;

 
    }
    
}
