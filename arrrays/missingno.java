import java.util.Arrays;

public class missingno {
    public static int missingNumber(int []a, int N) {
        int sum = N*(N+1)/2;
        for(int i: a){
            sum-=i;
        }
        return sum;
    
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
      System.out.println(missingNumber(arr, n));  
    }
}
