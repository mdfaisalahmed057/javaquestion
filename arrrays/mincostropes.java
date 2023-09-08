 
import java.lang.reflect.Array;
import java.util.Arrays;

public class mincostropes {
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
<<<<<<< HEAD
=======
        
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
        Arrays.sort(arr);// 2,3,4,6
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum+arr[i] ;// 2+3=5//9
            ans = sum + arr[i]; // 4+5==9

            // sum = ans;//9

        }
        System.out.println(ans);
        System.out.println(sum);


    }

}