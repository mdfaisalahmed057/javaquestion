// import java.util.*;
// public class sqastring {
// //     public static void main(String[] args) {
// //         int arr[]={-4,-1,0,3,10};
// //         System.out.println(sortedSquares(arr));
        
// //     }
// //     public static int[] sortedSquares(int[] nums) {
// //          for(int i=0;i<nums.length;i++){
// //             nums[i]=nums[i]*nums[i];

// //          }
// // Arrays.sort(nums);
// // System.out.println(Arrays.toString(nums));
// //         return  nums;
        
// //     }

// }
    

// optimized version



import java.util.*;
public class sqastring {
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        System.out.println(sortedSquares(arr));
    }
    public static int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int res[]=new int[nums.length];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[index]=nums[left]*nums[left];
                left++;
            }
            else{
                res[index]=nums[right]*nums[right];
                right--;
            }
            index--;

        }
        return res;
    }

}
