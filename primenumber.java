import java.util.Scanner;
public class primenumber{
    public static void main(String[] args) {
int n=3;
boolean ans=  isprime(n);
System.out.println(ans);

    }
    static boolean isprime(int n){

        if(n<=1){
            return false;
        }

        int c=2;

        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            
            c++;
        }
        return c*c<n;
    }
}