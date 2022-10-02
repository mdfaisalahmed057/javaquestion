// package sortings;

// import java.util.Arrays;

// public class makezerobysubtracting {
//     public static void main(String[] args) {
//         int arr[] = { 1, 5, 3, 5 };
//          Arrays.sort(arr);
//          System.out.println(arr);

//        System.out.println(zero(arr)); 
//     }
//     static int zero(int nums[]){
//         Arrays.sort(nums);
//          int currSub = 0;
//         int count = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]-currSub > 0){
//                 System.out.println(nums[i]);
//                 currSub = nums[i];
//                  count++;
//                 //  System.out.println(count);
//             }
//         }
//         return count;
//     }

//     // static int zerodivide(int arr[]) {
//     //     int ans = arr[0];
//     //     for (int i = 0; i < arr.length; i++) {
//     //         if (arr[i] < ans) {
//     //             ans = arr[i];
//     //         }

//     //     }
//     //     System.out.println(ans);

//     //     return -1;
//     // }

// }

// // using hashing 
// // public int minimumOperations(int[] nums) {
// //     Set<Integer> set = new HashSet<>();
// //     for (int a: nums)
// //         if (a > 0)
// //             set.add(a);
// //     return set.size();
// // }


package sortings;

import java.util.HashSet;

// import java.util.Arrays;

// public class makezerobysubtracting{
//     public static void main(String[] args) {
//         int arr[]={3,2,1,4,2,1};
//         System.out.println(thirdmax(arr)); 
        
//     }
//     static int thirdmax(int arr[]){
//          //1,2,3
//          int ans=0;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>arr[i+1]){
//                 ans=arr[i+1];
//               }else{
//                 ans=arr[i];
//               }

//         }
//          return ans;
//     }
// }

public class makezerobysubtracting{
    public static void main(String[] args) {
        int arr[]={3,2,1,4,2,1};
                System.out.println(makezero(arr)); 
        
    }
    static int makezero(int arr[]){
        int count=0;
        for(int n:arr){
            HashSet<Integer>set=new HashSet<>();
          if( set.contains(n)) {
            count++;

           }

         }
        return count;
    }
}