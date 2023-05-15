// package arrrays;

// import java.util.Arrays;

// public class kthsmall {
//     public static void main(String[] args) {
//       int arr[]={1,2,3,4,5};
//       int k=3;
//  int ans=kthsmallest(arr);
//  System.out.println(ans-k);
//     }
//     static int kthsmallest(int arr[]){
//         int p=0;
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//     if(max<arr[i]){
//         max=arr[i];
//         p=i;
//         // System.out.println(p);
//     }
//         }
//         System.out.println(p);

//         return max;
//     }
  
// }

 
import java.util.Arrays;

public class kthsmall{
    public static void main(String[] args) {
        int arr[]={7,10,4,3 ,20, 15};
        int k=6;
        int ans=kthsmalla(arr, k);
        System.out.println(ans);
    }
    static int kthsmalla(int arr[],int k){
        Arrays.sort(arr);
        int ans= arr[k-1];
        return ans;
     }

}