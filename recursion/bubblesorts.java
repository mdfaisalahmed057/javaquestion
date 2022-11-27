import java.util.Arrays;

import java.util.Arrays;

public class bubblesorts {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        name(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
         }
    public static void name(int arr[],int r,int c) {
        if(r==0){
            return ;
        }
        if(c<r){

        if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        name(arr, r, c+1);
    } else {
        name(arr, r-1,0);
    }
 
    }
}















// public class bubblesorts{
//     public static void main(String[] args) {
//         int arr[]={2,3,1};
//         name(arr, arr.length-1, 0);
//         System.out.println(Arrays.toString(arr));
//          }
//     public static void name(int arr[],int r,int c) {
//         if(r==0){
//             return ;
//         }

//         if(c<r){

//         if(arr[c]>arr[c+1]){
//             int temp=arr[c];
//             arr[c]=arr[c+1];
//             arr[c+1]=temp;
//         }
//         name(arr, r, c+1);
//     }else{
//         name(arr, r-1, c);
//     }
 
//     }
// }