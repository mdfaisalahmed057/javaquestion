import java.util.Arrays;

public class maxmin {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,0};
        int n=arr.length;
String s="faisal";
s.toUpperCase()
        System.out.println(max(arr,n));
        
    }
      static int max(int arr[],int n) {
        if(n==1)
            return arr[0];
         return Math.min(arr[n-1],max(arr,n-1));//


    }
}
