import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 2089. Find Target Indices After Sorting Array
public class targetindices {
    public static void main(String[] args) {
        int arr[]={1,2,5,2,3};
        int target=2;
        System.out.println(targetIndices(arr, target));
        
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
         List<Integer>ans=new ArrayList<>();
        Arrays.sort(nums);//1,2,2,3,5
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            ans.add(i);

         }

       }
           return ans;
        
    }
    
}
