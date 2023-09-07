import java.util.Arrays;

// import java.util.*;

// public class threesum {
//     public static void main(String[] args) {
//         int nums[] = { -1, 0, 1, 2, -1, -4 };
//        System.out.println(threeSum(nums)); 
//         // ArrayList<Integer>set=new ArrayList<>();
//      }

//     public  static  List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> res = new HashSet<>();
//         if (nums.length == 0)
//             return new ArrayList<>(res);
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length - 2; i++) {
//             int j = i + 1;
//             int k = nums.length - 1;
//             while (j < k) {
//                 int sum = nums[i] + nums[j] + nums[k];
//                 if (sum == 0)
//                     res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
//         // . Arrays class is used to return a fixed-size list backed by the specified array
//                 else if (sum > 0)
//                     k--;
//                 else if (sum < 0)
//                     j++;
//             }

//         }
//          return new ArrayList<>(res);

//     }
// }
// //revisit



class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int ap = i+1;
            int bp = nums.length-1;
            
            while(ap<bp){
                int curSum = nums[i] + nums[ap] + nums[bp];
                if(curSum == target) return target;
                if(curSum > target) bp--;
                if(curSum < target) ap++;
                
                if(Math.abs(curSum - target) < Math.abs(result - target))
                 result = curSum;
            }
        }
        return result;
    }
}