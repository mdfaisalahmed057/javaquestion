
// // 494. Target Sum

// public class targetsum {
//     public static void main(String[] args) {
//         int nums[]={1,1,1,1,1};
//         int target=3;
//         System.out.println(findTargetSumWays(nums, target));
//     }
//     public static int findTargetSumWays(int[] nums, int target) {
//         return find(nums,target,0,0,0);
 
//     }
//     public static int find(int nums[],int target,int sum,int index,int count){
//         if(index==nums.length){
//              if(sum==target){
//               count ++;
//         }
//             return count;

//         }
        
//         int positive=find(nums,target,sum+nums[index],index+1,count);
       
//         int negative=find(nums,target,sum-nums[index],index+1,count);
//            return positive+negative;
//     }
// }

//revisit 


public class targetsum{
public static void main(String[] args) {
    
}
public static int findsum(int arr[],int target,int sum,int index,int count){
    if(index==arr.length){
        if(sum==target){
            count++;
        }
        return count;

    }
int positive=findsum(arr, target, sum+arr[index], index+1, count);
int negative=findsum(arr, target, sum-arr[index], index, count);
return positive+negative;

 }
}