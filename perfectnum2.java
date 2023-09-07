
import java.util.Arrays;
import java.util.Scanner;

public class perfectnum2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int n=28;
        int[] facts = factors(n);
        System.out.println(Arrays.toString(facts));
        int sum = sum(facts);

        if(sum==n){
            System.out.println("the number " +n + " is a perfect number" );
        }
        in.close();
        
    }

    private static int sum(int[] facts) {

        int sum = 0;
        for (int i = 0; i < facts.length; i++) {
            sum = sum + facts[i];
        }
        return sum;
    }

    private static int[] factors(int n) {
        int[] res = new int[n/2];

        int j = 0;
        int i = 1;
        while(i<n){
            if(n%i==0){
                    res[j]=i;
                    j=j+1;
            }
            i++;
        }
        return res;
    }
    
}