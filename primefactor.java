import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
        System.out.println("enter the number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 2; i <= n; i++) {
                if(n%i==0)
                    if(isprime(i)){
                        System.out.println(i);
                    
                }
                else{
                    System.out.println("not a prime");
                }
            }
            // int x = in.nextInt();
            // if(isprime(x)){
            //     System.out.println("it is prime");
            // }
            // else{
            //     System.out.println("not prime");
            // }
        }
    }

    private static boolean isprime(int i) {

        int num= i;

        if(i<1){
            return false;


        }
        int j = 2;
       while(j*j<i){

            if(num%j==0){
                return false;
            }
            j++;
       }
       return true;
    }
}