import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=28;
     for(int i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;
         }
    }
    if(sum==n){
        System.out.println("it is a perfect number");
    }else{
        System.out.println("not perfect");
    }
        
    }
    
}
