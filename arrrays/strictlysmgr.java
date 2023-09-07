 

import java.sql.Array;
import java.util.Arrays;

public class strictlysmgr {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,8,10,19};
        System.out.println(countElements(arr));
    }
    public static   int countElements(int[] nums) {
    Arrays.sort(nums);
    int n=nums.length,count=0;
    
        for(int i=1;i<n-1;i++){
            int low=0,high=n-1;
            while(low<high){
                if(nums[i]>nums[low] && nums[i]<nums[high]){
                    count++;
                    break;
                }
                low++;
            }
        }
        
        return count;
    }
}