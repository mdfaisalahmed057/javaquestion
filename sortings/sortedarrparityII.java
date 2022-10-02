package sortings;

 
public class sortedarrparityII {
    public static void main(String[] args) {
        int nums[]={4,2,5,7};
        
        System.out.println(sortArrayByParityII(nums));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[even] = nums[i];
                even += 2;

            } else {
                ans[odd] = nums[i];
                odd += 2;
            }
        }
        return ans;
    }

}
