package Arraylist;

import java.util.*;

public class threesumclosest {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1,2,1,1 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));

    }

    public static int threeSumClosest(int[] nums, int target){
        int close=nums[0]+nums[1]+nums[2];
 
        // Set<List<Integer>>ans=new HashSet<>();
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            // sum = nums[i] + nums[j] + nums[k];
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    return sum;
                }
                else if(sum>target){
                    k--;
                }else{
                    j++;
                }
                if(Math.abs(target-sum)<Math.abs(close-target)){
                    target=sum;
                }

            }

        }
        System.out.println(sum);
        return close;
    }

}
